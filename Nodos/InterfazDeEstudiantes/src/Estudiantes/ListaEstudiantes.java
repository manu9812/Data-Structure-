
package Estudiantes;

/**
 * Esta clase crea:
 * La lista de estudiantes.
 * Los metodos para el funcionamiento del programa.
 * 
 * @author Diego Soto
 */

public class ListaEstudiantes 
{
    
 /**
  * Atributos:
  * Tipo Estudiantes: cabeza,cola,apuntador,apuntadoranterior
  * Tipo entero: Tamaño.
  */
 public Estudiantes cabeza;
 public Estudiantes cola;
 public Estudiantes apuntador;
 public Estudiantes apuntadoranterior;
 private int Tamaño;

 
 /**
  * En el constructor de la clase:
  * 
  * Crea una lista de prueba.
  * Se dan valores de null a los atributos de tipo Estudiantes.
  * Se da valor de cero (0) , al atributo de tipo entero.
  */
 
 public ListaEstudiantes()
 {
  this.apuntador=null;
  this.cabeza=null;
  this.cola=null;
  this.apuntadoranterior=null;
  this.Tamaño=0;
  
  AgregarEstudiante("Clark kent",   "1111" , 4.5);
  AgregarEstudiante("Bruce Wayne",  "1212" , 3.7);
  AgregarEstudiante("Barry Allen",  "1313" , 2.9);
  AgregarEstudiante("Kara Danvers",  "1414" , 4.9);
  AgregarEstudiante("Wally West",   "1515" , 1.5);
  AgregarEstudiante("Hal Jordan",   "1616" , 3.9);
  AgregarEstudiante("Kyle Rayner",  "1717" , 4.0);
  AgregarEstudiante("John Jones",   "1818" , 4.2);
  AgregarEstudiante("Dick Grayson", "1919",  3.2);
  AgregarEstudiante("Tim Drake",    "2020" , 2.5);
  AgregarEstudiante("Oliver Queen", "2121" , 1.3);
  AgregarEstudiante("Diana Prince", "2222",  4.8);
  
 }

 /**
  * Este metodo agrega a una lista doblemente enlazada a cada uno 
  * de los estudiantes.
  * 
  * @param nombre Es el nombre que se le dan al estudiante.
  * @param id Es el numero con el que se identifica el estudiante.
  * @param promedio Es el promedio del estudiante
  */
 
public void AgregarEstudiante(String nombre, String id, double promedio) {
    
    
    if (this.cabeza == null) {

        this.cabeza = new Estudiantes(nombre, id, promedio);
        this.cabeza.setSiguiente(cabeza);
        this.apuntador = this.cabeza;
        this.cola = this.cabeza;

    } else {
        
        this.cola.setSiguiente(null);
        
        
        while (this.apuntador.getSiguiente() != null ) {
            
            this.apuntador = this.apuntador.getSiguiente();
            
        }
        
        this.apuntador.setSiguiente(new Estudiantes(nombre, id , promedio));
        this.apuntador = this.apuntador.getSiguiente();
        this.cola = this.apuntador;
        this.cola.setSiguiente(cabeza);
        this.apuntador = this.cabeza;

        Tamaño++;
    }
}
    
/**
 * Es el encargado de pasar al siguiente alumno en la lista.
 * @return  El nombre del siguiente estudiante en la lista.
 */

    public String Siguiente()
    {
     this.apuntadoranterior=this.apuntador;
     
     if(this.apuntador==this.cola)
     {
      this.apuntador=this.cabeza;
     }
     else
     {
      this.apuntador=this.apuntador.getSiguiente();
     }
     return this.apuntador.getNombre();
    }
    
    /**
     * Es el encargado de obtrener los datos del estudiante anterior.
     * @return El nombre del anterior estudiante en la lista.
     */
    
    public String Anterior()
    {
     if(this.apuntador==this.cabeza)
     {
      this.apuntador=this.cola;
     }
     else
     {
       this.apuntadoranterior=this.apuntador;
       this.apuntador=this.cabeza;
       
       while(this.apuntador.getSiguiente()!=this.apuntadoranterior)
       {
         this.apuntador=this.apuntador.getSiguiente();
       }
     }

     return this.apuntador.getNombre();
    }
    
    
    /**
     * Este metodo organiza la lista de menor a mayor dependiendo su promedio
     */
    
