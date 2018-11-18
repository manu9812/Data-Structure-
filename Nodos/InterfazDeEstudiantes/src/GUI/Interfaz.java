/*
 *La clase Interfaz Encargada de crear la ventana con el panel 
 *anteriormente creado 
 */

package GUI;

/**
 * Se importan las librerias necesarias para el funcionamiento de la ventana.
 */

import java.awt.BorderLayout;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * La clase Interfaz hereda los comportamientos de la clase JFrame
 * Linea 22 a Linea 52
 * @author Diego Soto
 */

public class Interfaz extends JFrame {
    
    /**
     * Se crea un objeto de la clase Panel llamado panel 
     * Linea 29
     */
    
    private Panel panel;
	
       /**
        * En el constructor de la clase Interfaz se establece:
        * 
        * El nombre que se le da a la ventana (Linea 43)
        * EL tamaño (Linea 44)
        * El borde  (Linea 45)
        * El metodo por el cual se cierra el programa (Linea 46) 
        * La ubicacion en la ventana (Linea 49)
        */
    
	public Interfaz ()
	{
		setTitle("ESTUDIANTES");
		setSize(600,200);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
                setLayout(new BorderLayout());
                panel= new Panel();
                add(panel, BorderLayout.CENTER);                
	}
}
