package registro2;



public class Registro {
	
	
	static Profesores [] ps = new Profesores[10];
	
	
	public void inicializar() {
		ps[0]= new Profesores ("jorge perez",40, "Masculino");
		ps[1]= new Profesores ("daniela garcia",21, "femenino");
		ps[2]=new  Profesores ("andres roldan",30, "Masculino");
		ps[3]= new Profesores ("sara estrada",38, "femenino");
		ps[4]= new Profesores ("daniel molina",50, "Masculino");
		ps[5]=new Profesores ("luis zapata",21, "Masculino");
		ps[6]= new Profesores ("nancy garcia",39, "femenino");
		ps[7]= new Profesores ("esteban amalla",20, "Masculino");
		ps[8]= new Profesores ("isaac ariza ",44, "Masculino");
		ps[9]= new Profesores ("nora mora",29, "femenino");
	}
	
	
	

	public static void main(String[] args) {
		
		Registro r2= new Registro();
		r2.inicializar();
		System.out.println("la edad promedio es:"+ r2.edadPromedio());
		System.out.println("el profesor mas joven del grupo es"+ r2.pMasJoven());
		System.out.println("el profesor mas mayor del grupo es"+ r2.pMasEdad());
		System.out.println("numero de profesoras con mayor edad al promedio es"+ r2.prasMProm());
		System.out.println("el numero de profesores con mayor edad al promedio es"+ r2.prosMProm());
		

	}
	
	
	public static int edadPromedio()
	{
		
		int prom= 0;
		for (int i=0; i<=ps.length-1; i++)
		{
			prom  += ps[i].getEdad();
			
		}
		return prom/ps.length;
			
	}
	
	public static String  pMasJoven ()
	{
		
		int min = Integer.MAX_VALUE;
		int aux = 0;
		for (int i = 0; i < ps.length; i++) {
			if (ps[i].getEdad() < min) {
				min = ps[i].getEdad();
				aux = i;
			}
		}
		return ps[aux].getNombre();
		
		
		
	}
	
	public static String pMasEdad()
	{
		
		int max = Integer.MIN_VALUE;
		int aux = 0;
		for (int i = 0; i < ps.length; i++) {
			if (ps[i].getEdad() > max) {
				max = ps[i].getEdad();
				aux = i;
			}
		}
		return ps[aux].getNombre();
	}
	public static int prasMProm()
	{
		int counter = 0;
		for (int i = 0; i < ps.length; i++) {
			if (ps[i].getSexo() == "Femenino" || ps[i].getSexo() == "FEMENINO") {
				if (ps[i].getEdad() > edadPromedio()) {
					counter++;
				}
			}
		}
		return counter;
		
	}
	
	public static int prosMProm()
	{
		
		int counter = 0;
		for (int i = 0; i < ps.length; i++) {
			if (ps[i].getSexo() == "Masculino" || ps[i].getSexo() == "MASCULINO") {
				if (ps[i].getEdad() < edadPromedio()) {
					counter++;
				}
			}
		}
		return counter;
	}
}


