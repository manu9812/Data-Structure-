import java.io.*;

public class SearchMotif {

	private String motifWinner;
	private int max;
	
	public SearchMotif() 
	{
		this.max = -1;
		this.motifWinner = "";
	}

	public int countReads(String motif)
	{
		int counter = 0;
		
		try
		{
			BufferedReader br = new BufferedReader( new FileReader( "sequences.umd" ) );
			String read = br.readLine();
			
			while(read != null)
			{
				counter += read.contains(motif) ? 1 : 0;
				read = br.readLine();
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		return counter;
	}
	
	
	public void generateKMeans(int length, String motif)
	{
		int tempCounter;
		if(length == 1) //last ones
		{
			tempCounter = countReads(motif + "A");
			if(tempCounter > max)
			{
				motifWinner = motif + "A";
				max = tempCounter;
			}	
			
			tempCounter = countReads(motif + "C");
			if(tempCounter > max)
			{
				motifWinner = motif + "C";
				max = tempCounter;
			}	
			
			tempCounter = countReads(motif + "G");
			if(tempCounter > max)
			{
				motifWinner = motif + "G";
				max = tempCounter;
			}	
			
			tempCounter = countReads(motif + "T");
			if(tempCounter > max)
			{
				motifWinner = motif + "T";
				max = tempCounter;
			}	
		}
		else
		{
			generateKMeans(length - 1, motif + "A");
			generateKMeans(length - 1, motif + "C");
			generateKMeans(length - 1, motif + "G");
			generateKMeans(length - 1, motif + "T");
		}
	}
	
	
	public void reset()
	{
		max = 0;
	}

	
	public String toString()
	{
		return "\nEl motif que mas se repite es " + this.motifWinner 
				+ " y se repite " + this.max + " veces.\n"; 
	}
	
	
	public static void main(String[] args) 
	{
		SearchMotif sm = new SearchMotif();
		System.out.println( sm.countReads("ACTC")  + "\n" );
		
		sm.reset();
		sm.generateKMeans(3, "");
		System.out.println( sm.toString() );
		
		sm.reset();
		sm.generateKMeans(4, "");
		System.out.println( sm.toString() );
		
		sm.reset();
		sm.generateKMeans(5, "");
		System.out.println( sm.toString() );
		
		sm.reset();
		sm.generateKMeans(6, "");
		System.out.println( sm.toString() );
		
		sm.reset();
		sm.generateKMeans(7, "");
		System.out.println( sm.toString() );
	}
}