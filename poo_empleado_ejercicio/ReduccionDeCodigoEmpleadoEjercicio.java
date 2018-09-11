package poo_empleado_ejercicio;

import java.util.*;

//vamos a tener dos clases en un fichero por primera vez a continuacion la Primera
public class ReduccionDeCodigoEmpleadoEjercicio {

	public static void main(String[] args) {
//creamos un array para almacenar a los empleados y sus datos
		Empleado [] misEmpleados = new Empleado[3];
		misEmpleados[0]= new Empleado("Pedro Arquero",16000,2016,6,03);
		misEmpleados[1]= new Empleado("Marta Lopez",25000,2010,12,19);
		misEmpleados[2]= new Empleado("Juaquin Moreno",12000,2017,11,27);
// mediante este bucle for les aplicamos una subida del 5% sueldos a cada uno
		
		/*for (int i=0;i<3;i++){
			misEmpleados[i].subeSueldo(5);
		}*/
		
		// otra forma para reducir aun mas seria usar un bucle forEach en lugar del bucle for 
		for (Empleado e: misEmpleados) {
			e.subeSueldo(5);
		}
		
//con este bucle for mostramos los datos de cada empleado por pantalla 	
		
		/*for (int i=0;i<3;i++) {
			System.out.println("Nombre: "+misEmpleados[i].dameNombre()+" Sueldo: "+
		misEmpleados[i].dameSueldo()+" Fecha de incorporacion: "+misEmpleados[i].damealtaContrato());
		}*/ 
		
		// tambien usaremos un forEach para este bucle for que comentamos para reducir aun mas el codigo
		for (Empleado e: misEmpleados) {
			System.out.println("Nombre: "+e.dameNombre()+" Sueldo: "+
					e.dameSueldo()+" Fecha de incorporacion: "+e.damealtaContrato());
		}
	}
}
// a continuacion la segunda clase 
class Empleado{
	// aqui creamos un constructor 
	public Empleado(String nom, double sue,int agno,int mes,int dia) {
		
		nombre=nom;
		sueldo=sue;
		//Con gregorian... creamos una variable de nombre calendario para almacenar la fecha de alta de los empleados 
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