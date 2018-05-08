package node;

import java.io.IOException;

public class Stack {
    
    Node head =null;//empty list
    /**
     * methods are created to handle all the elements of the stacks as if
     * empty, push and pop
     * @return 
     */
    public Node Pop(){
        Node temp = head;
        head =head.next;
        return temp;
    }
    /**
     * 
     * @return 
     */
    public boolean isEmpty(){ 
        return head == null ? true : false;
    }
    /**
     * 
     * @param newNode 
     */
    public void Push(Node newNode){
        newNode.next = head;
        head = newNode;
    }
    /**
     * in the main, each of the functions is tested with a stack called 
     * students
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException{
        Stack students = new Stack();
        students.Push(new Node("alum1",11,1111));
        students.Push(new Node("alum2",12,2222));
        students.Push(new Node("alum3",13,3333));
        
        System.out.println(students.Pop().toString());
        System.out.println(students.Pop().toString());
        System.out.println(students.Pop().toString());
    }
}