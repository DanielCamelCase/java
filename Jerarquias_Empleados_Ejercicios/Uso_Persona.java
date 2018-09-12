package Jerarquias_Empleados_Ejercicios;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

		public static void main(String[] args) {
			
			Persona [] lasPersonas = new Persona[2]; 
			lasPersonas[0] = new Empleado("Jose Picapiedra",30000,2009,02,25);
			lasPersonas[1] = new Alumno("Juan Estudient","Ingenieria");
		
			for (Persona e: lasPersonas) {
				System.out.println(e.dameNombre()+", "+e.dameDescripcion());
			}
		}
	}
	abstract class Persona {
		
		public Persona (String nom) {
		nombre = nom;
		}
		//GETTERS PARA LA CLASE PERSONA QUE SERAN HEREDADOS POR EMPLEADO Y POR ESTUDIANTE 
		public String dameNombre() {
			return nombre;
		}
		
		public abstract String dameDescripcion();
			
			private String nombre;
			
	
	}
	
	class Empleado extends Persona {
		
		public Empleado(String nom, double sue,int agno,int mes,int dia) {
			
			super(nom);
			
			sueldo=sue;
			
			GregorianCalendar calendario=new GregorianCalendar(agno,mes-1,dia);
			altaContrato=calendario.getTime();
			
			++IDSiguiente;
			ID=IDSiguiente;
		}
			
		public String dameDescripcion() {
				return "Este empleado tiene un Id= "+ ID + " con un sueldo= " + sueldo;
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
		
		private double sueldo;
		private Date altaContrato;
		private static int IDSiguiente;
		private int ID;
	}
	
class Alumno extends Persona { // POR ESTO ES POR LO QUE LA CLASE PERSONA ES (ABSTRACT) DADO QUE HEREDAN DE ELLA TANTO EMPLEADO 
							   // COMO ALUMNO ||   PERSONA 
							  //			    	/\
							//			           /  \
							//				EMPLEADO   ALUMNO		 
						// dameDescripcion() es comun a las clases Alumno y empleado pero en cada una devolvera una cosa direfente
						// por eso decimos que tenemos que poner (ABSTRACT)
	public Alumno (String nom, String car) {
	super(nom);
	carrera=car;
	}	
	public String dameDescripcion() {
		return "Este alumno esta estudiando la carrera de "+ carrera;
	}
	private String carrera;
}
