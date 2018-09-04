package pruebasIniciales;

import java.util.*;

import javax.swing.JOptionPane;

public class Bucles_while_Acertar_Numeros {

	public static void main(String[] args) {
		
		// random devuelve un aleatorio entre 0 y 1 de caracter double por lo que lo que devuelve lo multiplicamos por 100 para que tenga
		// una parte entera y con el =(int) hacemos una refundicion de double en un entero 
		int aleatorio =(int)(Math.random()*100);
		
		Scanner entrada =new Scanner(System.in);
		
		int numero =0;
		
		int intentos =0;
		
		while(numero!=aleatorio){
			
			intentos++;
			
			System.out.println("Introduzca un numero, por favor");
		
			numero = entrada.nextInt();
			
			if (aleatorio < numero) {
				
				System.out.println("El numero que buscas es mas Bajo");
				
			}
		
			else if (aleatorio > numero) {
				
				System.out.println("El numero que buscas es mas Alto");
			}
		}
		// en el archivo "Juego_adivinar_numero_ejercicios" introduciremos un limite para que 
		// cuando el jugador lo pase pierda 
		System.out.println("Has acertado, Felicidades lo has conseguido en " + intentos);
		JOptionPane.showMessageDialog(null, "Lo conseguiste en "+ intentos+ "intentos");
	}

}
