package pruebasIniciales;

import javax.swing.*;

public class Bucles_while_Simular_Contraseña {

	public static void main(String[] args) {
		
		// definimos clave y pass para poder compararlas mas tarde con .equals
		String clave = "Contraseña";
		
		String pass = "";
		
		// mientras que clave sea diferente a pass repite lo que hay dentro de while
		while(clave.equals(pass)== false) {
			
			pass =JOptionPane.showInputDialog("introduzca la clave de acceso");
			
			if (clave.equals(pass)==false) {
				
				System.out.println("Introduzca la clave correcta");
				// con este metodo de JOptionPane mostramos el mensaje..
				JOptionPane.showMessageDialog(null, "Clave incorrecta");
			}
		}
		// cuando introduce la palabra correcta sale del bucle(while)y salta aqui
		System.out.println("Contraseña correcta. Acceso concedido");
		JOptionPane.showMessageDialog(null, "Acceso Concedido");
	}

}
