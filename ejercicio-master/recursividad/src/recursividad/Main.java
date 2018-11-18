package recursividad;

public class Main {

	public static void main(String[] args) {
		Main obj= new Main();
		obj.bajarEscalera(50);
		
	}
	
	// creando un metodo para bajar una escalera de manera recursiva
	public void bajarEscalera(int escalones)
	{
		if(escalones==0)
		{
			// caso base, respuesta explicita
			System.out.println("has termiando de bajar la escalera");
			
			
		}else {
			// dominio, division del problema original en (problema-1)
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("bajando escalon " +  escalones);
			// haciendo uso de la recursividad
			bajarEscalera(escalones-1);
			
		}
	}

}
