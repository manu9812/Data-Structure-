package listasenlazadas;

import java.util.Scanner;

public class ListasEnlazadas {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Lista L = new Lista();
        int dato, opc = 0;
        while (opc != 6) {
            System.out.println("\n Menu \n1. Agregar dato \n2. Mostrar\n3. Promedio \n4. Eliminar primero \n5. Medio \n6. Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.print(" Ingresar dato :  ");
                    dato = leer.nextInt();
                    L.AgregarNodo(dato);
                    break;
                case 2:
                    L.mostrar();
                    break;
                case 3:
                    L.promedio();
                    break;
                case 4:
                    L.eliminar();
                    break;
                case 5:
                    L.Medio();
                    break;
                case 6:
                    System.exit(0);
            }
        }

    }

}
