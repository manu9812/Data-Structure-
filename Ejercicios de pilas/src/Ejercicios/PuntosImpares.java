package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
/**
 * Clase con los puntos impares del pdf
 * @author Manuela García
 *
 */
public class PuntosImpares {

	/**
	 * Punto 1 del pedf
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public void punto1() throws NumberFormatException, IOException 
	{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		Stack<Integer> pila = new Stack<Integer>();
		Stack<Integer> pAuxiliar = new Stack<Integer>();
		
		System.out.println("Punto 1");
		
		for(int i=0; i<5; i++) {//Le pido al usuario que ingrese a la pila 5 datos
			System.out.print("Ingresa un numero para la pila:  ");
			pila.push(Integer.parseInt(br.readLine()));
		}System.out.println();
		
		System.out.println("Pila = "+pila);//Imprimo la pila
		while(!pila.isEmpty()) {//Mientras la pila no este vacia paso lo de la pila a pAuxilia		
			pAuxiliar.push(pila.pop());
		}
		
		System.out.print("Ingresa un numero:  ");
		pila.push(Integer.parseInt(br.readLine()));//Agrego el dato nuevo al inicio de la pila
		for(int i=0; i<5; i++) {//Paso a pila lo que esta en pAuxiliar
			pila.push(pAuxiliar.pop());
		}
		System.out.println("Nueva Pila = "+pila);//imprimo la pila con el nuevo dato
		
	}
	/**
	 * Punto 3 del pdf
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public void punto2() throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		Stack<Integer> pilaA = new Stack<Integer>();//Pila A
		Stack<Integer> pilaB = new Stack<Integer>();//Pila B
		Stack<Integer> pilaC = new Stack<Integer>();//Pila C = Pila A u Pila B
		
		System.out.println("Pila C = {pila A u pila B}");
		
		int A, B, dato;
		
		System.out.println("Cuantos elementos desea para la pila A:  ");
		A = Integer.parseInt(br.readLine());//Le pregunto al usuario la cantidad de datos para la pila A
		for(int i=0; i<A; i++) {//Ciclo deacuerdo de la cantidad de datos que se valla a introducir en la pila A
			boolean repetido;
			System.out.print("Ingrese un dato sin repetir:  ");
			do {//mientras el dato a ingresar este repetido realiza un ciclo
				dato = Integer.parseInt(br.readLine());//El usuario ingresa el dato
				repetido = isRepetido(dato, pilaA);//Con la funcion isRepetido para saber si el dato introducido esta repetido en la pila
				if(!repetido) {//Si no esta repetido lo agrego a la pila
					pilaA.push(dato);
				}else {//Si esta repetido mensaje-ciclo
					System.out.print("Dato repetido intentelo de nuevo:  ");
				}
			}while(repetido);
		}
		
		System.out.println("Cuantos elementos desea para la pila B");
		B = Integer.parseInt(br.readLine());//Numero con la cantidad de datos a ingresar en la pila
		for(int i=0; i<B; i++) {//Ciclo deacuerdo de la cantidad de datos que se valla a introducir en la pila B
			boolean repetido;
			System.out.print("Ingrese un dato sin repetir:  ");
			do {//mientras el dato a ingresar este repetido realiza un ciclo
				dato = Integer.parseInt(br.readLine());//El usuario ingresa el dato
				repetido = isRepetido(dato, pilaB);//Con la funcion isRepetido para saber si el dato introducido esta repetido en la pila
				if(!repetido) {//Si no esta repetido lo agrego a la pila
					pilaB.push(dato);
				}else {//Si esta repetido mensaje-ciclo
					System.out.print("Dato repetido intentelo de nuevo:  ");
				}
			}while(repetido);
		}
		System.out.println("pila A = "+pilaA+"\npila B = "+pilaB);//Imprimo pilaA y pilaB
		pilaC = union(pilaA, pilaB);//Hago la union mediante la funcion union que me retorna la union de dos pila
		System.out.println("pila C ="+pilaC);//Imprimo la pila C
	}
	/**
	 * Esta funcion hace parte del punto 2 la cual se encarga de la union de dos pilas
	 * Retorna la union de dos pilas
	 * @param pilaA
	 * @param pilaB
	 * @return
	 */
	public Stack<Integer> union(Stack<Integer> pilaA,Stack<Integer> pilaB){
		Stack<Integer> pilaUnion = new Stack<Integer>();//Pila que tendra la union de las dos pilas 
		Stack<Integer> pAuxiliar = new Stack<Integer>();//Pila auxiliar
		
		int dato;
		boolean repetido;
		while(!pilaB.isEmpty()) {//Invierto la pila B con ayuda de pAuxiliar
			pAuxiliar.push(pilaB.pop());
		}
		while(!pAuxiliar.isEmpty()) {//Mientras pAuxiliar no este vacia
			dato = pAuxiliar.pop();//dato toma el valor del elemento mas alto de la pila que al mismo tiempo es eliminado de la pila
			repetido = isRepetido(dato, pilaA);//Verifico si el dato esta repetido en la pilaA
			if(!repetido) {//Si no esta repetido lo añado la pilaUnion
				pilaUnion.push(dato);
			}//En caso contrario el dato se ignora 
		}
		
		while(!pilaA.isEmpty()) {//Invierto la pila A
			pAuxiliar.push(pilaA.pop());
		}
		while(!pAuxiliar.isEmpty()) {//Termino de agregar a pilaUnion la pilaA 
			pilaUnion.push(pAuxiliar.pop());
		}
		
		return pilaUnion;
	}
	/**
	 * Punto 5 del pdf
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public void punto3() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		Stack<Integer> pilaA = new Stack<Integer>();//Pila A
		Stack<Integer> pilaB = new Stack<Integer>();//Pila B
		Stack<Integer> pilaC = new Stack<Integer>();// Pila C = {pila A-pila B}u{pila B - pila A}
		
		System.out.println("Pila C = {pila A-pila B}u{pila B - pila A}");
		
		int A, B, dato;
		
		System.out.println("Cuantos elementos desea para la pila A:  ");
		A = Integer.parseInt(br.readLine());//Cantidad de elementos para la pila A
		for(int i=0; i<A; i++) {//Ciclo cantidad de datos
			boolean repetido;
			System.out.print("Ingrese un dato sin repetir:  "); 
			do {//Mientras el dato a ingresar este repetido
				dato = Integer.parseInt(br.readLine());//Dato ingresado por el usuario
				repetido = isRepetido(dato, pilaA);//Compruebo con la funcion si el dato esta repetido en la pila
				if(!repetido) {//Si no esta repetido lo añade a la pila
					pilaA.push(dato);
				}else {//Si no mensaje-ciclo
					System.out.print("Dato repetido intentelo de nuevo:  ");
				}
			}while(repetido);
		}
		
		System.out.println("Cuantos elementos desea para la pila B");
		B = Integer.parseInt(br.readLine());//Cantidad de elementos para la pila B
		for(int i=0; i<B; i++) {//Ciclo cantidad de datos
			boolean repetido;
			System.out.print("Ingrese un dato sin repetir:  ");
			do {//Mientras el dato a ingresar este repetido
				dato = Integer.parseInt(br.readLine());//Dato ingresado por el usuario
				repetido = isRepetido(dato, pilaB);//Compruebo con la funcion si el dato esta repetido en la pila
				if(!repetido) {//Si no esta repetido lo añade a la pila
					pilaB.push(dato);
				}else {//Si no mensaje-ciclo
					System.out.print("Dato repetido intentelo de nuevo:  ");
				}
			}while(repetido);
		}
		System.out.println("pila A = "+pilaA+"\npila B = "+pilaB);//Imprimo la pila A y la pila B
		pilaC = unionNoComunes(pilaA, pilaB);//Hago la union de las dos pilas con la funcion que retorna la pila unida 
		System.out.println("pila C = "+pilaC);//Imprimo la pila C
	}
	/**
	 * 
	 * @param pilaA
	 * @param pilaB
	 * @return
	 */
	public Stack<Integer> unionNoComunes(Stack<Integer> pilaA,Stack<Integer> pilaB){
		Stack<Integer> pilaUnion = new Stack<Integer>();//Pila con la union de las dos pilas
		Stack<Integer> pAuxiliar = new Stack<Integer>();//Pila auxiliar
		
		int dato;
		boolean repetido;
		while(!pilaB.isEmpty()) {//Invierto la pila B en auxiliar
			pAuxiliar.push(pilaB.pop());
		}
		while(!pAuxiliar.isEmpty()) {//Mientras la pila pAuxiliar no este vacia
			dato = pAuxiliar.pop();//A dato le agrego el numero del tope de la pAuxiliar
			repetido = isRepetido(dato, pilaA);//Rebido si el dato esta repetido con la pila A
			if(!repetido) {//Si no esta repetido agrego el dato a la pilaUnion
				pilaUnion.push(dato);
			}else//si esta repetido
				pilaA.removeElement(dato);//Remuevo ese dato de la pila A, Ademas dato no es agregado
		}
		
		while(!pilaA.isEmpty()) {//Invierto la pila A
			pAuxiliar.push(pilaA.pop());
		}
		while(!pAuxiliar.isEmpty()) {//Agrego la pila A a la pilaUnion
			pilaUnion.push(pAuxiliar.pop());
		}
		
		return pilaUnion;
	}
	/**
	 * Punto 7 del pdf
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public void punto4() throws NumberFormatException, IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		Stack<Integer> p1 = new Stack<Integer>();//Pila 1
		Stack<Integer> p2 = new Stack<Integer>();//Pila 2
		Stack<Integer> p3 = new Stack<Integer>();//Pila 3
		Stack<Integer> pAuxiliar = new Stack<Integer>();// Pila auxiliar
		String N1, N2;
		System.out.print("Ingresa un numero:  ");
		N1 = Integer.toString(Integer.parseInt(br.readLine()));//Le pido al usuario que ingrese un numero
		do {//Mientras N1 sea menor a N2 - Ciclo
			System.out.print("Ingrese un numero menor:  ");
			N2 = Integer.toString(Integer.parseInt(br.readLine()));//Le pido al usuario que ingrese un numero
			if(Integer.parseInt(N1)<Integer.parseInt(N2))//Mientras N1 sea menor a N2 Mensaje - Ciclo
				System.out.println("intentelo de nuevo  ");
		}while(Integer.parseInt(N1)<Integer.parseInt(N2));
		
		for(int i=0; i<N1.length(); i++) {//Agrego cada digito del numero N1 a la pila 1
			p1.push(Integer.parseInt(Character.toString(N1.charAt(i))));
		}
		for(int i=0; i<N2.length(); i++) {//Agrego cada digito del numero N2 a la pila 2
			p2.push(Integer.parseInt(Character.toString(N2.charAt(i))));
		}
		
		System.out.println("Pila 1 = "+p1+"\nPila 2 = "+p2);//Imprimo la pila 1 y la pila 2
		int top1, top2;
		for(int i=0; i<N2.length(); i++) {//Ciclo cantidad de digitos del numero menor N2
			top1 = p1.pop();//Añado a top1 el digito que esta en el tope pila 1
			top2 = p2.pop();//Añado a top2 el digito que esta en el tope pila 2
			if(top1 >= top2) {//Si el top1 es mayor o igual al top 1 Añade a pAuxiliar la resta de top1-top2 
				pAuxiliar.push(top1-top2);
			}else {//si top1 es menor a top 2
				top1 += 10;//Le sumo a top1 +10
				p1.push(p1.pop()-1);//Le resto al que esta en el tope de la pila1 -1
				pAuxiliar.push(top1-top2);//Resto top1 - top2 y lo agrego a la pAuxiliar
			}
		}
		while(!p1.isEmpty()) {//Añado lo que quede de la pila1 en pAuxilar
			pAuxiliar.push(p1.pop());
		}
		
		while(!pAuxiliar.isEmpty()) {//Añado a pila3 pAuxiliar
			p3.push(pAuxiliar.pop());
		}
		System.out.println("Pila Resta = "+p3);//Imprimo la pila 3
	}
	/**
	 * Punto 9 del pdf
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public void punto5() throws NumberFormatException, IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		Stack<Integer> p1 = new Stack<Integer>();//pila 1
		Stack<Integer> p2 = new Stack<Integer>();//pila 2
		Stack<Integer> p3 = new Stack<Integer>();//pila 3
		Stack<Integer> pAuxiliar = new Stack<Integer>();//pila auxiliar
		String N1, N2;
		System.out.print("Ingresa un numero:  ");
		N1 = Integer.toString(Integer.parseInt(br.readLine()));	//El usuario ingrsa un numero a N1
		System.out.print("Ingrese un numero:  ");
		N2 = Integer.toString(Integer.parseInt(br.readLine()));//El usuario ingresa un numero a N2
	
		System.out.println("Suma "+(Integer.parseInt(N1)+Integer.parseInt(N2)));
		
		String menor, mayor;
		if(Integer.parseInt(N1)<Integer.parseInt(N2)) {//Para saber cual es el numero menor y cual es el mayor
			menor = N1;
			mayor = N2;
		}else {
			menor = N2;
			mayor = N1;
		}
		for(int i=0; i<N1.length(); i++) {//Agrego cada digito de N1 a la pila1
			p1.push(Integer.parseInt(Character.toString(N1.charAt(i))));
		}
		for(int i=N2.length()-1; i>=0; i--) {//Agrego cada digito de N2 a la pila2
			p2.push(Integer.parseInt(Character.toString(N2.charAt(i))));
		}
		
		System.out.println("Pila 1 = "+p1+"\nPila 2 = "+p2);//Imprimo la pila 1 y la pila 2
		int top1, top2, suma;
		for(int i=0; i<menor.length(); i++) {//ciclo deacuerdo a la cantidad de digitos del numero menor
			top1 = p1.pop();//Añado a top1 el que esta en el tope de la pila 1
			top2 = p2.remove(0);//Añado a top2 el que esta de primeras en la pila2
			suma = top1 + top2;//Sumo los dos
			if(suma >= 10) {//Si la suma es mayor a 10
				pAuxiliar.push(suma-10);//añado a la pAuxiliar la suma-10
				if(menor == N2) {
					if(!p1.isEmpty()) {//Si la pila 1 no esta vacia 
						p1.push(p1.pop()+1);//le suma 1 al numero que este en la sima de pila1
					}else {
						p1.push(1);//Añado 1 a la pila1
					}
				}else {
					if(!p2.isEmpty()) {//Si la pila 2 no esta vacia 
						p2.push(p2.remove(0)+1);//le suma 1 al numero que este en la sima de pila2
					}else {
						p2.push(1);//Añado 1 a la pila2 
					}
				}
			}else {//Si la suma no es mayor 10 añado la suma a pAuxilar
				pAuxiliar.push(suma);
			}
		}
		if(menor == N2) {
			while(!p1.isEmpty()) {//termino de añadir lo que quede a pAuxiliar
				pAuxiliar.push(p1.pop());
			}
		}else {
			while(!p2.isEmpty()) {//termino de añadir lo que quede a pAuxiliar
				pAuxiliar.push(p2.pop());
			}
		}
		
		while(!pAuxiliar.isEmpty()) {//Añado a pila3 la pAuxiliar
			p3.push(pAuxiliar.pop());
		}
		System.out.println("Pila Suma = "+p3);//imprimo la pila auxiliar
	}
	/**
	 * Esta funcio mira si el dato se encuentra o no en una pila
	 * Retorna verdadero si esta repetido, si no retorna falso
	 * @param dato
	 * @param pila
	 * @return
	 */
	public boolean isRepetido(int dato, Stack<Integer> pila) {
		boolean repetido=false;
		for(int i=0; i<pila.size(); i++) {
			if(pila.get(i)==dato) {
				repetido = true;
				break;
			}else
				repetido = false;
		}
		return repetido;
	}
}
