package poo_empleado_ejercicio;

import java.util.*;

//vamos a tener dos clases en un fichero por primera vez a continuacion la Primera
public class Uso_EmpleadoEjercicios {

	public static void main(String[] args) {
		//pasamos los datos en el mismo orden que escribimos el constructor
		Empleados empleado1 = new Empleados("Carlos Arquero",16000,2016,6,03);
		Empleados empleado2 = new Empleados("Luisa Lopez",25000,2010,12,19);
		Empleados empleado3 = new Empleados("Juaquin Moreno",12000,2017,11,27);	
	
		empleado1.subeSueldo(4);
		empleado2.subeSueldo(6);
		empleado3.subeSueldo(3);
		System.out.println("nombre :"+empleado1.dameNombre()+" sueldo :"+empleado1.dameSueldo()
		+" Fecha de incorporacion :"+empleado1.damealtaContrato());
		System.out.println("nombre :"+empleado2.dameNombre()+" sueldo :"+empleado2.dameSueldo()
		+" Fecha de incorporacion :"+empleado2.damealtaContrato());
		System.out.println("nombre :"+empleado3.dameNombre()+" sueldo :"+empleado3.dameSueldo()
		+" Fecha de incorporacion :"+empleado3.damealtaContrato());
	}
	
}
// a continuacion la segunda clase 
class Empleados{
	// aqui creamos un constructor 
	public Empleados(String nom, double sue,int agno,int mes,int dia) {
		
		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(agno,mes-1,dia);
		altaContrato=calendario.getTime();
	}
	// GETTER NOMBRE
		public String dameNombre(){
		return nombre;
	}
	//GETTER SUELDO
	public double dameSueldo() {
		return sueldo;
	}
	//GETTER ALTACONTRATO
	public Date damealtaContrato(){
		return altaContrato;
	}
	//SETTER SUELDO
	public void subeSueldo(double porcentaje){
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	
}

	
	
