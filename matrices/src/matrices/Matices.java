package matrices;

public class Matices {
	
	
	/**
	 * 
	 * @param matriz
	 */
	public static void imprimirMatriz(int[][] matriz) {
		  int lado = matriz[0].length;
		  int x = 0;
		  int y = 0;
		  int yAux = 0;
		  int yAnt = 0;
		  int i = 0;
		  int xAnt = -1;
		  boolean terminado = false;
		  while (!terminado) {
		    x = (i < lado ? i : lado -1);
		    yAux = (x != xAnt ? yAux : yAux + 1);
		    y = (yAux < lado ? yAux : lado -1);
		    xAnt = x;
		    yAnt = (y == lado -1 ? yAnt + 1 : yAnt);
		    terminado = (yAnt > 0 ? true : false);
		    while (x >= 0 && y < lado) {
		        System.out.print(matriz[y][x] + " ");
		        x--;
		        y++;
		    }
		    i++;
		  }
		}
	
	/**
	 * 
	 * @param matriz
	 */
	
	 public static void imprimirMatriz2(int[][] matriz) {
		  int lado = matriz.length;
		  for (int i = lado - 1; i >= 0; i--) {
		    for (int j = i; j >= 0; j--) {
		        System.out.print(matriz[i][j] + " ");
		    }

		 }
	 }
	 
	 /**
	  * 
	  * @param args
	  */
	public static void main (String[]args)
	{
		   int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		    imprimirMatriz(matriz);
		    System.out.println("\n");
		    imprimirMatriz2(matriz);
	}

}
