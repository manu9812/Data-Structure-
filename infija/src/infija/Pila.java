package infija;

public class Pila {
	public char pila[];
	public char dato;
	public int tope = -1;
	public int max = 0;
	public boolean res;
	 
	Pila(int max) {//el constructor pide el tamaño de la pila
	this.max = max;
	pila = new char[max];//se crea un arreglo del tamano pasado ateriormente
	dato = 0;
	}
	 
	public void borrarpila() {//metodo para borrar toda la pila
	tope = -1;//mandamos el tope al principio, esto indica que la pila esta vacia
	}
	 
	public boolean llena() { // metodo para llenar la pila
	if (tope == (max - 1)) {
	res = true;
	} else {
	res = false;
	}
	 
	return res;
	}
	 
	public boolean vacia() { //metodo para vaciar la ´pila
	if (tope == -1) {
	res = true;
	} else {
	res = false;
	}
	 
	return res;
	}
	 
	public boolean push(char dato) { //metodo para maximo de la pila
	if (llena()) {
	System.err.print("Error: Pila llena");
	} else {
	tope++;
	pila[tope] = dato;
	res = true;
	}
	return res;
	}
	 
	public char pop() { // eliminar elementos de la pila
	if (vacia()) {
	System.err.print(" Pila vacia");
	} else {
	dato = pila[tope];
	tope--;
	}
	return dato;
	}
	 
	public char getTope() {
	char top=0;
	if (vacia()){
	 
	}
	else
	top= pila[tope];
	return top;
	}
	 
	public String copiarPila(Object[] pila) { //copiar pila en un array
	Object[] copy = new Object[pila.length];
	String muestra = "";
	System.arraycopy(pila, 0, copy, 0, pila.length);
	for (int i = 0; i < copy.length; i++) {
	muestra += copy[i] + " ";
	}
	return muestra;
	}
	 

}
