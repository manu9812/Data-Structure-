package cribaErastostenes;

import java.util.Scanner;

public class criba {

	
	  public static void main(String[] args) {

	        System.out.println("Escriba el valor de n para los primos entre el rango 0 - n ");

	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();

	        long start, end;
	        start = System.currentTimeMillis();

	        int tope = (int) Math.floor(Math.sqrt(n));

	        boolean[] primos = new boolean[n + 1];

	        for (int i = 2; i <= tope; i++) {
	            if (primos[i] == false) {
	                for (int j = i; j <= n / i; j++) {
	                    primos[j * i] = true;
	                }
	            }
	        }

	        int count = 1;
	        for (int i = 2; i < n; i++) {
	            if (primos[i] == false) {
	                count++;
	                System.out.printf("%10d", i);
	            }
	            if (count == 10) {
	                count = 1;
	                System.out.println("\n");
	            }
	        }
	        end = System.currentTimeMillis();
	        System.out.println("\n");
	        System.out.println((end - start) / 1000f);
	        System.out.println("\n");
	    }
}
