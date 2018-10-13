
package listas.enlazadas.simples;


public class ListasEnlazadasSimples {

    
    public static void main(String[] args) {
        ListaEnlazada milista= new ListaEnlazada();
        milista.InsertarEnPrimero(10);
        milista.InsertarEnPrimero(15);
        milista.InsertarEnPrimero(30);
        milista.InsertarEnPrimero(50);
        milista.InsertarEnPrimero(40);
        milista.InsertarEnPrimero(60);
        System.out.println(milista.Listar());
        System.out.println("~~Borrar~~");
        //milista.BorrarPrimero();
        //milista.BorrarUltimo();
        milista.BorrarPosicion(2);
        System.out.println(milista.Listar());
        
    }
    
}
