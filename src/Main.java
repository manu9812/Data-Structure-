import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	
	
	public static int opciones() throws NumberFormatException, IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int opcion;		
		System.out.println("que desea realizar  \n1. Pilas \n2. Parentesis equilibrados \n0. Salir");
		opcion = Integer.parseInt(br.readLine());
		
		return opcion;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Situaciones situa = new Situaciones();
		int opcion;
		do {
			opcion = opciones();
			switch (opcion) {
			case 0:System.out.println("el programa ha finalizado ");
				break;

			case 1:
				situa.Pilas();
				break;
				
			case 2:
				situa.parentesisEquilibrados();
				break;
				
			default:
				System.out.println("la sintaxis de los datos ingresados esta mal, verifique e intentelo nuevamente ");
				break;
			}
		}while(opcion != 0);

	}

}
