import java.util.*;

import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		
		ArrayList<String>cadenas;
		cadenas= new ArrayList<String>();
		String frase, respuesta;
		
		do
		{
			frase=JOptionPane.showInputDialog(null, "ingresa la frase");
			// agregando la frase a la lista
			cadenas.add(frase);
			respuesta=JOptionPane.showInputDialog(null, "deseas ingresar otra frase (SI/NO");
			respuesta= respuesta.toUpperCase();
		}while(!respuesta.equals("NO"));
		// MOSTRANDO EL CONTENIDO DE CADENAS
		
		System.out.println(" frases originales");
		for(int i=0; i<cadenas.size(); i++)
		{
			System.out.println(cadenas.get(i));
		}
		// utilizando el metodo set
		
		System.out.println("frases modificadas ");
		cadenas.set(1, "la que modifique");
		for(int i=0; i<cadenas.size(); i++)
		{
			System.out.println(cadenas.get(i));
		}
		cadenas.remove(0);
		System.out.println("frases que nos quedan ");
		for(int i=0; i<cadenas.size(); i++)
		{
			System.out.println(cadenas.get(i));
		}

	}

}
