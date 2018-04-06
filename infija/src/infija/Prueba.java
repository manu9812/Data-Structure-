package infija;

import java.util.Scanner;

public class Prueba {
	
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		 
		System.out.println("Introduzca operacion infija\n");
		String infija=in.next();
		String prefija= Convertidor.convertirAprefija(infija);
		 
		String postfija= Convertidor.convertirApostfija(infija);
		System.out.print("Expresion en notación postfija: "+postfija+"\n");
		System.out.print("Expresion en notación prefija: "+prefija+"\n");
		 
		}

}
