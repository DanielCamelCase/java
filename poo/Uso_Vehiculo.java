//Coche_Poo, Uso_Vehiculo y Furgoneta_Uso_Herencia para este ejemplo de herencias son necesirios
package poo;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		//tenemos que llamar el objeto igual que se llama la clase por eso el Coche_Poo
		Coche_Poo micoche1 = new Coche_Poo();
		
		micoche1.estableceClimatizador("si");
		micoche1.configuraAsientos("si");
	//Aqui pasa igual que con Coche_Poo tenemos que llamar el objeto Furgoneta de la misma
	// forma que llamamos a la clase Furgoneta_Uso_Herencia
		Furgoneta_Uso_Herencia mifurgoneta1 = new Furgoneta_Uso_Herencia(7, 580);
		
		mifurgoneta1.estableceClimatizador("si");
		mifurgoneta1.establecerpesoTotal(2500);
		
		System.out.println(micoche1.dimeDatosGenerales());
		//aqui heredamos los datosgenerales creados en Coche_Poo en furgoneta
		System.out.println(mifurgoneta1.dimeDatosGenerales()+
				// aqui abajo concatenamos los datos de furgoneta que son expecificos de ella
						   mifurgoneta1.dimeDatosFurgoneta());
	}

}
