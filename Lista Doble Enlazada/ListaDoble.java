/*
Implementacion de una listadoblemente enlazada
By (¯`·._.·[§RaMmS§]·._.·´¯)
rammscorp@gmail.com
*/
class CNodo
{
	int dato;
	CNodo siguiente;
	CNodo anterior;
	
	public CNodo()
	{
		anterior = siguiente = null;
	}
}

class CLista
{
	CNodo cabeza;
	
	public CLista()
	{
		cabeza = null;
	}
	
	public void InsertarDato()
	{
		int N=(int)(Math.random()*100+1);
		CNodo NuevoNodo;
		
		NuevoNodo = new CNodo();
		NuevoNodo.dato=N;
		NuevoNodo.siguiente = cabeza;
		
		if (cabeza != null)
			cabeza.anterior = NuevoNodo;
		
		cabeza = NuevoNodo;
	}
	
	public void EliminarDato()
	{
		CNodo NodoActual;
		CNodo NodoAnterior;
		
		NodoActual = cabeza;
		NodoAnterior = null;
		
		while (NodoActual != null)
		{
			if ((NodoActual.dato%6 == 0))
			break;
			NodoAnterior = NodoActual;
			NodoActual = NodoActual.siguiente;
		}
		
		if (NodoActual != null )
		{
			if (cabeza == NodoActual)
			{
				cabeza = NodoActual.siguiente;
				NodoActual.siguiente = null;
			}
			else if(NodoActual.siguiente == null)
			{
				NodoAnterior.siguiente = null;
			}
			else
			{
				NodoAnterior.siguiente = NodoActual.siguiente;
				NodoAnterior.siguiente.anterior = NodoActual.anterior;
			}
		}
		
	}
	
	public void VisualizarDatos()
	{
		CNodo Nodo;
		
		for(Nodo = cabeza;Nodo != null;Nodo = Nodo.siguiente)
			System.out.print(" " + Nodo.dato +" ");
	}

}

public class ListaDoble
{
	public static void main(String args[])
	{
		CLista objLista= new CLista();
		System.out.println("Lista Original:");
		for(int i=0;i<10;i++)
		{
			objLista.InsertarDato();
		}
		
		objLista.VisualizarDatos();
		System.out.println("\nlLista Sin los elementos divisibles entre 6:");
		for(int i=0;i<10;i++)
		{
			objLista.EliminarDato();
		}
		
		objLista.VisualizarDatos();
	}
}