import java.util.Scanner;


/**
 * 
 * @author manuela garcia
 * 22 abril 2018
 *
 */
public class AdivinaElNumero {
	
	private Scanner entrada = new Scanner(System.in);
	private boolean juegoActivo= true;
	/**
	 * metodo para iniciar el juego
	 */
	public void jugar()
	{
		String nombreJugador=obtenerNombreJugador();
		
		
		while(juegoActivo) {
			int intentos=0;
			int min=0;
			int max=100;
			int numeroJuego= obtenerNumerosAleatorios(1,100);
			
			
			System.out.printf("%s, ha escogido un numero entre %d y %d adivinalo\n", nombreJugador, min , max);
			int numeroJugador;
			do {
			numeroJugador = escogerNumero();
			mensaje(numeroJuego, numeroJugador);
		       intentos++;
			}while(numeroJuego != numeroJugador);
			
			System.out.printf("has ganado, intentos  %d ", intentos);
		
		
			juegoActivo= jugarNuevamente();
			
		}
		
	}
	/**
	 * metodo para obtener los numeros aleatorios del juego
	 * @param min
	 * @param max
	 * @return
	 */
	private int obtenerNumerosAleatorios(int min, int max)
	{
		return min+(int) (Math.random()* ((max-min) +1));
	}
	
	
	/**
	 * metodo para obtener el nombre del jugador
	 * @return
	 */
private String obtenerNombreJugador()
{
	System.out.println("hola, ¿cual es tu nombre?");
	String nombreJugador= entrada.nextLine();
	System.out.printf("Bienvenido %s, vamos a comenzar\n", nombreJugador);
	return nombreJugador;
}

/**
 * metodo para escoger el numero que se ingresa por consola
 * @return
 */

private int escogerNumero()
{
	System.out.println("escoge un numero");
	return entrada.nextInt();
}
/**
 * mensaje de ayuda para el jugador
 * @param numeroJuego
 * @param numeroJugador
 */
     private void mensaje(int numeroJuego, int numeroJugador)
   {
	if (numeroJuego<numeroJugador) {
		System.out.println("el numero es muy alto, adivina otra vez");
   } else if (numeroJuego > numeroJugador) {
 	System.out.println("el numero es muy bajo, adivina otra vez");

   }
}
  /**
   * metodo para que el usuario escoja si desea jugar nuevamente o quiere salir del juego
   * @return
   */
     public boolean jugarNuevamente()
    {
	System.out.println("desea jugar nuevamente?\n1. Si\n2. No");
	int respuesta= entrada.nextInt();
	if(respuesta==1)
	{
		System.out.println("genial, juguemos otra vez");
		return true;
	}else {
	System.out.println("fin del juego, gracias por  participar");
	return false;
		
	}
	
   }
}
