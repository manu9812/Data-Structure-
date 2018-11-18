package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 
 * @author Manuela García
 *
 */
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		PuntosImpares pI = new PuntosImpares(); 
		
		int opcion;
		do {
			opcion = opcion();
			switch (opcion) {
			case 0:
				System.out.println("Fin del programa");
				break;

			case 1:
				pI.punto1();
				break;
				
			case 2:
				pI.punto2();
				break;
				
			case 3:
				pI.punto3();
				break;
				
			case 4:
				pI.punto4();
				break;
				
			case 5:
				pI.punto5();
				break;

			default:
				break;
			}
			
		}while(opcion != 0);

	}
	
	public static int opcion() 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int opcion = 0;
		System.out.println("1. punto 1 \n2. punto 3 \n3. punto 5 \n4. punto 7 \n5. punto 9 \n0. salir");
		try {
			opcion = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return opcion;
	}

}
