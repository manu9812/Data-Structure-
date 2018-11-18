package Colas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EjerciciosColas {
	
	public void Banco() 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int proceso = 0;
		int capacidad = 0;
		
		try 
		{
			System.out.println("Cual es la capacidad de la cola del banco:  ");
			capacidad = Integer.parseInt(br.readLine());
			colaCircular bancoCola = new colaCircular(capacidad);
			
			String cliente;
			do {
				System.out.println("1. Agregar nuevo cliente a la cola \n2. Sacar cliente de la cola \n0. Cerrar Banco");
				proceso = Integer.parseInt(br.readLine());
				
				switch (proceso) {
					case 1:
						System.out.print("Ingrese el nombre del cliente:  ");
						cliente = br.readLine();
						bancoCola.Add(cliente);
						System.out.println(bancoCola.Mostrar());
						break;
					case 2:
						bancoCola.Remove();
						System.out.println(bancoCola.Mostrar());
						break;
					case 0:
	 
						while(!bancoCola.isEmpity()) {
							bancoCola.Remove();
							System.out.println(bancoCola.Mostrar());
						}
						break;
					default:
						System.out.println("Opcion no valida intete de nuevo");
						break;
				}

			}while(proceso != 0);
		
		} catch (IOException e) {e.printStackTrace();}
		
		

	}
	
	public void Invertir() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int size = 0;
		String simbolo;
		
		try {
			System.out.print("Cuantos simbolos desea agregar:  ");
			size = Integer.parseInt(br.readLine());
			colaCircular cola = new colaCircular(size);
			colaCircular invertido = new colaCircular(size);
			colaCircular Auxiliar = new colaCircular(size);
			
			for(int i=0; i<size; i++) {
				System.out.print("Ingrese un simbolo:  ");
				simbolo = br.readLine(); 
				cola.Add(simbolo);
			}
			
			do {
				
				while(!invertido.isEmpity()) {
					Auxiliar.Add(invertido.Remove());
				}
				if(invertido.isEmpity()) {
					invertido.Add(cola.Remove());
					while(!Auxiliar.isEmpity()) {
						invertido.Add(Auxiliar.Remove());
					}
				}
				if(!cola.isEmpity()) {
					while(!invertido.isEmpity()) {
						Auxiliar.Add(invertido.Remove());
					}
				}
				
			}while(!cola.isEmpity());
			System.out.println("Cola invertida: "+invertido.Mostrar());
		}catch (IOException e) {e.printStackTrace();}
		
	}
	
	public void biColas() 
	{
		Scanner read = new Scanner(System.in);
		DoblesColas dc = new DoblesColas();
		int opcion1;
		int opcion2;
		
		do {
			System.out.println("Escoja una opcion: \n1. Insertar un dato \n2. Eliminar un dato \n0. salir");
			opcion1 = read.nextInt();
			switch(opcion1){
				case 0: System.out.println("<---- Menu principal");break;
				case 1:
					System.out.println("1. InsertarPorDerecha \n2. InsertarPorIzquierda");
					opcion2 = read.nextInt();
					System.out.print("Que dato desea ingresar:  ");
					String dato = read.next();
					switch (opcion2) {
						case 1: 
							dc.IngresarPorDerecha(dato);
							System.out.println(dc.Mostrar()); 
							break;
						case 2: 
							dc.IngresarPorIzquierda(dato); 
							System.out.println(dc.Mostrar()); break;
						default: System.out.println("Vuelva a intentarlo"); break;
					}
					break;
				case 2:
					System.out.println("1. EliminarPorDerecha \n2. EliminarPorIzquierda");
					opcion2 = read.nextInt();
					switch (opcion2) {
						case 1: 
							dc.EliminarPorDerecha(); 
							System.out.println(dc.Mostrar());
							break;
						case 2: 
							dc.EliminarPorIzquierda(); 
							System.out.println(dc.Mostrar()); 
							break;
						default: System.out.println("Vuelva a intentarlo"); break;
					}
					break;
				default:
					System.out.println("Opcion inexistente, intente de nuevo");
					break;
			}
		}while(opcion1 != 0);	
	}
	
}

class colaCircular{
	
	private String[] Cola;
	int max, frenteC, finalC;
	
	public colaCircular(int max) {
		this.max = max;
		Cola = new String[max];
		frenteC = -1;
		finalC = -1;
	}
	
	public void Add(String str) {
		if(finalC == max-1) {
			if(frenteC == 0) {
				System.out.println("Cola llena, No se puede ingresar");
			}else {
				finalC = 0;
				Cola[finalC] = str;
			}
		}else{
			if(finalC == -1) {
				finalC += 1;
				frenteC += 1;
				Cola[finalC] = str;
			}else
				finalC += 1;
				Cola[finalC] = str;
		}
	}
	
	public String Remove() {
		String removido = null;
		if(frenteC != -1) {
			removido = Cola[frenteC];
		}
		if(frenteC == -1) {
			System.out.println("Pila vacia");
		}else if(frenteC == finalC) {
			frenteC = -1;
			finalC = -1;
		}else {
			if(frenteC == max-1) {
				frenteC = 0;
			}else
				frenteC += 1;
		}
		return removido;
	}
	
	public boolean isEmpity(){
      boolean vacia = false;
      if (frenteC==-1) {
        vacia=true;
      }else {
    	  vacia=false;
      }
      return vacia;
     }   
	
	public String Mostrar() 
	{
		int frenteAux = frenteC; 
		int finalAux = finalC;
		String strCola = "[";
		do {
			if(frenteC == -1) {
				strCola += "]";
				frenteAux += 1;
			}else {
				if(frenteAux == finalAux) {
					strCola += Cola[frenteAux]+"]";
					frenteAux += 1;
				}else {
					if(frenteAux == max-1) {
						strCola += Cola[frenteAux]+",";
						frenteAux = 0;
					}else {
						strCola += Cola[frenteAux]+",";
						frenteAux += 1;
					}
				}
			}
		}while(frenteAux != finalAux+1);
		
		return strCola;
	}
}
