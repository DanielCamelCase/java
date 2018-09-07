package pruebasIniciales;

import javax.swing.JOptionPane;

public class Matriz_3_Mas_JOptionPane {

	public static void main(String[] args) {
		
		String [] paises = new String[8];
		
		for (int i=0;i<8;i++) {
		
			paises [i] = JOptionPane.showInputDialog("introduzca pais"+ (i+1));
		
		}
	
		for (String elemento:paises) {
			
		System.out.println("paises: "+ elemento);
	
		}
	}
}
