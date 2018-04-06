
public class TPascal {

	public static void main(String[] args) {
	
		System.out.println(pascal(3,2)  +  "  triangulo de pascal");

	}
	
	public static int pascal (int n, int k)
	{
		if(k==0|| k==n)
		return 1;
		else 
			return pascal(n-1, k-1)+ pascal(n-1,k);
	}
	
	
	
     
}
