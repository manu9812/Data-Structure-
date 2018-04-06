package estructura;

public class Puntos {
	
	/**
	 * Escribir una funci�n recursiva que devuelva la suma de los primeros N enteros
	 * @param n
	 * @return
	 */
	
	
	int tamano ;
    int[] arreglo = new int[tamano];

	public  static int suma (int n)
	{
		
		if ( n<=1)
			return 1;
		else {
			int resultado= n+ suma(n-1);
			return resultado;
		}
		
	}
	
	/**
	 * Escribir un programa que encuentre la suma de los enteros positivos pares desde N
hasta 2. Chequear que si N es impar se imprima un mensaje de error.
	 * @param num
	 * @return
	 */
	public static int SumaPares(int n) {
		if (n == 0) //Caso base n=0
		return 0;
		else
		if (n % 2 == 0) //si el residuo de n/2 es 0, el numero el par
		return n + SumaPares(n - 1); //Cuando es par acumula n
		else
		return SumaPares(n - 1); //Cuando es impar no acumula
		}
	
	
	/**
	 * Escriba una definici�n recursiva de una funci�n que tiene un par�metro n de tipo
entero y que devuelve el n-�simo n�mero de Fibonacci. Los n�meros de Fibonacci
se definen de la siguiente manera:
F0 = 1
F1 = 1
Fi+2 = Fi + Fi+1
	 * @param n
	 * @return
	 */
	
	 public static int fibonacci (int n)
	{
	if ((n == 0) || (n == 1))
	return 1;
	else
	return fibonacci(n-1) + fibonacci(n-2);
	}

	 
/**
 * Escriba una funci�n recursiva que ordene de menor a mayor un arreglo de enteros
bas�ndose en la siguiente idea: coloque el elemento m�s peque�o en la primera
ubicaci�n, y luego ordene el resto del arreglo con una llamada recursiva.

 * @param n
 * @return
 */
	 public static int[] cuartop ( int x, int[] des)
	 {
		 
	 int menor=0;
	 int cambio;

	
	 
	    
	 if (des.length==1)
	 {
		 return des;
	 }
	 else
	 if(x==des.length-1) {
	 
		 return des;
		 
			 
		 }
	 else
	 
	 for (int i=x+1;i<=des.length;i++) {
		 
		 if(i<x)
		 {
			 menor=x;
		 }
		 
		
		 
	 }
	return cuartop(x+1,des);
	 }
	 
	 
	 
	 
	 
	 public static int factorial(int r)
		{
			if (r<=1)
				return 1;
			else
			{
				int resultado = r*factorial(r-1);
				return resultado;
			}
		
		}
	 
	 
	 /**
	  * La forma para calcular cuantas maneras diferentes tengo para elegir r cosas
distintas de un conjunto de n cosas es:
C(n,r) = n! (r!*(n-r)!)
Donde la funci�n factorial se define como
n! = n *(n-1)*(n-2)*�*2*1
Descubra una versi�n recursiva de la f�rmula anterior y escriba una funci�n
recursiva que calcule el valor de dicha f�rmula.

	  * @param c
	 * @param n 
	 * @param r 
	  * @return
	  */
	 
	 public static int punto5(int n, int r)
	 {
		
		return (int) (factorial(n) / factorial(r) * factorial(n -r));
			 
		 
	 }
	 
	 /**
	  * Escribir un programa que calcule el m�ximo com�n divisor (MCD) de dos enteros
positivos. Si M >= N una funci�n recursiva para MCD es
MCD = M si N =0
MCD = MCD (N, M mod N) si N <> 0
El programa le debe permitir al usuario ingresar los valores para M y N desde la
consola. Una funci�n recursiva es entonces llamada para calcular el MCD. El
programa entonces imprime el valor para el MCD. Si el usuario ingresa un valor
para M que es < que N el programa es responsable de switchear los valores.
	  * @param m
	  * @param n
	  * @return
	  */
	 
	 public static int mcd(int m, int n) {
			if(n==0)
			return m;
			else
			return mcd(n, m % n);
			
			}
	 
	 //Cu�l es el resultado de esta funci�n para distintos valores de X?


	 
	  public static int f(int x)
	 {
	 if (x >100)
	 {
	 return (x-10);
	 }
	 else
	 {
	 return(f(f(x+11)));
	 }
	 }
}


