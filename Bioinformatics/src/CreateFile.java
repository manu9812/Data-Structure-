
import java.io.*;
import java.util.Random;

public class CreateFile {

	public CreateFile(int lines) 
	{
		try
		{
			BufferedWriter bw = new BufferedWriter( new FileWriter( "sequences.umd" ) );
			
			for(int i = 0; i < lines; i++)
				bw.write( createExperimentalRead() );
			
			bw.flush();
			bw.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	
	public String createExperimentalRead()
	{
		int start, length;
		Random rd = new Random();
		
		start = Math.abs(rd.nextInt());
		length = 5 + rd.nextInt(26);
		
		return (start + "," + (start + length) + "," + createSequences(length) + "\n");
	}
	
	
	public String createSequences(int length)
	{
		Random rd = new Random();
		String sequence = "";
		
		for(int i = 0; i < length; i++)
			switch(rd.nextInt(4))
			{
				case 0: 	sequence += "A";	break;
				case 1: 	sequence += "C";	break;
				case 2: 	sequence += "G";	break;
				case 3: 	sequence += "T";	break;
			}
		
		return sequence;
	}
	
	
	public static void main(String[] args) 
	{
		CreateFile cf = new CreateFile(1000);
	}
}
