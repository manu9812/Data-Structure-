package recursividad;

import javax.swing.JOptionPane;

public class Main1 {
	  public static void main(String[] args) {
	        int tamanio, numero;
	        try{
	            tamanio = Integer.parseInt(JOptionPane.showInputDialog(null,"¿De que tamaño deseas el vector?"));
	            int vector[]=new int[tamanio];
	            numero = Integer.parseInt(JOptionPane.showInputDialog(null,"¿Con cúal Número deseas inicializar el vector?"));
	            Main1 obj = new Main1();
	            obj.inicializarVector(vector, vector.length, 0, numero);
	            for(int i=0; i<vector.length;i++){
	                System.out.print("["+vector[i]+"]");
	            }
	        }catch(Exception e){
	            System.out.println("Error " + e.getMessage());
	        }
	    }
	    void inicializarVector(int vector[], int n, int indice, int numero){
	        if(n==0){
	            System.out.println("Vector Inicializado");
	        }else{
	            vector[indice]=numero;
	            inicializarVector(vector, n-1, indice+1, numero);
	        }
	    }

}
