package pruebasIniciales;

public class String_ManipulandoCadenas {

	//String no es un tipo primitivo 
	public static void main(String[] args) {
	
		String 	nombre = "DanieL";
		String apellidos = "Camel Case";
		
		System.out.println("Mi nombre es : "+ nombre+" y mis apellidos son : "+ apellidos);
		System.out.println("Mi nombre "+nombre+": tiene "+ nombre.length() +" letra" );
		System.out.println("La primera letra de mi nombre es : "+ nombre.charAt(0));
		// como podemos hacer que devuelva la ultima letra de forma que sea automatico
		//por si cambiamos el valor de la variable nombre en un futuro 
		
		int ultimaletra = nombre.length(); 
		System.out.println(ultimaletra); // si tiene 4 letras nos dice que son 4 (.length cuenta desde 1 )
		System.out.println("La ultima letra es : "+   nombre.charAt(ultimaletra-1)); // .charAt cuenta desde 0 por eso restamos 1 
	}

}
