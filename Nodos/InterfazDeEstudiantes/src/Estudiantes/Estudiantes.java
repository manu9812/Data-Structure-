
package Estudiantes;

/**
 * Esta clase es la encargada de recibir la informacion enviada por el panel y 
 * la clase ListaEstudiantes.
 * 
 * Crea Atributos de la clase Estudiantes llamado siguiente y anterior.
 * Crea Atributos string nombre y id .
 * Crea un atributo double llamado promedio.
 * 
 * En el constructor se inicializanlos atributos con los parametros recibidos.
 * 
 * @author Diego Soto
 */

public class Estudiantes 
{
 public String nombre;
 public String id;
 public double promedio;
 public Estudiantes siguiente;
 public Estudiantes anterior;
 
 public Estudiantes(String nombre,String id , double promedio)
 {
  this.nombre=nombre;
  this.id=id;
  this.promedio=promedio;
 }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public Estudiantes getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Estudiantes siguiente) {
        this.siguiente = siguiente;
    }

    public Estudiantes getAnterior() {
        return anterior;
    }

    public void setAnterior(Estudiantes anterior) {
        this.anterior = anterior;
    }
 
 
    
}
