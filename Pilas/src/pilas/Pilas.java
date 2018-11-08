package pilas;

import java.io.*;

public class Pilas {
 public static class ClasePila {   // Declaracion de la clase de la Pila
  private int max=10;   // Tamano maximo de la pila
  private int pila[] = new int [max];   // Arreglo para almacenar la pila
  private int top;  // Indica la cantidad de datos en la pila

  public ClasePila() {   // Constructor
    top=0;
    System.out.println("Pila creada !!!");
  }
  
        public void Push(int dato) {
         if(top==max)  // Esta llena la Pila?
         {
          System.out.println("Pila llena !!!");
          return;
         }
         for(int i=0; i<top; i++) {
          if(pila[i]==dato) { // Ya existe el dato?
           System.out.println("Duplicado !!!");
           return;
          }
          if(dato<pila[i]) {  // Alta al principio o intermedia
            for(int j=top;j>i;j--)
              pila[j]=pila[j-1];
            pila[i]=dato;  
            top++;
            System.out.println("Dato insertado al principio o intermedio !!!");
            return;
             }  
         }
         pila[top++]=dato; // Alta al final
         System.out.println("Dato insertado al final !!!");
         return;
     } 
 
     public void Pop(int dato)  {   
      if(top==0) { // Esta vacia la Pila?
       System.out.println("Pila vacia !!!");
       return;
      }
      for(int i=0;i<top;i++) {
        if(pila[i]==dato) { 
          for(int j=i; j<top-1; j++)
             pila[j]=pila[j+1];
          top--;
          System.out.println("Dato eliminado !!!");
          return;
           }  
         }
         System.out.println("Dato inexistente !!!");
     }
     
     public void Mostrar() {
      System.out.println("\n\n<<< MOSTRAR LA PILA >>>");
      if(top==0) System.out.println("Pila vacia !!!");
      for(int i=0;i<top;i++)
           System.out.println("pila["+i+"]="+pila[i]);
      System.out.println("top="+top);  
      System.out.println("max="+max);
     }
    }    

    
    static ClasePila Pila=new ClasePila();  // Declaracion del objeto Pila
    
    // Funcion principal
 public static void main(String args[]) throws IOException {
  int op=0;
  do {
      op=0;
     System.out.println("\n\n<<< PILAS >>>");
     System.out.println("1.-Push");
     System.out.println("2.-Pop");
     System.out.println("3.-Mostrar Pila");
     System.out.println("0.-Salir");
     
     //op=Integer.parseInt(JOptionPane.showInputDialog("Opcion? "));
     System.out.print("Opcion? ---> ");
     op=getInt();
    
        switch(op) {
        case 1 : Altas();                break;
        case 2 : Bajas();               break;
        case 3 : Pila.Mostrar();     break;
        }
  }while(op!=0);
     }

     public static void Altas() throws IOException {
      int dato=0;
      System.out.println("\n\n<<< ALTAS >>>");
      System.out.print("\nAnote el dato que desea insertar ---> ");
      dato=getInt();
      Pila.Push(dato);  // Invocar el metodo Push del objeto Pila
     }
     
     public static void Bajas() throws IOException {
      int dato=0;
      System.out.println("\n\n<<< BAJAS >>>");
      System.out.print("\nAnote el dato que desea eliminar ---> ");
      dato=getInt();
      Pila.Pop(dato); // Invocar el metodo Pop del objeto Pila
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
