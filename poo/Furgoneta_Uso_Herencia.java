//Coche_Poo, Uso_Vehiculo y Furgoneta_Uso_Herencia para este ejemplo de herencias son necesirios
package poo;
// con extends Coche.. vamos a decir a eclipse que la clase furgoneta va a heredar de la clase Coche..
// furgoneta sera la subclase y la clase Coche.. sera la superclase

public class Furgoneta_Uso_Herencia extends Coche_Poo {

	private int capacidadCarga;
	private int plazasExtra;
	
	public Furgoneta_Uso_Herencia(int plazasExtra,int capacidadCarga) {
		// super llama al constructor de la superclase (Coche_Poo)
		super();
		//this lo usamos por que el metodos y la variables se llaman igual
		//de esta forma definimos el estado inicial de las variables que son de la subclase furgoneta
		this.capacidadCarga=capacidadCarga;
		this.plazasExtra=plazasExtra;
		
	} 
	
	public String dimeDatosFurgoneta() {
		
		return "La capacidad de carga de la furgoneta es: "+ capacidadCarga+" Y las plazas extra son: "+plazasExtra;
		
	}
	
}
