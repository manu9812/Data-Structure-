
import ListaEstudiantes.ListaEstudiantes;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) {
        
        
        ListaEstudiantes Lista=new ListaEstudiantes();
        Scanner leer=new Scanner (System.in);
        
        int opc=0;
        String Nombre="";
        int Estatura=0;
        int contador=0;
        
        while (2==2){
            opc=Integer.parseInt(JOptionPane.showInputDialog("MENU\n1.Agregar Estudiante\n2.Imprimir\n3.Salir"));
            
            switch (opc){
            
                
                case 1:  
            Nombre=JOptionPane.showInputDialog("Ingrese el nombre del estudiante: ");
                   Estatura=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la estatura"));
                   Lista.agregarEstudiante(Nombre, Estatura);
            break;
            
                case 2:
                    Lista.imprimirLista();
            break;
            
                case 3:
                    System.exit(0);
            
            }
            
        }
        
        
    }
    
}
