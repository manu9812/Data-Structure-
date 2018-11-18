
package GUI;

/**
 *La clase Panel se encarga del funcionamiento de la ventana contando 
 * la creacion de:
 * Tres Labels o etiquetas:
 * Para el nombre, Id y promedio.
 * 
 * Tres TextField o campos de texto:
 * El usuario no puede modificar para el nombre, id y promedio generada por 
 * la lista previa.
 * 
 * Seis botones:
 * 
 * Implementados con la funcion ActionListener, encargados de:
 * 
 * El siguiente y anterior estudiante.
 * Agregar y Eliminar Estudiante.
 * Organizar de menor a mayor (boton OrganizarMenor). 
 * Organizar de mayor a menor (boton OrganizarMayor).
 * 
 * 
 * @author Rocha and Soto
 */


/**
 * La linea 31 a la linea 36 de codigo:
 * Se importa las librerias necesarias para el panel.
 */

import Estudiantes.ListaEstudiantes;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * En la clase Panel con herencia no obligatoria de los metodos de JPanel 
 * e implementando metodos de ActionListener, podemos encontrar de la linea
 * 47 a la linea 89 de codigo la creacion de botones,etiquetas y campos de texto.   
 * @author Rocha and Soto
 */

public class Panel extends JPanel implements ActionListener
{

 /**
  * Creacion de botones (Linea 54 a linea 65)
  */ 
   
 public final static String Siguiente = "Siguiente";
 public final static String Anterior= "Anterior";
 public final static String Eliminar= "Eliminar";
 public final static String Agregar="Agregar";
 public final static String OrganizarMayor= "OrganizarMayor";
 public final static String OrganizarMenor= "OrganizarMenor";
 
 private JButton butSiguiente;
 private JButton butAnterior;
 private JButton butEliminar;
 private JButton butAgregar;
 private JButton butOrganizarMayor;
 private JButton butOrganizarMenor;
 
 /**
  *  Creacion de etiquetas (Linea 72 a linea 74)
  */
    
 private JLabel labNombre;
 private JLabel labID;
 private JLabel labPromedio;
 
 /**
  * Creacion de campos de texto (Linea 80 a linea 82)
  */
 
 private JTextField txtNombre;
 private JTextField txtID;
 private JTextField txtPromedio;
 
 /**
  * Objeto de La clase ListaEstudiantes con el fin de obtener los metodos
  * y atributos de esta clase (Linea 89)
  */

 ListaEstudiantes opcion=new ListaEstudiantes();
 
 /**
  * En el constructor de la clase Panel (Panel()), se encuentra el diseño del 
  * panel que se visualizara
  * Linea 97 a Linea 203 del codigo.
  */
 
 public Panel()
 {
   
   /**
    *Modelo de panel de mallas seis (6) filas , y dos (2) columnas. (linea 104). 
    */
     
   setLayout(new GridLayout(6,2));
   
   /**
    * Dimension del panel (linea 110).
    */
   
   setPreferredSize(new Dimension (0,150));
   
   /**
    * Titulo del panel, con su respectivo color. (linea 116 a linea 119).
    */
   
   TitledBorder border;
   border=new TitledBorder("Listas");
   border.setTitleColor(Color.gray);
   setBorder(border);
   
   /**
    * Color del panel. (linea 125).
    */
   
   setBackground(Color.LIGHT_GRAY);
   
   /**
    * Diseño de etiquetas (Linea 131 a linea 133).
    */
   
   labNombre = new JLabel("Nombre ");
   labID= new JLabel("ID ");
   labPromedio = new JLabel ("Promedio ");
  
   /**
    * Diseño de Campos de texto.(Linea 139 a 141).
    */
   
   txtNombre=new JTextField();
   txtID=new JTextField();
   txtPromedio=new JTextField();
   
   /**
    * Diseño de botones. (Linea 147 a 152)
    */
   
   butSiguiente=new JButton("Siguiente");
   butAnterior=new JButton("Anterior");
   butEliminar=new JButton("Eliminar");
   butAgregar=new JButton("Agregar");
   butOrganizarMayor=new JButton("OrganizarMayor");
   butOrganizarMenor=new JButton("OrganizarMenor");
   
   /**
    * Lineas de codigo para hacer el campo de texto no editable 
    * (es decir que no se pueda escribir en el).
    * Linea 160 a linea 162.
    */
   
   txtNombre.setEditable(false);
   txtID.setEditable(false);
   txtPromedio.setEditable(false);
   
   labNombre.setForeground(Color.white);
   labID.setForeground(Color.white);
   labPromedio.setForeground(Color.white);
   
   txtNombre.setForeground(Color.blue);
   txtID.setForeground(Color.blue);
   txtPromedio.setForeground(Color.blue);
   
   /**
    * Se Añaden los elementos creados y diseñados anteriormente 
    */
   
   add(labNombre);
   add(txtNombre);
   add(labID);
   add(txtID);
   add(labPromedio);
   add(txtPromedio);
   add(butAnterior);
   add(butSiguiente);
   add(butAgregar);
   add(butEliminar);
   add(butOrganizarMayor);
   add(butOrganizarMenor);
   
   /**
    * Aplicacion del ActionListener para el funcionamiento de cada boton 
    * (Linea 187 a 192)
    */
   
   butSiguiente.addActionListener(this);
   butAnterior.addActionListener(this);
   butAgregar.addActionListener(this);
   butEliminar.addActionListener(this);
   butOrganizarMayor.addActionListener(this);
   butOrganizarMenor.addActionListener(this);
   
   /**
    * Creacion de los primeros datos que se mostraran en pantalla 
    */
   
   txtNombre.setText(opcion.cabeza.getNombre());
   txtID.setText(opcion.cabeza.getId());
   String aux=String.valueOf(opcion.cabeza.promedio);
   txtPromedio.setText(aux); 
 }

 
 /**
  * Acontinuacion se mostraran metodos que se ejecutan cuando accionamos 
  * un boton del panel
  */
 
