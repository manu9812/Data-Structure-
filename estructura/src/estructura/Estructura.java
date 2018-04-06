package estructura;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Estructura {

	
	static BufferedReader br = new BufferedReader (new InputStreamReader ( System.in ) );
    static BufferedWriter bw = new BufferedWriter (new OutputStreamWriter ( System.out ) );
	public static void main(String[] args)   throws IOException{


		int option;
		
		do
		{
			option = option();
			int[] parameters = getParameters(option);
			operation(option, parameters);
		}
		while(option != 8);

	}
	public static int option() throws IOException
	{
		bw.write("\n\nSeleccione alguna de las siguientes opciones: \n1. punto1 \n2. punto2 \n3. punto3 \n4. punto4 \n5. punto5 \n6. punto6 \n7. punto7 \n8. Salir\n ");
		bw.flush();
		int option = Integer.parseInt(br.readLine());
		return option;

	}



	public static int[] getParameters(int option) throws IOException
	{
		int[] parameters=null;
		
		switch (option)
		{
			case 1:
			{
				parameters = new int [1];
				bw.write(" función recursiva que devuelve la suma de los primeros N enteros\n");
				bw.write("ingrese el  numero:\n");
				bw.flush();
				parameters[0]=Integer.parseInt(br.readLine());
			}
			break;
			
			case 2:
			{
				parameters = new int [1];
				bw.write(" suma de los enteros positivos pares desde N\r\n" + 
						"hasta 2\n");
				bw.write("ingrese el  numero:\n");
				bw.flush();
				parameters[0]=Integer.parseInt(br.readLine());
				
			}
			break;
			case 3:
			{
				parameters = new int [1];
				bw.write(" parámetro n de tipo\r\n" + 
						"entero y que devuelve el n-ésimo número de Fibonacci.\n");
				bw.write("ingrese el  numero:\n");
				bw.flush();
				parameters[0]=Integer.parseInt(br.readLine());
				
			}
			break;
			
			case 4:
			{
				
				bw.write(" ordenar de menor a mayor un arreglo\n");
				bw.write("ingrese los numeros del arreglo separados por comas:\n");
				bw.flush();
				bw.write(":\n");
				bw.flush();
				String []num =br.readLine().split(",");
				parameters = new int [num.length];
				for(int i=0; i<num.length;i++)
				{
					parameters[i]=  Integer.parseInt(num[i]);
				}
			
			}case 5:
			{
				parameters = new int [2];
				bw.write("cuantas maneras diferentes tengo para elegir r cosas\r\n" + 
						"distintas de un conjunto de n cosas\n");
				bw.write("ingrese el valor de n :\n");
				bw.flush();
				parameters[0]=Integer.parseInt(br.readLine());
				bw.write("ingrese el valor de r :\n");
				bw.flush();
				parameters[1]=Integer.parseInt(br.readLine());
				
			}
			break;
			
			case 6:
			{
				parameters = new int [2];
				bw.write(" calcule el máximo común divisor (MCD) de dos enteros\r\n" + 
						"positivos. \n");
				bw.write("ingrese el valor 1:\n");
				bw.flush();
				parameters[0]=Integer.parseInt(br.readLine());
				bw.write("ingrese el valor 1:\n");
				bw.flush();
				parameters[1]=Integer.parseInt(br.readLine());
			}
			break;
			
			
			case 7:
			{
				parameters = new int [1];
				bw.write("resultado de esta función para distintos valores de X\n");
				bw.write("ingrese el valor de x:\n");
				bw.flush();
				parameters[0]=Integer.parseInt(br.readLine());
				
			}
			break;
			default:
			{
			  System.exit(0);
			}
		}
	   
		return parameters;
	}
	
	
	public static void operation(int option, int[]parameters) throws IOException
	{
		Puntos operation = new Puntos();
		
		switch (option)
		{
			case 1:
			{
				int result = operation.suma(parameters[0]);
				bw.write("El resultado de la suma es: " + result + "\n");
				bw.flush();
			}
			break;
			
			case 2:
			{
				
				
				if (parameters[0] % 2 != 0) 
				{
					bw.write(" error el valor ingresado es impar N\r\n" + 
							"hasta 2 es: \n");
					bw.flush();
                }
				else
					System.out.println("el resultado es "+ operation.SumaPares(parameters[0]));
					
				
			}
			
			break;
			
			case 3:
			{
				int result = operation.fibonacci(parameters[0]);
				bw.write("El resultado de la sucesion de fibonacci  es: " + result + "\n");
				bw.flush();
			}
			break;
			
			case 4:
			{
				int[] result = operation.cuartop(0,parameters[0]);
				for (int i=0;  i<result.length;i++)
				{
					System.out.println(result[i]);
				}
				bw.write("El arreglo ordenado es: " + result + "\n");
				bw.flush();
				
			}
			break;
			
			case 5:
			{
				int result = operation.punto5(parameters[0], parameters[1]);
				bw.write("la forma para elegir r cantidad de maneras distintas es : " + result + "\n");
				bw.flush();
			}
			break;
			
			case 6:
			{
				int result = operation.mcd(parameters[0],parameters[1] );
				bw.write("El resultado del maximo comun divisor es : " + result + "\n");
				bw.flush();
			}
			break;
			case 7:
			{
				int result = operation.f(parameters[0] );
				bw.write("El resultado del valor de x es : " + result + "\n");
				bw.flush();
			}
			break;

			
			default:
			{
			  System.exit(0);
			}
			}
		}
			
			
	}

