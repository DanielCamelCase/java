package pruebasIniciales;

public class Variables {

	public static void main (String [] args) {
		
		byte edad ; // defino una variable pero la dejo sin valor
		edad = 26; // asigno valor a la variable vacia
		String texto = "Tu edad es : "; // aqui creo una variable de texto 
				
		System.out.print(texto);//System.out imprime por consola
		System.out.println(edad);
		
		edad = 33; // aqui cambio el valor a la variable y la reimprimo
		System.out.print("Ahora tu edad es : ");//aqui añado texto directamente
		System.out.println(edad);
		
		//declarar varias variables en una linea 
		int var1,var2,var3;
		var1 = 1;
		var2 = 2; 
		var3 = var1 * var2;
		System.out.print("valor de operacion 1*2 = "+ var3);
	}
	
}
