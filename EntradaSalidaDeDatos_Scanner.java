package pruebasIniciales;

import java.util.Scanner;

public class EntradaSalidaDeDatos_Scanner {

	public static void main(String[] args) {
		
		// Scanner sirve para introducir datos  le damos nombre ENTRADA 
		// y definimos que new scanner va a recibir(in) datos por System(consola)
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("introduzca su nombre,  por favor?");
		
		//creamos una variable para almacenar el texto String y usamos el metodo para
		//recibir un String que es .nextline
		
		String nombreUsuario = entrada.nextLine();
		
		System.out.println("Introduzca su edad, por favor?");
		
		//aqui creamos una variable int para recibir un numero(edad) y usamos el 
		//metodo .nextInt para indicar que es un int(entero)
		
		int edad = entrada.nextInt();
		
		// de esta manera llamamos las variables almacenadas y las imprimimos en pantall
		System.out.println("hola "+ nombreUsuario +"tu edad es "+ edad );
		
		
		
		
	}

}
