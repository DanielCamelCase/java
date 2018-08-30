package pruebasIniciales;

import java.awt.Component;

import javax.swing.*;

public class EntradaSalidaDeDatos2_JOptionPane {
	
	public static void main(String[] args) {
		
		// usando la clase JOptionPane para mostrar un cuadro y recibir en la variable NOMBRE un valor 
		// que nos dara el usuario
		
		String nombreUsuario = JOptionPane.showInputDialog("introduzca su nombre, por favor");
		
		// aqui haremos lo mismo para la edad pero tenemos un problema la clase JOPTION... solo acepta que
		// creemos varibles de tipo string por lo que para sumar 1 a edad hay que pasarla a una var tipo INT
		String edad = JOptionPane.showInputDialog("Introduzca su edad, porfavor");
		// aqui convertimos edad(STRING) a edad_conver(INT)
		int edad_conver = Integer.parseInt(edad);
		
		System.out.println("NOMBRE DE USUARIO ES : " + nombreUsuario +" su edad es " +(edad_conver+1));
		
		
	}

}
