package graficos;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Creando_Marco_Centrado {

	public static void main(String[] args) {
		// usando la clase MarcoCentrado creamos un objeto con nombre " mimarco "  
		MarcoCentrado  mimarco = new MarcoCentrado();
		//hacemos visible a " mimarco " ya que por defecto el booleano es false 
		mimarco.setVisible(true);
		// indicamos a java que cuando cerremos el programa( X ) no se quede en segundo plano abierto
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoCentrado extends JFrame{
	
	public MarcoCentrado () {
	
		// creamos un objeto de tipo toolkit donde guardaremos el tamaño de la pantalla donde ejecutamos el programa
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		// ahora tenemos que saber el tamaño de la pantalla a traves del metodo.getScreenSize 
		// almacenamos en (tamanopantalla) la resolucion de (mipantalla)
		Dimension tamanopantalla = mipantalla.getScreenSize();
		// tenemos que crear una variable para el alto y otra para el ancho de la pantalla 
		int altura = tamanopantalla.height;
		int ancho = tamanopantalla.width;
		// le decimos que el tamaño del ancho y alto sea la mitad del total de la pantalla
		setSize(ancho/2, altura/2);
		// le decimos que la localizacion de la ventana del programa sea 1/4 del ancho y 1/4 del alto
		setLocation(ancho/4, altura/4);
		// con esto conseguimos que sea del tamaño que sea la pantalla donde se ejecute quede centrada la ventana al medio 
		setTitle("Programa centrado en java");
		// tambien podremos cambiarle el icono al programa de java asi :
		Image miIcono = mipantalla.getImage("src/graficos/icono.png");
		// guardamos el icono.png en la carpata ../src/graficos
		// definimos el icono que usaremos y que guardamos previamente en la variable " miIcono " 
		setIconImage(miIcono);
		
	}
}