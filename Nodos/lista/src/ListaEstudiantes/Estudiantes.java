
package ListaEstudiantes;

public class Estudiantes {
    
    public String nombre;
    public int Estatura;
    public Estudiantes Siguiente;
    
     public Estudiantes(String nombre, int Estatura)
    {
     this.nombre=nombre;
     this.Estatura=Estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstatura() {
        return Estatura;
    }

    public void setEstatura(int Estatura) {
        this.Estatura = Estatura;
    }

    public Estudiantes getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Estudiantes Siguiente) {
        this.Siguiente = Siguiente;
    }
     
     
     
    
    
    
    
}
