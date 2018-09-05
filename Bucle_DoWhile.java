package pruebasIniciales;

import javax.swing.JOptionPane;

public class Bucle_DoWhile {

	public static void main(String[] args) {
	
		String genero = "";
		
		do {
			
			genero = JOptionPane.showInputDialog("Introduzca si es hombre o mujer, por favor");
			
		}while(genero.equalsIgnoreCase("Hombre")==false&&genero.equalsIgnoreCase("Mujer")==false);

		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su altura, por favor"));	
			
		int pesoIdeal = 0;
		
		if (genero.equalsIgnoreCase("Hombre")){
			
			pesoIdeal = (altura - 110);
			System.out.println("Su peso ideal es "+ pesoIdeal+" kilos");
			JOptionPane.showMessageDialog(null, "su peso ideal es "+ pesoIdeal+"Kilos");
			
		}else if(genero.equalsIgnoreCase("Mujer")){
			
			pesoIdeal = (altura-120);
			System.out.println("Su peso ideal es "+ pesoIdeal+" Kilos");
			JOptionPane.showMessageDialog(null,"Su peso ideal es "+ pesoIdeal+" Kilos");
		}
		
		}
		
	}


