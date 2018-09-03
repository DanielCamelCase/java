package pruebasIniciales;

import javax.swing.JOptionPane;

public class Condicionales_flujo_JOptionPanel {

	public static void main(String[] args) {
	String edad=JOptionPane.showInputDialog("Introduzca su edad, por favor");
		
		int edadConver = Integer.parseInt(edad);
		
		if (edadConver<=18) {
			
			System.out.println("eres menor de edad con "+ edadConver+" años");
		}
	
		else {
			
		System.out.println("eres mayor de edad con "+ edadConver+" años");
		}
		
	}
}
