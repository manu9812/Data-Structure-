package arreglosED;



import java.util.*;

import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		
		int numeros[]= new int[10];
		int numerotes[]= new int [numeros.length];
		String palabras[] =new String[10];
		int i;
		for( i=0; i<10; i++) {
		
		numeros[i]= Integer.parseInt(JOptionPane.showInputDialog
				(null, "ingrese el indice" + i));

	}
		System.out.println("los datos sin ordenar son:");
		for (i=0; i<10; i++)
		{
			
			System.out.print("[" + numeros[i] +  "]");
		}
	
  System.out.println("\nlos datos ordenados son:");
  Arrays.sort(numeros); // aqui ordenamos al arreglo numeros
  
  
  for (i=0; i<10; i++)
	{
		
		System.out.print("[" + numeros[i] +  "]");
	}
  
  // rellenando al arreglo palabras
  Arrays.fill(palabras, "\nme encanta programar ");
  System.out.println("elementos del arreglo palabras");
  for (i=0; i<10; i++)
  {
	  System.out.print("" + palabras[i] +  ""); 
  }
  
  //copiando los elementos del arreglo numeros a numerotes
  System.arraycopy(numeros, 0, numerotes, 0, numeros.length);
  System.out.println("\nelementos del arreglo numerotes");
  for (i=0; i<10; i++)
  {
	  System.out.print("[" + numerotes[i] +  "]"); 
  }
  }
}
