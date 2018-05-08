package matrices;

public class Matriz {

	public static void main(String args[]) {

        Matriz matriz=new Matriz(5); 
        matriz.imprimirMatriz();
    }

    private int [][] matriz;
    private int dimension;

    public Matriz(int dimension){
        this.dimension = dimension;
        matriz = new int[dimension][dimension];
        generarMatriz();
    }

    private final void generarMatriz(){
        for (int y = 0; y < dimension; y++){
            for (int x = 0; x < dimension; x++){
                matriz[x][y]=1+x+y*dimension;
                System.out.print(String.format("%02d ",matriz[x][y]));
            }
            System.out.println();
        }
    }

    private boolean outBounds(int x, int y){
        return ( x<0 || x>=dimension || y<0 || y>=dimension );
    }

    private void imprimirDiagonal(int a, int b){
        int x = a;
        int y = b;
        do{
            System.out.print(String.format("%d ", matriz[x--][y++]));
        }while(!outBounds( x, y ));
    }

    public void imprimirMatriz(){
        for (int x = 0; x < dimension; x++ ) imprimirDiagonal( x, 0 );
        for (int y = 1; y < dimension; y++ ) imprimirDiagonal( dimension-1, y );
    }

}    
