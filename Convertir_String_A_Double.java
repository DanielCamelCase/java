package pruebasIniciales;

import javax.swing.JOptionPane;

public class Convertir_String_A_Double {

	public static void main(String[] args) {
		
		String num1 = JOptionPane.showInputDialog("Introduzca un numero para calcular su raiz cuadrada");
		
		// asi convertimos NUM1(string) a NUM2(double)
		Double num2 = Double.parseDouble(num1);
		
		// imprimimos el resultado 
		System.out.print("La raiz cuadrada de "+ num1 + " es ");
		
		// para poder usar .sqrt tiene que ser un double
		// math.sqrt como definimos en calculos con math hace la raiz cuadrada de un numero 
		System.out.printf("%1.2f", Math.sqrt(num2));

	}

}