 /**
  * Metodo Siguiente()
  * Ejecuta el metodo Siguiente() de la clase ListaEstudiantes.
  * Muestra en los campos de texto la informacion del siguiente estudiante 
  * al actual.
  */
 
 public void Siguiente()
 {
  txtNombre.setText(opcion.Siguiente());
  txtID.setText(opcion.apuntador.getId());
  String aux=String.valueOf(opcion.apuntador.getPromedio());
  txtPromedio.setText(aux);
 }
 
  /**
  * Metodo Anterior()
  * Ejecuta el metodo Anterior() de la clase ListaEstudiantes.
  * Muestra en los campos de texto la informacion del estudiante anterior 
  * al actual.
  * 
  */
 public void Anterior()
 {
  txtNombre.setText(opcion.Anterior());
  txtID.setText(opcion.apuntador.getId());
  String aux=String.valueOf(opcion.apuntador.getPromedio());
  txtPromedio.setText(aux);
 }
 
  /**
  * Metodo Agregar():
  * 
  * Pide en un cuadro de texto (implementado con la funcion JOptionPane):
  * nombre, id y promedio.
  * Ejecuta el metodo Agregar Estudiante.
  * 
  * Muestara en los campos de texto el nombre, estudiante y promedio del primer
  * estudiante.
  */
 
 public void Agregar()
 {
   double prom; 
   JOptionPane.showMessageDialog(null, "Nuevo Estudiante");
   String name=JOptionPane.showInputDialog("Nuevo nombre");
   String ID=JOptionPane.showInputDialog("Nuevo ID");
   
   do{
    String promedio=JOptionPane.showInputDialog("Nuevo promedio");
    prom= Double.parseDouble(promedio);
    
    if(prom>5.0 || prom<0.0)
    {
     JOptionPane.showMessageDialog(null, "Error: promedio no valido");
    }
   }while(prom>5.0 || prom<0.0);

   opcion.AgregarEstudiante(name, ID, prom);
 
   txtNombre.setText(opcion.cabeza.getNombre());
   txtID.setText(opcion.cabeza.getId());
   String aux= String.valueOf(opcion.cabeza.getPromedio()) ; 
   txtPromedio.setText(aux);
 }
 
 /**
  * Metodo Eliminar():
  * 
  * Este metodo Pide un nombre (implementando la calse JOptionPane).
  * Lo envia como parametro al metodo Eliminar() de la clase ListaEstudiantes.
  * Ejectuta Dicho metodo.
  * Cambia la informacion de los campos de texto a el nombre, id y promedio 
  * del primer estudiante.
  * 
  */
 
 
 public void Eliminar()
 {
  JOptionPane.showMessageDialog(null, "Eliminar de lista");
  String name=JOptionPane.showInputDialog("Ingrese el nombre a eliminar");
  opcion.Eliminar(name);
  
  txtNombre.setText(opcion.cabeza.getNombre());
  txtID.setText(opcion.cabeza.getId());
  String aux= String.valueOf(opcion.cabeza.getPromedio()) ; 
  txtPromedio.setText(aux);
 }
 
 /**
  * Metodo OrganizarMayor:
  * 
  * Ejecuta el metodo OrganizarLista2 de la clase ListaEstudiantes().
  * Cambia los campos de texto nombre, id, y promedio por los del estudiante de 
  * mayor promedio.
  * 
  */
 
 public void OrganizarMayor()
 {
  opcion.OrganizarLista2();
  txtNombre.setText(opcion.cabeza.getNombre());
  txtID.setText(opcion.cabeza.getId());
  String aux=String.valueOf(opcion.cabeza.getPromedio());
  txtPromedio.setText(aux);
 }
 
 /**
  * Metodo OrganizarMenor:
  * 
  * Ejecuta el metodo OrganizarLista de la clase ListaEstudiantes().
  * Cambia los campos de texto nombre, id, y promedio por los del estudiante de 
  * menor promedio.
  * 
  */
 
 public void OrganizarMenor()
 {
  opcion.OrganizarLista();
  txtNombre.setText(opcion.cabeza.getNombre());
  txtID.setText(opcion.cabeza.getId());
  String aux=String.valueOf(opcion.cabeza.getPromedio());
  txtPromedio.setText(aux);
 }

 /**
  * Metodos actionPerformed:
  * 
  * Es el encargado de recibir la accion sobre el boton y redirigir a un metodo 
  * encargado del funcionamiento del boton.
  * @param e 
  */
 
 public void actionPerformed(ActionEvent e)
 {
  String comando=e.getActionCommand();
  
  if(comando.equals(Siguiente))
  {
   Siguiente();
  }
  
  if(comando.equals(Agregar))
  {
    Agregar();
  }
   
  if(comando.equals(Anterior))
  {
   Anterior();
  }
  
  if(comando.equals(Eliminar))
  {
   Eliminar();  
  }
  
  if(comando.equals(OrganizarMayor))
  {
   OrganizarMayor();
  }
  
  if(comando.equals(OrganizarMenor))
  {
   OrganizarMenor();
  } 
 }
}


