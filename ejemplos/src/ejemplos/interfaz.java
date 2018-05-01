/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;
import javax.swing.*;
/**
 *
 * @author manuela garcia
 */
public class interfaz {
    public static void main(String []args)
    {
        int n, arreglo[];
        n= Integer.parseInt(JOptionPane.showInputDialog("limite del arrelo"));
        arreglo= new int[n];
        for (int i=0; i<n;i++)
        {
            arreglo[i]= Integer.parseInt(JOptionPane.showInputDialog("valor"+ (i+1)));
            
        }
         for (int i=0; i<n;i++)
         {
             System.out.println(arreglo[i]);
         }
    }
    
}
