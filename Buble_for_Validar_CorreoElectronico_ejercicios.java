package pruebasIniciales;

// libreria necesaria para usar el JOptionPane
import javax.swing.JOptionPane;

//video 22 al principio me he quedado 

public class Buble_for_Validar_CorreoElectronico_ejercicios {

	public static void main(String[] args) {
	
	//definimos que arroba no esta hasta que se encuentre
	int arroba = 0; 
	boolean punto = false;
	
	// pedimos el correo y almacenamos en variable string
	String correo = JOptionPane.showInputDialog("introduzca su correo electronico");
	
	// va a revisar cada letra(.length) 
	for(int i=0; i<correo.length();i++){
		
		// buscara el caracter arroba(@)
		if (correo.charAt(i)=='@') {
			
			
			arroba++;
			
		}
		if (correo.charAt(i)=='.') {
			
			// si lo encuentra cambiara el boleano arroba a true
			punto = true;
			
		}
		
	}
	// si arroba y punto es igual(==) a true
	if (arroba==1 && punto==true) {
		
		//imprime correcto por consola
		System.out.println("Es correcto");
		
		//sino es true el boleano.. imprimira No es correcto
	}else {
		
		System.out.println("el email no es correcto");
		
	}

	}
}
