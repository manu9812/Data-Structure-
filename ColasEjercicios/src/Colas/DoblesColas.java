package Colas;

public class DoblesColas {

	private int max = 10;
	private int frenteDC, finalDC;
	private String[] DobleCola = new String[max];
	public DoblesColas() {
		finalDC = -1;
		frenteDC = -1;
	}
	
	public void IngresarPorDerecha(String dato) 
	{
		if(finalDC==max-1 && frenteDC == 0) {  // Esta llena la bicola?
			System.out.println("bicola llena, elimine un elemento para ingresar mas");
			return;
		}
		if(finalDC == max-1 && frenteDC != 0) {
			finalDC = 0;
			DobleCola[finalDC] = dato;
			return;
		}
		if(finalDC != max-1 && frenteDC > finalDC+1 && frenteDC != 0 ) {
			finalDC++;
			DobleCola[finalDC] = dato;
			return;
		}
		if(finalDC+1 == frenteDC) {
			System.out.println("Pila llena, elimine para ingresar mas");
			return;
		}
		
		if(frenteDC == -1) {
			frenteDC++;
		}
		finalDC++;
        DobleCola[finalDC]=dato; // Alta al final
        System.out.println("Dato insertado al final !!!");
        return;
	}
	
	public void IngresarPorIzquierda(String dato) {
		if(frenteDC == 0 && finalDC == max-1) {
			System.out.println("bicola llena, elimine para agregar mas");
			return;
		}	
		if(frenteDC == 0 && finalDC != max-1) {
			frenteDC = max-1;
			DobleCola[frenteDC] = dato;
			return;
		} 
		if(frenteDC != 0 && finalDC < frenteDC-1 && finalDC != max-1) {
			frenteDC--;
			DobleCola[frenteDC] = dato;
			return;
		} 
		if(frenteDC-1 == finalDC) {
			System.out.println("biCola llena");
			return;
		}			
		
		if(frenteDC == -1) {
			frenteDC++;
			finalDC++;
			DobleCola[frenteDC] = dato;
			System.out.println("Dato insertado al frente");
			return;
		}
		frenteDC--;
		DobleCola[frenteDC] = dato;
		System.out.println("Dato insertado al frente");
		return;
	}
	
	public void EliminarPorDerecha() {
		 if(finalDC==-1) { // Esta vacia la Pila?
    		 System.out.println("Pila vacia !!!");
    		 return;
	     }
		 if(finalDC == frenteDC) {
	    	 finalDC = -1;
	    	 frenteDC = -1;
	    	 return;
	     }
		 if(finalDC == 0) {
			 finalDC = max-1;
			 System.out.println("Dato final eliminado");
		 }
		 System.out.println("Dato final eliminado");
		 finalDC--;
	}
	
	public void EliminarPorIzquierda() {
		if(frenteDC == -1) {
			System.out.println("Pila vacia");
			return;
		}
		if(frenteDC == finalDC) {
			frenteDC = -1;
			finalDC = -1;
			return;
		}
		if(frenteDC == max-1) {
			frenteDC = 0;
			return;
		}
		System.out.println("Dato del frente eliminado");
		frenteDC++;
	}
	
	public String Mostrar() 
	{
		System.out.print("Bicola: ");
		int frenteAux = frenteDC; 
		int finalAux = finalDC;
		String strCola = "[";
		do {
			if(frenteDC == -1) {
				strCola += "]";
				frenteAux += 1;
			}else {
				if(frenteAux == finalAux) {
					strCola += DobleCola[frenteAux]+"]";
					frenteAux += 1;
				}else {
					if(frenteAux == max-1) {
						strCola += DobleCola[frenteAux]+",";
						frenteAux = 0;
					}else {
						strCola += DobleCola[frenteAux]+",";
						frenteAux += 1;
					}
				}
			}
		}while(frenteAux != finalAux+1);
		
		return strCola;
	}
}
