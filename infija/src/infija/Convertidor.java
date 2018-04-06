package infija;

public class Convertidor {
	public static String convertirApostfija(String infija){
		String postfija= "";
		Pila pila= new Pila(30);
		 
		for (int i=0; i<infija.length(); i++){
		char letra= infija.charAt(i);
		if (esOperador(letra)){
		  if (letra== ')'){
		 
		while(pila.getTope()!= '(')
		   postfija += pila.pop();
		     if(pila.getTope()== '(')
		     pila.pop();
		}
		 
		   if (pila.vacia()){
		    if (letra!= ')')
		      pila.push(letra);
		   } else{
		    if (letra!= ')'){
		      int pe= prioridadExp(letra);
		      int pp= prioridadPila((char)pila.getTope());
		    if (pe > pp){
		      pila.push(letra);
		   } else {
		      postfija += pila.pop();
		  pila.push(letra);
		}
	}
		 
}
		 
	}else
	postfija += letra;
		 
		}
		 
	 while (!pila.vacia()){
	postfija += pila.pop();
	}
		return postfija;
		}
		 
		public static String convertirAprefija(String infija){
		String prefija= "";
		String invertida="";
		Pila pila= new Pila(30);
		 
		for (int i = infija.length()-1; i > -1; i--){
		  char letra= infija.charAt(i);
		     if (esOperador(letra)){
		      if (letra== '('){
		 
		  while(pila.getTope()!= ')')
		   prefija += pila.pop();
		    if(pila.getTope()== ')')
		     pila.pop();
		  }
		 
		    if (pila.vacia()){
		      if (letra!= '(')
		        pila.push(letra);
		        } else{
		      if (letra!= '('){
		        int pe= prioridadExp(letra);
		         int pp= prioridadPila((char)pila.getTope());
		            if (pe > pp){
		            pila.push(letra);
		   } else {
		         prefija += pila.pop();
		         pila.push(letra);
		     }
		   }
		 
		}
		 
		}else
		  prefija += letra;
		 
		}
		 
		while (!pila.vacia()){
		   prefija += pila.pop();
		}
		 
		for (int r=prefija.length()-1; r>=0;r--)
		     invertida += prefija.charAt(r);
		return invertida;
		}
		 
		public static int prioridadExp(char x){
		if (x == '^') return 4;
		if (x == '*' || x == '/') return 2;
		if (x == '+' || x == '-') return 1;
		if (x == '(') return 5;
		if (x== ')') return 5;
		return 0;
		}
		 
		public static int prioridadPila(char x){
		if (x == '^') return 3;
		if (x == '*' || x == '/') return 2;
		if (x == '+' || x == '-') return 1;
		if (x == '(') return 0;
		if (x== ')') return 0;
		return 0;
		}
		 
		public static boolean esOperador(char letra){
		if (letra == '*' || letra == '/' || letra == '+' || letra == '-' || letra == '^' || letra == '(' || letra == ')'){
		return true;
		}
		else
		return false;
		}
		
}
