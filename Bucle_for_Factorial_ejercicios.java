package pruebasIniciales;

import javax.swing.JOptionPane;

public class Bucle_for_Factorial_ejercicios {

	public static void main(String[] args) {
	
		
		int resultado=1;
		
		int numero =Integer.parseInt(JOptionPane.showInputDialog("introduzca un numero"));

		for(int i=numero;i>0;i--) {
			
			resultado=resultado*i;
			
		}
	
		System.out.println("El factorial de "+numero+" es "+resultado);
		
	}

}
