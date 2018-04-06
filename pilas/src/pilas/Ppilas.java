package pilas;

import java.util.Scanner;
import java.util.Stack;

public class Ppilas {
	
	static Scanner entrada= new Scanner (System.in); // crear el Scanner 

	static Stack<Integer> insPila(Stack<Integer> heap, int num) { // crear la pila inicial
		Stack<Integer> pila = new Stack<Integer>(); // crear nueva pila 
		while (!heap.isEmpty()) {    // saber si hay información en la pila
			pila.push(heap.pop());   // pop para vaciar la pila 
		}
		heap.push(num);  // ingresar elem
		while (!pila.isEmpty()) {  // si la pila no esta vacia 
			heap.push(pila.pop()); // eliminar elementos de la pila
		}
		return heap; // retornar la pila
	}
	
	public static void mostPila(Stack<Integer> heap) { // función para mostrar la pila 
		while (!heap.isEmpty()) { 
			System.out.println(heap.pop() + " ");
		}
	}
	
	
	
	public static void main(String arg[]) {
		
		entrada = new Scanner(System.in);
		
		Stack<Integer> pila = new Stack<Integer>(); // se crea la pila
		
		System.out.println("cuantos datos desea ingresar en la pila:"); // pedir datos por consola
		
		int I = entrada.nextInt();
		int[] help = new int [I]; // crear una variable auxiliar 
		for (int i = 0; i < I; i++) { // ingresar datos e introducirlos en la pila 
			System.out.println("ingrese el dato numero:  "  +   i);
			int fact= entrada.nextInt();
			pila.push(fact);
			help[i] = fact;
		}
		System.out.println("pila inicial:"); // mostar la pila con los datos ingresados 
		mostPila(pila);
		for (int i = 0; i < help.length; i++) {
			pila.push(help[i]);  
		}
		System.out.println("ingrese el nuevo dato que desea añadir a la pila:");
		pila = insPila(pila, entrada.nextInt());
		System.out.println("la pila final es :");
		mostPila(pila);
		
	}
	
}

