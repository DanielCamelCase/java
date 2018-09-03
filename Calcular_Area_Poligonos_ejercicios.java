package pruebasIniciales;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Calcular_Area_Poligonos_ejercicios {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
		
		System.out.println("eligir una opcion: \n1: Cuadrado \n2: Rectagulo \n3: Triangulo \n4: Circulo ");
		
		int figura = entrada.nextInt();
		
		switch (figura) {
		
		case 1:
			
			int lado =Integer.parseInt(JOptionPane.showInputDialog("introduzca el lado"));
			System.out.println("El area del cuadrado es "+ Math.pow(lado, 2));
			break;
		
		case 2: 
			
			int base = Integer.parseInt(JOptionPane.showInputDialog("introduzca la base "));
			int altura = Integer.parseInt(JOptionPane.showInputDialog("introduzca la altura "));
			System.out.println("El area del rectagulo es "+ base * altura);
			break;
			
		case 3:
			base = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la base"));
			altura = Integer.parseInt (JOptionPane.showInputDialog("introduzca la altura"));
			System.out.println("El area del triangulo "+ base*altura/2);
			break;
			
		case 4:
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el radio del circulo"));
			System.out.print("El area del circulo es ");
			System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
			break;
		}
		
	}

	}

