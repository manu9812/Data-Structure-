/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author manuela garcia
 */
public class ejemplo2 {
    public static void main (String []args)
    {
       Scanner entrada= new Scanner(System.in);
       int[] arreglo = new int[20];
       int i, limite;
       
        System.out.println(" ingrese el limite del arreglo");
        limite=entrada.nextInt();
        for(  i=0; i<limite; i++)
        {
            System.out.println(" elemento "+  (i+1) + ":");
            arreglo[i]= entrada.nextInt();
           
        }
        for (i=0; i<limite;i++)
        {
            System.out.print(arreglo[i]+ ",");
        }
      
    }
    
}
