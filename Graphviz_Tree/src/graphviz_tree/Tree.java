/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphviz_tree;

import java.util.ArrayList;
import java.io.File;

/**
 *
 * @author Me
 */

class TreeNode {
    
    int value;    
    ArrayList<TreeNode> children;

    TreeNode(int newData) {
      children = new ArrayList<>();
      value = newData;
    } 
  } 

public class Tree {                        
    
     private TreeNode root; 
    GraphViz graphBuilder = new GraphViz();      
    
     public Tree() {
    root = null; 
    graphBuilder.addln(graphBuilder.start_graph());
     }
    
     public TreeNode findRecursive(int data) { 
    return(findRecursive(root, data)); 
  }     
  
  //Methods overload
  TreeNode result = null;
  private TreeNode findRecursive(TreeNode node, int lookedVaue) { 
    if (node==null) 
      result = null;      

    if (lookedVaue == node.value)        
      result = node; 
          
    for(TreeNode tmp: node.children)    
      findRecursive(tmp, lookedVaue); 
    
    return result;
  }      
    
  public void insertTreeNode(int value, int father)
  {      
      root = insertTreeNode(root, value, father);
  }
  
  
    
  private TreeNode insertTreeNode(TreeNode node, int value, int father)
  {              
      if(node == null)
          node = new TreeNode(value);                                                                                             
      else 
      {          
          TreeNode nodeFather = findRecursive(father);
          if(nodeFather != null)          
              nodeFather.children.add(new TreeNode(value));
          else
              node.children.add(new TreeNode(value));
      }
      return node;
  }
  
  //Return node number, looking it as its value
  public int findTreeNode(int valueTreeNode)
  {      
      return visitedNodes.indexOf(valueTreeNode);
  }
  
  public void finalizeGraph()
  {
      System.out.println("\n");
      graphBuilder.addln(graphBuilder.end_graph());
          System.out.println(graphBuilder.getDotSource());
          
          String type = "gif";
          File out = new File("tree." + type);
          graphBuilder.writeGraphToFile(graphBuilder.getGraph(graphBuilder.getDotSource(), type), out);
  }
  
  static int treeNodesCounter = 0;
  static int nullsCounter = 0;
  static ArrayList<Integer> visitedNodes = new ArrayList<>();
  private void findTreeNodes(TreeNode node, Tree tree)
  {
      if(node != null)
      {
          //System.out.println("\nIm in the node " + node.value + " ");
          String nullValue = "null";
          //Node cration
          graphBuilder.addln(String.format(
                  "%d [ label=<%d> ]", treeNodesCounter, node.value));                         
          visitedNodes.add(node.value);  
          //System.out.println("New node registered: " + node.value + " with index: " + treeNodesCounter);
          treeNodesCounter++;
          
          for(TreeNode tmp: node.children)
          {
            if(tmp == null)
            {
                nullValue = "null" + nullsCounter;
                nullsCounter++;
                graphBuilder.addln(String.format("%s[shape=point]", nullValue));                                       
            }                        
            findTreeNodes(tmp, tree);                                            
          }
      }
  }      
  static int newNullsCounter = 0;
  public void asignFatherToSon(TreeNode node, Tree tree)
  {
      if(node != null)
      {         
          for(TreeNode tmp: node.children)
          {
              if(tmp != null)
                  //Adding the left child to the graph
                  graphBuilder.addln(String.format(
                      "%d -> %d", findTreeNode(node.value), findTreeNode(tmp.value)));   
              else
                  graphBuilder.addln(String.format(
                      "%d -> %s", findTreeNode(node.value), "null" + newNullsCounter++));                                                                
              asignFatherToSon(tmp, tree);             
          }
      }
  }
  
  public void graphTree(Tree tree)
  {            
      graphBuilder.addln("ordering = out");  
      findTreeNodes(root, tree);                 
      asignFatherToSon(root, tree);
      finalizeGraph();
  }

  static int size = 0;
  public int getSize(TreeNode node, Tree tree)
  {
      if(node != null)
      {
          size++;
          for(TreeNode tmp: node.children)
            getSize(tmp, tree);                    
      }
      return size;
  }
  
 
    public static void main(String[] args) {
        // TODO code application logic here                                        
        Tree tree1 = new Tree();
        tree1.insertTreeNode(4, 0);
        tree1.insertTreeNode(23, 4);                   
        tree1.insertTreeNode(14, 4);
        tree1.insertTreeNode(24, 4);
        tree1.insertTreeNode(34, 4);
        tree1.insertTreeNode(44, 4);
        tree1.insertTreeNode(54, 4);
        tree1.insertTreeNode(64, 4);
        tree1.insertTreeNode(17, 23);
        tree1.insertTreeNode(7, 34);
        tree1.insertTreeNode(8, 34);
        tree1.insertTreeNode(9, 34);
        tree1.insertTreeNode(1, 7);
        tree1.insertTreeNode(2, 7);
        tree1.insertTreeNode(3, 7);        
        tree1.insertTreeNode(5, 7);
        tree1.insertTreeNode(6, 7);
        tree1.graphTree(tree1);   
        System.out.println("Tree size is: " + tree1.getSize(tree1.root, tree1));
    }    
    
   
  }             
