
import java.io.*;


  
public class ColasHos{
    public static class ClaseColas {  // Declaracion de la clase de Colas
         static int max=20;  // Tamano maximo de la Cola
         static int cola[]= new int[max]; // Declaracion del arreglo
         static int front, end; // Indicadores de inicio y fin de la Cola
        
         ClaseColas() { // Constructor que inicializa el frente y el final de la Cola
          front=0;   end=0;
          System.out.println("inicio cola");
         }
        
         public static void Insertar(int dato) {
          if(end==max) { // Esta llena la Cola?
          System.out.println("\n la cola esta llena");
           return;
          }
          cola[end++]=dato;
          System.out.println("se ha insertado el dato correctamente a la cola");
         }
        
         public static void Eliminar() {
          System.out.println("\n\n desea eliminar elementos de la cola?");
          
          if(front==end) {  // Esta vacia la Cola?
           System.out.println("\n la cola se encuentra vacia ");
           return;
          }
             System.out.println("Elemento eliminado exitosamente : "+cola[front++]);
         }
        
         public static void Mostrar() {
          int i=0;
          System.out.println("\n\n mostrar cola ");
          if(front==end)  System.out.println("\n la cola se encuentra vacia ");
          for(i=front; i<end; i++) {
           System.out.println("cola["+i+"]="+" "+cola[i]);
          }
          System.out.println("\nfront= "+front);
          System.out.println("end = "+end);
          System.out.println("Max  = "+max);
         }
    }
  
    static ClaseColas Cola=new ClaseColas();  // Declaracion del objeto Cola
  
    // Funcion principal
    public static void main(String args[]) throws IOException {
     int op=0;
     do {
           System.out.println("\n\n que desea realizar?");
           System.out.println("1.- agregar");
           System.out.println("2.- Eliminar");
           System.out.println("3.- Mostrar");
           System.out.println("0.- Salir");
           System.out.print("Opcion? ---> ");
           op=getInt();
         
           switch(op) {
            case 1 : Altas();              break;
            case 2 : Cola.Eliminar(); break;
            case 3 : Cola.Mostrar();  break;
           }
     }while(op!=0);
    }
  
    public static void Altas() throws IOException {
     int elemento=0;
     System.out.println("\n\n ha seleccionado insertar un elemento en la cola ");
     System.out.print(" digite el elemento que desea  insertar ---> ");
     elemento=getInt();
     Cola.Insertar(elemento); // Invocar el metodo Insertar del objeto Cola
    }
  
    // Funcion para capturar una cadena desde el teclado
     public static String getString() throws IOException {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String s = br.readLine();
            return s;
        }   
      
        // Funcion para capturar un entero desde el teclado
        public static int getInt() throws IOException {
            String s = getString();
            return Integer.parseInt(s);
        }   
}