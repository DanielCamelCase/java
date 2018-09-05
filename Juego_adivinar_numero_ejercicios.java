package pruebasIniciales;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Juego_adivinar_numero_ejercicios {

	public static void main(String[] args) {
		// random devuelve un aleatorio entre 0 y 1 de caracter double por lo que lo que devuelve lo multiplicamos por 100 para que tenga
		// una parte entera y con el =(int) hacemos una refundicion de double en un entero 
		int aleatorio =(int)(Math.random()*100);
		
		Scanner entrada =new Scanner(System.in);
		
		int numero =0;
		
		int intentos =0;
		
		int limite = 6;
		
		
		while(numero!=aleatorio){
			
		
			// incrementamos en 1 a intentos cada vez que repite el while
			intentos++;
			
			System.out.println("Introduzca un numero, por favor");
		
			numero = entrada.nextInt();
			
			if (aleatorio < numero) {
				
				System.out.println("El numero que buscas es mas Bajo");
				
			}
		
			else if (aleatorio > numero) {
				
				System.out.println("El numero que buscas es mas Alto");
				}
			// con esto controlamos el numero de veces que se repite el while que incrementa 1 cada vez en intentos
						// mientras intentos es menor o igual a limite no pasa nada cuando lo supere se ejecuta el else y dice que el jugador perdio 
						if (intentos<limite) {
							System.out.println("intento "+ intentos+"/"+limite);
						}
						
						else {
							System.out.println("Has perdido, usaste mas de " + intentos+"/"+limite);
							JOptionPane.showMessageDialog(null, "has perdido pasaste de "+ intentos+"/"+limite);
							}
		}
		}

}