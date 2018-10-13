package listasenlazadas;


import javax.swing.*;
import java.util.*;
class Auxiliar
{
        public static void main (String[] args)
        {
                LinkedList<String> myList=new LinkedList<String>();
                LinkedList<String> myList1=new LinkedList<String>();
                
                Integer menu;

                do{
                        menu = Integer.parseInt(JOptionPane.showInputDialog("Menu\n\n1 Insertar ala izquierda\n2 Insertar a la derecha\n3 Eliminar a la izquierda\n4 Eliminar a la derecha\n5 Borrar toda la lista\n6 Salir"));
                        switch (menu)
                        {       
                                case 1:
                                        myList.addLast(JOptionPane.showInputDialog("introduce el valor a agregar"));
                                        JOptionPane.showMessageDialog(null,""+myList);
                                        myList.addLast(JOptionPane.showInputDialog("introduce el valor a agregar"));
                                        JOptionPane.showMessageDialog(null,""+myList1 +": " + myList);
                                        myList.addLast(JOptionPane.showInputDialog("introduce el valor a agregar"));
                                        JOptionPane.showMessageDialog(null,""+myList1 +": "+ myList);
                                        myList.addLast(JOptionPane.showInputDialog("introduce el valor a agregar"));
                                        JOptionPane.showMessageDialog(null,""+myList1 + ": " + myList);
                                        
                                        break;  
                                case 2:
                                        myList.addLast(JOptionPane.showInputDialog("introduce el valor a agregar"));
                                        JOptionPane.showMessageDialog(null,""+myList);
                                        break;
                                case 3: 
                                        myList.removeFirst();
                                        JOptionPane.showMessageDialog(null,""+myList);
                                        break;
                                case 4:
                                        myList.removeLast();
                                        JOptionPane.showMessageDialog(null,""+myList);
                                        break;
                                case 5:
                                        myList.clear(); 
                                        JOptionPane.showMessageDialog(null,""+myList+"Lista Vacia");
                                        //System.exit(0);
                        }
                 
                } while(menu!=6);
                System.exit(0);
        }
}