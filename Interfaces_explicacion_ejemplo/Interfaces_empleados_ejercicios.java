package Interfaces_explicacion_ejemplo;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
//////////////////////////////////////////////
// INTERFACES                             //// 
// LINEA 34 LINEA 42 LINEA 74 hasta 84    ////
//////////////////////////////////////////////
// Usamos una interfaz predefinida para ordenar la salida de los usuarios por sueldo
public class Interfaces_empleados_ejercicios {

	public static void main(String[] args) {

		Jefatura jefeRRHH = new Jefatura("Javier Moreno",60000,2010,11,17);
		jefeRRHH.estableceIncentivo(2360);
		
	//instancias = objetos de la clase X( En este caso clase Empleado)
		Empleado [] misEmpleados = new Empleado[6];
		misEmpleados[0]= new Empleado("Pedro Arquero",16000,2016,6,03);
		misEmpleados[1]= new Empleado("Marta Lopez",25000,2010,12,19);
		misEmpleados[2]= new Empleado("Juaquin Moreno",12000,2017,11,27);
		//este usuario lo creamos por el segundo constructor 
		misEmpleados[3]= new Empleado("Juan Fernandez");
		misEmpleados[4]= jefeRRHH;// POLIMORFISMO EN ACCION para jefeRRHH 
		misEmpleados[5]= new Jefatura("Maria Sanchez",45000,2010,12,11);// de esta forma no se le aplica el incentivo que se le aplico al otro jefe�
		Jefatura jefaFinanzas=(Jefatura) misEmpleados[5];
		jefaFinanzas.estableceIncentivo(2370);//de esta forma si aplicamos el Incentivo a Maria es similar a como lo hicimos con el jefe Javier
		//Utilizamos el principio de sustitucion para crear un usuario que pertenece a la interfaz comparable y la instanciamos en tipo Empleado
		Comparable ejemplo=new Empleado ("Elisabeth",90000,2011,06,12);
		// gracias a la herencia podemos crear un usuario que un director es un Jefe y un Jefe es un Empleado 
		Empleado directorComercial = new Jefatura ("Sandra Olmido",30000,2012,05,04);
		//Como comprobar si una instancia pertenece a una clase ? de la siguiente forma 
		if (directorComercial instanceof Empleado) {
			System.out.println("Es de tipo jefatura");
		}
		// Tambien podemos comprobar si la instancia EJEMPLO implementa la interfaz comparable (en el caso de ELISABETH)
		if (directorComercial instanceof Comparable){
			System.out.println("Implementa la interfaz Comparable");
		} else {
			System.out.println("No implementa la interfaz comparable");
		}
		
		for (Empleado e: misEmpleados) {
			//aqui hacemos referencia a un tipo int que representa el porcentaje de aumento 
			e.subeSueldo(4);
		}
		
		// Ordenamos la salida de los Empleados para la interfaz
		Arrays.sort(misEmpleados);

		for (Empleado e: misEmpleados) {
			System.out.println("Nombre: "+e.dameNombre()+" Sueldo: "+
					e.dameSueldo()+" Fecha de incorp: "+e.damealtaContrato());
		}
	}
}				// aqui implementamos la interfaz
class Empleado implements Comparable{
	//primer constructor
	public Empleado(String nom, double sue,int agno,int mes,int dia) {
		
		nombre=nom;
		sueldo=sue;
		
		GregorianCalendar calendario=new GregorianCalendar(agno,mes-1,dia);
		altaContrato=calendario.getTime();
	}
	// segundo constructor porlo que decimos que tenemos una sobrecarga de constructores
	// este constructor lo tendremos para usuarios donde nos falten datos para
	// poder crearlos a traves del primer constructor
	public Empleado (String nom) {
		// aqui con this vamos a darle valores por defecto a sueldo y fecha de alta
		this (nom, 10000,2000,01,01);
	}
	
		public String dameNombre(){
		return nombre;
	}
	public double dameSueldo() {
		return sueldo;
	}
	public Date damealtaContrato(){
		return altaContrato;
	}
	public void subeSueldo(double porcentaje){
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	// aqui como el metodo compareTo si es mayor devuelve un +1 si es menor un -1 y si son iguales un 0 establecemos las posibilidades
	// que barajamos 
	//compareTo devuelve un entero publico(para que pueda ser accedido) y crea un objeto de nombre mi objeto 
	public int compareTo(Object miObjeto) {
		//comparame el sueldo de un empleado con otro
		Empleado otroEmpleado = (Empleado) miObjeto;
		//si el sueldo de uno es menor que el de otro devuelve un -1
		// podriamos ordenar por otra caracteristica que no sea sueldo cambiando sueldo por otra variable que sea INT(entero)
		if (this.sueldo<otroEmpleado.sueldo) {
			return -1;
		}
		//si el sueldo de uno es mayor que el de otro devuelve un +1
		if (this.sueldo>otroEmpleado.sueldo) {
			return 1;
		}
		//si son iguales devuelve 0
		return 0;
	}
	private String nombre;
	private double sueldo;
	private Date altaContrato;
}

class Jefatura extends Empleado {

//este es el constructor para la clase Jefatura
public Jefatura(String nom, double sue, int agno, int mes, int dia) {
	
	super(nom, sue, agno, mes, dia);
	
}
//SETTER para otorgar incentivo a los jefes (clase jefatura)
public void estableceIncentivo(double b) {
	
	incentivo=b;
	
}
// METODO GETTER
//aqui declaramos metodo donde sumara el sueldoJefe+elincentivo y se le llamara par que 
// nos devuelva el total con el metodo establecido dameSueldo declarado a continuacion
public double dameSueldo() { //este metodo sobreescribira el metodo con el mismo nombre que tiene el dame sueldo de los empleados
//con super.dameSueldo le decimos que nos devuelva el dameSueldo de la clase padre (Empleado)
	double sueldoJefe = super.dameSueldo();
	return sueldoJefe + incentivo;
}
// aqui encapsulamos la variable donde guardara el incentivo de los jefes
private double incentivo;
}