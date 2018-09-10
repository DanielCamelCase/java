package poo;

import javax.swing.JOptionPane;

public class Uso_Coche {

	public static void main(String[] args) {
		
		//ahora vamos a crear los objetos, denominado INSTANCIAR UNA CLASE
		Coche_Poo Renault = new Coche_Poo();
		
		// al poner Renault.ruedas nos muestra las ruedas que definimos en la 
				//clase Coche_Poo 
		System.out.println("Renault ");
		System.out.println("Las ruedas de nuestro coche son "+ Renault.ruedas);
		System.out.println("El largo de nuestro coche es "+ Renault.largo);
		System.out.println("El ancho de nuestro coche es "+ Renault.ancho);
		System.out.println("El peso de nuestro coche es "+ Renault.peso);
		
		//Para poder usar la variable "descapotable" al estar encapsulada en Coche_Poo necesitamos 
		// usar un metodo que creamos en Coche_Poo mediante un metodo GETTER
		System.out.println("Nuestro coche es descapotable ?"+Renault.dimeDescapotable() );
		//Ahora llamaremos al metodo SETTER para establecer si tendra o no climatizador nuestro objeto Renault
		Renault.estableceClimatizador("SI");
		System.out.println(Renault.dimeClimatizador());
		//usar JOptionPane para dar un valor en lugar de darle un string de esta forma 
		//Renault.configuraAsientos("no");
		Renault.configuraAsientos(JOptionPane.showInputDialog("introduce si quieres asientos de cuero en tu coche (si o no )"));
		System.out.println(Renault.dimeAsientos());
		
		Coche_Poo Seat = new Coche_Poo();
		
		Seat.estableceClimatizador(JOptionPane.showInputDialog("introduce si quieres que tenga climatizador (si o no )"));
		
		System.out.println("Seat");
		System.out.println(Seat.dimeClimatizador());
		//aqui unimos el peso(chasis) al peso total 
		Seat.establecerpesoTotal(1500-Seat.peso);
		System.out.println(Seat.dimePesoTotal());
		System.out.println(Seat.dimeDatosGenerales() );
		
		Seat.configuraAsientos("si");
		System.out.println(Seat.dimeAsientos());
	}

}
