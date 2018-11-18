
package GUI;

/**
 * Esta clase es la encargada de probar la interfaz grafica en donde:
 * 
 * Se crea un objeto de tipo Interfaz llamado i (linea 18)
 * Se hace visible (Linea 19)
 * Se da una locacion donde aparecera  (Linea 20)
 * 
 * @author Diego Soto
 */

public class Tester {
	
	public static void main (String [] args)
	{
	  Interfaz i=new Interfaz();
	  i.setVisible(true);
          i.setLocationRelativeTo(null);

	}
}
    

