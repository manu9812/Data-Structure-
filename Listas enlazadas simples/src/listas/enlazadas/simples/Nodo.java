
package listas.enlazadas.simples;


public class Nodo {
    int info;
    public Nodo Siguiente; //Referencia recursiva, el nodo siguiente va a ser del mismo tipo
    public Nodo (int dato){
        info=dato;
    }
    public void verNodo(){
        System.out.println("{"+info+"}");//Metodo donde se puede ver la información del nodo
    }
}
