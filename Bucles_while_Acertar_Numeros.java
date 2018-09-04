package pruebasIniciales;

import java.util.*;

import javax.swing.JOptionPane;

public class Bucles_while_Acertar_Numeros {

	public static void main(String[] args) {
		
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
		
		System.out.println("Has acertado, Felicidades lo has conseguido en " + intentos);
		JOptionPane.showMessageDialog(null, "Lo conseguiste en "+ intentos+ "intentos");
	}

}
