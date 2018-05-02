import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;


public class Situaciones {
	
	public void Pilas() throws NumberFormatException, IOException 
	{
		ArrayList<Stack<Integer>> contenedorPilas;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		Random rnd = new Random();
		
		int nPilas;
		int operacionesPilas[];
		System.out.print("ingrese la cantidad de pilas deseadas  ");
		nPilas = Integer.parseInt(br.readLine());
		
		contenedorPilas = Pilas(nPilas);
		operacionesPilas = new int[nPilas];
		
		int ejecucion;
		int tipoOperacion;
		int pilaEjecucion;
		do {
			System.out.println("Elija una opcion \n1. Operar \n2. finalizar");
			ejecucion = Integer.parseInt(br.readLine());
			pilaEjecucion = rnd.nextInt(nPilas);
			tipoOperacion = rnd.nextInt(3);
			switch (tipoOperacion) {
			case 1://Agregar
				contenedorPilas.get(pilaEjecucion).push(rnd.nextInt(100));
				operacionesPilas[pilaEjecucion] += 1;
				break;
	
			case 2://Eliminar
				if(!contenedorPilas.get(pilaEjecucion).isEmpty()) {
					contenedorPilas.get(pilaEjecucion).pop();
				}
				operacionesPilas[pilaEjecucion] += 1;
				break;
			default:
				break;
			}
			
			
		}while(ejecucion != 2);
		
		//Buscar con mayor operaciones
		int mayorOp = 0;
		int posicionMayor = 0;
		for(int i=0; i<nPilas; i++) {
			if(mayorOp < operacionesPilas[i]) {
				mayorOp = operacionesPilas[i];
				posicionMayor = i;
			}
		}
		
		//Imprimir la pila con mayor operaciones
		
		System.out.println("la pila con mas trabajo es "+ contenedorPilas.get(posicionMayor));
		for (int i=0; i<contenedorPilas.size(); i++) {
			if(i == posicionMayor) {
				System.out.println("la pila con mas trabajo es  "+ contenedorPilas.get(i));
			}
			else {
				System.out.println(contenedorPilas.get(i));
			}
		}
	}
	
	public ArrayList<Stack<Integer>> Pilas(int cantPilas) {
		ArrayList<Stack<Integer>> contenedorPilas =  new ArrayList<Stack<Integer>>();
		Stack<Integer> pilas;
		for(int i=0; i<cantPilas; i++) {
			pilas = new Stack<Integer>();
			contenedorPilas.add(pilas);
		}
		
		return contenedorPilas;
	}
	
	
	public void parentesisEquilibrados() throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> Parentesis =  new Stack<Character>();
		String secuenciaParentesis = "";
		String secuencia;
		
		System.out.println("Ingrese una secuencia de caracteres");
		secuencia = br.readLine();
		
		for(int i=0; i<secuencia.length(); i++) {
			char analizaPts= secuencia.charAt(i);
			if(isParentesis(analizaPts) != 0) {
				secuenciaParentesis += analizaPts;
			}
		}

		int sizeList = secuenciaParentesis.length();

		if(sizeList%2 == 0) {
			for(int i=0; i<sizeList; i++) {
				if(isParentesis(secuenciaParentesis.charAt(i))%2 != 0) {
					Parentesis.push(secuenciaParentesis.charAt(i));
				}
				else if(isParentesis(secuenciaParentesis.charAt(i))%2 == 0) {
					if(Parentesis.isEmpty()) {
						System.out.println("Falta el  parentesis de apertura");
						return;
					}
					if(isParentesis(Parentesis.peek())==isParentesis(secuenciaParentesis.charAt(i))-1) {
						Parentesis.pop();
					}else {
						System.out.println("Hay un error en los parentesis, hay solapamiento");
						return;
					}
				}
			}						
			System.out.println("Los parentesis estan equilibrados");

		}else {
			System.out.println("Hay un error en los parentesis, parentesis incompletos");
		}
		
	}
	
	private int isParentesis(char caracter) 
	{	
		switch (caracter) {
			case '(':
				return 1;
				
			case ')':
				return 2;
				
			case '[':
				return 3;
				
			case ']':
				return 4;
				
			case '{':
				return 5;
				
			case '}':
				return 6;
				
			case '<':
				return 7;
				
			case '>':
				return 8;
				
			default:
				return 0;
		}
	}
}