    public void OrganizarLista ()
     {
        double auxiliar;
        String name;
        String id;
        int contador=0;
        
        while(contador<Tamaño){
        this.apuntador=this.cabeza;
         while(this.apuntador!=this.cola){
             if(this.apuntador.getPromedio()>this.apuntador.getSiguiente().getPromedio())
             {
                 
                 auxiliar=this.apuntador.getPromedio();
                 name=this.apuntador.getNombre();
                 id=this.apuntador.getId();
                 
                 this.apuntador.setPromedio(this.apuntador.getSiguiente().getPromedio());
                 this.apuntador.setNombre(this.apuntador.getSiguiente().getNombre());
                 this.apuntador.setId(this.apuntador.getSiguiente().getId());
                 
                 this.apuntador.getSiguiente().setPromedio(auxiliar);
                 this.apuntador.getSiguiente().setNombre(name);
                 this.apuntador.getSiguiente().setId(id);
                 
             }
             this.apuntador=this.apuntador.getSiguiente();
            
         }
         
         if(this.apuntador.getPromedio()<this.cola.getPromedio()){
             
             auxiliar=this.cola.getPromedio();
             name=this.cola.getNombre();
             id=this.cola.getId();
             
             this.cola.setPromedio(this.apuntador.getPromedio());
             this.cola.setNombre(this.apuntador.getNombre());
             this.cola.setId(this.apuntador.getId());
             
             this.apuntador.setPromedio(auxiliar);
             this.apuntador.setNombre(name);
             this.apuntador.setId(id);
             
         }
          contador++;
     }    
    }
    
    /**
     * Este metodo organiza la lista de mayor a menor dependiendo su promedio
     */
    
    
     public void OrganizarLista2 ()
     {
        double auxiliar;
        String name;
        String id;
        int contador=0;
        
        while(contador<Tamaño){
        this.apuntador=this.cabeza;
         while(this.apuntador!=this.cola){
             if(this.apuntador.getPromedio()<this.apuntador.getSiguiente().getPromedio())
             {
                 
                 auxiliar=this.apuntador.getPromedio();
                 name=this.apuntador.getNombre();
                 id=this.apuntador.getId();
                 
                 this.apuntador.setPromedio(this.apuntador.getSiguiente().getPromedio());
                 this.apuntador.setNombre(this.apuntador.getSiguiente().getNombre());
                 this.apuntador.setId(this.apuntador.getSiguiente().getId());
                 
                 this.apuntador.getSiguiente().setPromedio(auxiliar);
                 this.apuntador.getSiguiente().setNombre(name);
                 this.apuntador.getSiguiente().setId(id);
                 
             }
             this.apuntador=this.apuntador.getSiguiente();
            
         }
         
         if(this.apuntador.getPromedio()>this.cola.getPromedio()){
             
             auxiliar=this.cola.getPromedio();
             name=this.cola.getNombre();
             id=this.cola.getId();
             
             this.cola.setPromedio(this.apuntador.getPromedio());
             this.cola.setNombre(this.apuntador.getNombre());
             this.cola.setId(this.apuntador.getId());
             
             this.apuntador.setPromedio(auxiliar);
             this.apuntador.setNombre(name);
             this.apuntador.setId(id);
             
         }
          contador++;
     }    
    }
     
     /**
      * Este metodo elimina un estudiante en base a su nombre.
      * @param name es el nombre pedido en el panel.
      */
    
    public void Eliminar(String name) 
    {
     
         Estudiantes Anterior=new Estudiantes(name,null,0.0);
         Estudiantes Primero=new Estudiantes(name,null,0.0);
          
          Primero=cabeza;
          Anterior=null;
          
          while(Primero!=cola)
          {
              if(Primero.getNombre().equals(name))
              {
                  if(Primero == cabeza)
                  {
                      this.cabeza=this.cabeza.getSiguiente();
                  }
                  else
                  {
                      Anterior.setSiguiente(Primero.getSiguiente());
                  }
                  
                  Tamaño=Tamaño-1;
              }
               
              Anterior=Primero; 
              Primero=Primero.getSiguiente();
          }
          
          if(Primero.getNombre().equals(cola.getNombre()))
          {
            Anterior.setSiguiente(Primero.getSiguiente());
          }
          
        
    }
}
