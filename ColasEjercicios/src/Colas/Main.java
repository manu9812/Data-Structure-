package Colas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		
		EjerciciosColas ec = new EjerciciosColas();
		int opcion;
		do {
			opcion = Opciones();
			switch (opcion) {
				case 0:
					System.out.println("Bye");
					break;
				case 1:
					ec.Banco();
					break;
				case 2:
					ec.Invertir();
					break;
				case 3:
					ec.biColas();
					break;
				default:
					System.out.println("Opcion inexistente, intente de nuevo");
					break;
			}
			
		}while(opcion != 0);

	}
	
	public static int Opciones() 
	{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int opcion = 0;
		System.out.println("Escoja una opcion: \n1. Banco \n2. Invertir cola \n3. Métodos basicos bicola \n0. Salir");
		try {
			opcion = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return opcion;
	}

}
