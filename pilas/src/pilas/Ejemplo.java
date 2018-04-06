package pilas;

import java.util.Stack;

public class Ejemplo {

	public static void main(String[] args) {
Stack < String > pila = new Stack < String > ();
        
        //apila 3 elementos
        pila.push("elemento1");
        pila.push("elemento2");
        pila.push("elemento3");
        System.out.println("1- push: " + pila);
        
        //retira elemento que esta en la cima de la pila
        pila.pop();
        System.out.println("2- pop: " + pila);
        
        //devuelve el elemento que esta en la cima de la pila
        String x = pila.peek();
        System.out.println("3- peek: " + x);
        
        //devuelve cierto si la pila esta vacia
        boolean y = pila.empty();
        System.out.println("4- empty: " + y);

	}

}
