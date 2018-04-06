import java.io.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		bw.write("Por favor, digite la cantidad de lecturas experimentales"
				+ " que desea tener en el archivo: ");
		bw.flush();
		
		int lines = Integer.parseInt( br.readLine() );
		
		CreateFile cf = new CreateFile(lines);
		SearchMotif sm = new SearchMotif();

		bw.write("\nDe que tamanio desea encontrar el motif mas representativo: ");
		bw.flush();
		
		int length = Integer.parseInt( br.readLine() );
		
		sm.generateKMeans(length, "");
		bw.write( sm.toString() );
		bw.close();
		br.close();
	}

}