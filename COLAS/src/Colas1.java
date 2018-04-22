import java.io.*;


public class Colas1 {
	
	public static class Clasec
	{
 static int max=20; // tamaño de la cola 
 static int cola[]= new int [max];
 static int front;
 static int end;
 Clasec() {
	 front=0;
	 end=0;
	 System.out.println("SIMULACION HOSPITAL ");
 }
 
 public static void insetElem(int dato) {
	 if (end==max) {
		 System.out.println("\n FILA");
		 return;
		 
	 }
	 cola[end++]=dato;
	 System.out.println("INGRESA UN NUEVO USUARIO");
	 
 }
 
 public static void delete() {
	 System.out.println("\n\n USUARIO POR ATENDER");
	 
	 
	 if(front==end)
	 {
		 System.out.println("\n NO HAY FILA");
		 return;
		 
	 }
	 System.out.println("USUARIO ATENDIDO" + cola[front++]);
	 
 }
 
 public static void show()
 {
	 int k=0;
	 System.out.println("\n\n MOSTRAR LA CANTIDAD DE USUARIOS EN LA FILA");
	 if (front==end) 
		 System.out.println("\n\n NO HAY FILA");
	 for(k=front; k<end ; k++)
	 {
		 System.out.println("ESTADO DE LA FILA ["+ k +" :" +cola[k]+ "]");
		 
	 }
	 System.out.println("\n front=  "+ front);
	 System.out.println("\n end = "+  end);
	 System.out.println("\n max =" + max);
 }
 
 static Clasec Cola=new Clasec();  // Declaracion del objeto Cola
 
 // Funcion principal
 public static void main(String args[]) throws IOException {
  int op=0;
  do {
        System.out.println("\n\n QUE DESEA REALIZAR?");
        System.out.println("1.- ADD");
        System.out.println("2.- REMOVE");
        System.out.println("3.- SHOW");
        System.out.println("0.- LEAVE");
        System.out.print("OPTION? ---> ");
        op=getInt();
      
        switch(op) {
         case 1 : Altas();              break;
         case 2 : Cola.delete(); break;
         case 3 : Cola.show();  break;
        }
  }while(op!=0);
 }

 public static void Altas() throws IOException {
  int elemento=0;
  System.out.println("\n\n HA SELECCIONADO AGREGAR UN USUARIO MAS A LA FILA ");
  System.out.print(" DIGITE EL ELEMENTO QUE DESEA INSERTAR ---> ");
  elemento=getInt();
  Cola.insetElem(elemento); // Invocar el metodo Insertar del objeto Cola
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
}
