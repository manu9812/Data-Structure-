import java.io.*;

public class NumRomanos {
	
	
	

	public static void main(String[] args) throws IOException {
	String line;
	do {
		line =LeerFichero();
		int numero = Resultado(line);
		EscribirFichero(String.valueOf(numero));
		}while(line == null);
	}
	public static void EscribirFichero(String linea) throws IOException {
		String ruta = "arabigo.txt";
		BufferedWriter bw = new BufferedWriter(new FileWriter(ruta));
		try {
			bw.write(linea +"\n");
			System.out.println("se leyo el archivo correctamente");
		} catch (Exception e) {
			System.err.println("ERROR No se ha podido leer el archivo");
		}
		bw.close();
	}
	public static String ruta() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("por favor ingresa la ruta del archivo a convertir");
		return null;
	}
	public static String LeerFichero() throws FileNotFoundException {
		BufferedReader br = new BufferedReader(
				new FileReader("Romano.txt"));
		String line = null;
		try {
			line = br.readLine();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return line;
	}

	public static int Resultado(String line) {
		int sum = 0;
		for (int i = 0; i < line.length(); i++) {
			sum += Conversion(line.charAt(i));
		}
		return sum;
	}

	public static int Conversion(char Romano) {
		if (Romano == 'I') {
			return 1;
		} else if (Romano == 'V') {
			return 5;
		} else if (Romano == 'X') {
			return 10;
		} else if (Romano == 'L') {
			return 50;
		} else if (Romano == 'C') {
			return 100;
		} else if (Romano == 'D') {
			return 500;
		} else if (Romano == 'M') {
			return 1000;
		} else {
			return 0;
		}
	
		
		
	}
}
	


