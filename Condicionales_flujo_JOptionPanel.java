package pruebasIniciales;

import javax.swing.JOptionPane;

public class Condicionales_flujo_JOptionPanel {

	public static void main(String[] args) {
		
		String nombreUsuario=JOptionPane.showInputDialog("Introduzca su nombre, por favor");
		
		String edad = JOptionPane.showInputDialog("Intruduzca su edad, por favor");
	
		int edadUsuario = Integer.parseInt(edad);
		
		System.out.println("Hola usuario "+ nombreUsuario+" su edad es "+ edadUsuario +" y el año que viene sera "+ (edadUsuario+1) +" años");
		
	}
}
