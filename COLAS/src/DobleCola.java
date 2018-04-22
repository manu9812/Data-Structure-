import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class DobleCola {
	private static Object[] ArregloCola;
	private static int frente = 0;
	;
	private static int Cant_elem = 20;
	private static int fondo = Cant_elem-1;

	public DobleCola() {
		ArregloCola = new Object[Cant_elem];
		frente = 0;
	}

	
	

	

	 public static void DesencolarDer() {
		 System.out.println("\n\n DESENCOLAR");
		 
		 
		 if(frente==fondo)
		 {
			 System.out.println("\n NO HAY ELEMENTOS");
			 return;
			 
		 }
		 System.out.println("DESENCOLADO" + ArregloCola[frente++]);
		 
	 }

	
	 public static void DesencolarIzq() {
		 System.out.println("\n\n DESENCOLAR");
		 
		 
		 if(fondo==frente)
		 {
			 System.out.println("\n NO HAY ELEMENTOS");
			 return;
			 
		 }
		 System.out.println("DESENCOLADO" + ArregloCola[frente++]);
		 
	 }

	public static void EncolarDer(int dato) {
		 if (frente==fondo) {
			 System.out.println("\n FILA");
			 return;
			 
		 }
		 ArregloCola[fondo++]=dato;
		 System.out.println("AGREGAR");
		 
	 }
	public static void EncolarIzq(int dato) {
		 if (fondo==frente) {
			 System.out.println("\n FILA");
			 return;
			 
		 }
		 ArregloCola[frente++]=dato;
		 System.out.println("AGREGAR");
		 
	 }

	public boolean ColaLlena() {
		
		if (fondo == frente) {
			return true;
		} else {
			return false;
		}
	}

	public boolean ColaVacia() {
		if (fondo == 0 && frente == Cant_elem) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String args[]) throws IOException {
		  int op=0;
		  do {
		        System.out.println("\n\n QUE DESEA REALIZAR?");
		        System.out.println("1.- ENCOLAR POR DERECHA");
		        System.out.println("2.- ENCOLAR POR IZQUIERDA");
		        System.out.println("3.- DESENCOLAR POR DERECHA");
		        System.out.println("4.- DESENCOLAR POR IZQUIERDA");
		        System.out.println("5.- SHOW");
		        System.out.println("0.- LEAVE");
		        System.out.print("OPTION? ---> ");
		        op=getInt();
		      
		        switch(op) {
		         case 1 : encolard(); break;
		         case 2: encolari(); break;  
		         case 3: desencolard(); break;
		         case 4: desencolarI(); break;
		         case 5 : ArregloCola1.EncolarDer(frente); break;
		         case 6 : ArregloCola1.EncolarIzq(fondo);  break;
		         case 7: ArregloCola1.DesencolarDer(); break;
		         case 8: ArregloCola1.DesencolarIzq(); break;
		        }
		  }while(op!=0);
		 }
	 static DobleCola ArregloCola1=new DobleCola();  // Declaracion del objeto Cola

		 public static void encolard() throws IOException {
		  int elemento=0;
		  System.out.println("\n\n ENCOLAR POR DERECHA ");
		  System.out.print(" DIGITE EL ELEMENTO QUE DESEA INSERTAR ---> ");
		  elemento=getInt();
		  ArregloCola1.EncolarDer(frente); // Invocar el metodo Insertar del objeto Cola
		 }
		 
		 
		 public static void encolari() throws IOException {
			  int elemen=0;
			  System.out.println("\n\n ENCOLAR POR IZQUIERDA ");
			  System.out.print(" DIGITE EL ELEMENTO QUE DESEA INSERTAR ---> ");
			  elemen=getInt();
			  ArregloCola1.EncolarIzq(fondo); 
			 }

		 public static void desencolard() throws IOException {
			  int elemento=0;
			  System.out.println("\n\n DESENCOLAR POR DERECHA ");
			  System.out.print(" ---> SE HA DESENCOLADO EXITOSAMENTE ");
			  elemento=getInt();
			  ArregloCola1.DesencolarDer(); 
			 }
		 
		 public static void desencolarI() throws IOException {
			  int elemento=0;
			  System.out.println("\n\n DESENCOLAR POR DERECHA ");
			  System.out.print(" ---> SE HA DESENCOLADO EXITOSAMENTE ");
			  elemento=getInt();
			  ArregloCola1.DesencolarIzq(); 
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

