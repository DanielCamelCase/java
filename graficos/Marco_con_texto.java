package graficos;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Marco_con_texto {
	public static void main(String[] args) {
		
		MarcoConTexto mimarco =  new MarcoConTexto();
		
	}
}

class MarcoConTexto extends JFrame {
	
	public MarcoConTexto() {
	setVisible(true);
	setSize (600,450);
	setLocation(400,200);
	setTitle("Primer texto");
	Lamina milamina = new Lamina();
	add(milamina);
	}
}

class Lamina extends JPanel {
	
	public void paintComponent ( Graphics g ){
		super.paintComponent(g);
		g.drawString("hola mundo",10,20);
	}
}