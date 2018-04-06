import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Romanos {


	public static void main(String[] args) throws IOException {
		LeerFichero();
	}

	
	public static void EscribirFichero(BufferedWriter bw, String linea) throws IOException {

		try {
			bw.write(linea + "\n");
			System.out.println("");
		} catch (Exception e) {
			System.err.println("ERROR EN LA ESCRITURA DEL ARCHIVO");
		}

	}

	
	public static void LeerFichero() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\manuela garcia\\eclipse-workspace\\NumRomanos\\src\\arabigo.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\manuela garcia\\eclipse-workspace\\NumRomanos\\src\\Romano.txt"));
		String line = null;
		try {
			line = br.readLine();
			while (line != null) {
				EscribirFichero(bw, String.valueOf(suma(line)));
				line = br.readLine();
			}
			bw.close();
		} catch (Exception e) {
			
		}
	}

	
	
	
	public static int Romano(char Romano) {
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
	
	
	public static int suma(String line) {
		int Add = 0;
		for (int i = 0; i < line.length(); i++) {
			if (i <= line.length() - 1) {
				if (i < line.length() - 1) {
					if (Romano(line.charAt(i + 1)) > Romano(line.charAt(i))) {
						Add += Romano(line.charAt(i + 1)) - Romano(line.charAt(i));
					} else {
						Add += Romano(line.charAt(i));
					}
				} else {
					if (Romano(line.charAt(i - 1)) == Romano(line.charAt(i))) {
						Add += Romano(line.charAt(i));
					}
					if (Romano(line.charAt(i - 1)) > Romano(line.charAt(i))) {
						Add += Romano(line.charAt(i));
					}
				}

			}
		}
		return Add;
	}

	}


