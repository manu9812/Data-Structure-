
package listasenlazadas;


public class Nodo {

    private int dato;
    private Nodo siguiente;

    public Nodo() {
        siguiente = null;
    }
    public Nodo(int p) {
        siguiente = null;
        dato = p;
    }

    public Nodo(int t, Nodo siguiente) {
        this.siguiente = siguiente;
        dato = t;
    }

    public int getDato() {
        return dato;
    }

   
    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
