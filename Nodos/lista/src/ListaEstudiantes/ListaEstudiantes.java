
package ListaEstudiantes;

public class ListaEstudiantes {
    
    Estudiantes Cabeza;
    Estudiantes Cola;
    Estudiantes apuntador;
    int Tamaño=0;
    int aux=0;

    public ListaEstudiantes ()
    {
        Cabeza=null;
        Cola=null;
        apuntador=null;
    }
    
    
    public void agregarEstudiante(String Nombre, int Estatura)
     {
            Estudiantes Estudiantesnuevo=new Estudiantes(Nombre,Estatura);
            Estudiantesnuevo.setNombre(Nombre);
            Estudiantesnuevo.setEstatura(Estatura);
            
            if(Cabeza==null)
            {
                Cabeza=Estudiantesnuevo;
                Estudiantesnuevo.setSiguiente(null);
                Cola=Estudiantesnuevo;
             }
             else
             {
                Cola.setSiguiente(Estudiantesnuevo);
                Estudiantesnuevo.setSiguiente(null);
                Cola=Estudiantesnuevo;
              }
              
              Tamaño++;
        }
    
    
    public void imprimirLista ()
     {
        int auxiliar=0;
        String name;
        int contador=0;
        
        while(contador<Tamaño){
        this.apuntador=this.Cabeza;
         while(this.apuntador!=this.Cola){
             if(this.apuntador.getEstatura()>this.apuntador.getSiguiente().getEstatura())
             {
                 
                 auxiliar=this.apuntador.getEstatura();
                 name=this.apuntador.getNombre();
                 this.apuntador.setEstatura(this.apuntador.getSiguiente().getEstatura());
                 this.apuntador.setNombre(this.apuntador.getSiguiente().getNombre());
                 this.apuntador.getSiguiente().setEstatura(auxiliar);
                 this.apuntador.getSiguiente().setNombre(name);
                 
             }
             this.apuntador=this.apuntador.getSiguiente();
            
         }
         
         if(this.apuntador.getEstatura()>this.Cola.getEstatura()){
             auxiliar=this.Cola.getEstatura();
             name=this.Cola.getNombre();
             this.Cola.setEstatura(this.apuntador.getEstatura());
             this.Cola.setNombre(this.apuntador.getNombre());
             this.apuntador.setEstatura(auxiliar);
             this.apuntador.setNombre(name);
             
         }
          contador++;
     }
         
         
         
         
         
         
         this.apuntador=this.Cabeza;
         
         while(this.apuntador!=this.Cola){
             
           System.out.println("Estudiante : "+ this.apuntador.getNombre() + "," + this.apuntador.getEstatura());
           this.apuntador=apuntador.getSiguiente();
           
         }
        
         
         System.out.println("Estudiante : "+ this.Cola.getNombre()  + " , " + this.Cola.getEstatura());
         
         
     }
    
    
    
    
}
