//Coche_Poo, Uso_Vehiculo y Furgoneta_Uso_Herencia para este ejemplo de herencias son necesirios
// por primera vez definimos un -package-(paquete nuevo) llamado -(poo)-
package poo;

// en la clase coche_poo guardaremos las caracteristicas comunes de cualquier coche
// luego tendremos dos -objetos- que tendran diferencias pero que usaran caracteristicas comunes
// que extraeremos de la clase -coche_poo-
public class Coche_Poo {

	// con private delante de la variable lo que se hace es ENCAPSULAR 
	// al encapsular no podemos modificar el valor de descapotable desde Uso_coche
	
	int ruedas;
	int largo ;
	int ancho ; 
	int motor,peso ; 
	int pesoTotal;
	private String climatizador;
	private boolean descapotable;
	private boolean asientosCuero;
	
	
// usaremos un metodo constructor para definir el largo, el ancho, el numero de ruedas 
// peso ... etc
	//SIEMPRE debe llamarse igual la clase y el metodo constructor en nuestro caso 
	// le llamaremos coche_Poo al igual que se llamo coche_Poo la clase
	public Coche_Poo() {
		
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso = 500;
		descapotable = true;
		
	}
	// para poder usar una variable encapsulada necesitamos definir un metodo
	// de esta forma para poder usarla 
	//METODO GETTER
	public String dimeDescapotable() {
		return " "+descapotable;
	}
	public String dimeDatosGenerales() {
		return "la plataforma tiene "+ ruedas +" ruedas, un peso de plataforma "+peso+
				" un peso total de "+(pesoTotal-peso)+" un motor de "+ motor+" CC ";
	}
	
	// METODO SETTER
	public void estableceClimatizador(String climatizador){
		// Se pone this.,,, si se va a llamar igual la variable de la clase y el argumento se pone 
		//this delante de la variable de la clase para que java sepa quien es quien 
		this.climatizador = climatizador;
	}
	// Ahora para poder usar el Establece_climatizador de METODO SETTER necesitamos 
	// crear un metodo GETTER que nos devuelva su valor para poder usarlo en nuestros objetos 
	// que tenemos en Uso_Coche
	public String dimeClimatizador() {
		return "El coche tiene climatizador? "+ climatizador;
	}
	// SETTER pesoTotal
	public void establecerpesoTotal (int pesoTotalE) {
		pesoTotal = pesoTotalE;
	}
	//GETTER pesoTotal
	public int dimePesoTotal() {
		return pesoTotal;
	}
	
	//Metodo Setter funcion si definimos un "si" sera igual a true y sino (pasamos un false)
	// sera false 
	
	public void configuraAsientos(String asientosCuero) {
		
		if (asientosCuero.equalsIgnoreCase("si")) {
			this.asientosCuero=true;
		} else {
			this.asientosCuero=false;
		}
	}
	//Metodo GETTER para funcion configurar asientos del metodo SETTER
	public String dimeAsientos(){
		// si recibimos un true desde le metodo setter de configurar asientos retornara el mensaje X
		// y si recibimos un false returnaremos el mensaje Y
		if(asientosCuero==true) {
			return "El coche SI tiene asientos de cuero";
		}else {
			return"El coche NO tiene asientos de cuero";
		}
		
	}
	
}



