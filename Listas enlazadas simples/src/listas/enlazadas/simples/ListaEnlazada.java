
package listas.enlazadas.simples;


public class ListaEnlazada {
    Nodo Primero;
    
    public ListaEnlazada(){
        Primero=null;//Es igual a nulo cuando se esta instanciando su constructor
    }
    
    public boolean vacia(){
        if(Primero==null){//Si apunta a nada es porque estará vacía
            return(true);
        }else{
            return(false);
        }
    }
    public void InsertarEnPrimero(int Dato){//Para insertar datos en los nodos
        Nodo Temporal= new Nodo(Dato);//Crea el nodo temporal
        Temporal.Siguiente=Primero;//Corre al primero, engancha los nodos como una cadena
        Primero=Temporal;//Lo coloca de primero
    }
    public void BorrarPrimero(){
        Primero=Primero.Siguiente;//Dar un salto, que el primero apunte al siguiente numero o nodo
    }
    public void BorrarUltimo(){
        Nodo anterior=Primero;
        Nodo actual=Primero;
        
        while(actual.Siguiente!=null){
            anterior=actual;
            actual=actual.Siguiente;
        }
        anterior.Siguiente=null;//Cuando llegue se estaría borrando el último nodo
    }
    public String Listar(){
        String Dato="";
        Nodo aux= Primero;
            while(aux!=null){
                Dato+="{"+aux.info+"}";//Una cadena se va concatenando
                aux=aux.Siguiente;//Se va avanzando
            }
        return Dato;
    }
    public void BorrarPosicion(int pos){
        Nodo anterior= Primero;
        Nodo actual=Primero;
        int k=0;
        if(pos>0){
            while(k!=pos && actual.Siguiente!=null){
                anterior=actual;
                actual=actual.Siguiente;
                k++;
                System.out.println(" k "+k);
            }
            anterior.Siguiente=actual.Siguiente;//Cuando se encuentra la posicion y se elimina el dato
        }
    }
}
