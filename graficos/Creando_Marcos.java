package graficos;

import javax.swing.*;

public class Creando_Marcos {

	public static void main(String[] args) {
		//instanciamos la clase miMarco con nombre marco1
		miMarco marco1 = new miMarco();
		//Hacemos visible el marco ,dado que por defecto es invisible
		marco1.setVisible(true);
		// Le decimos que cuando se cierre el marco el programa tiene que acabar
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
// Creamos una clase llamada miMarco y le damos extends para poder heredar todos los metodos de JFrame 
 class miMarco extends JFrame{
	 // Creamos el constructor 
	 public miMarco () {
		 // estableceremos el tamaño de la ventana 
		 setSize(500,300);
		 
	 }
	 
 }