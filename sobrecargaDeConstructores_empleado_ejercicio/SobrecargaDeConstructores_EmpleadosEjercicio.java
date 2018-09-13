package sobrecargaDeConstructores_empleado_ejercicio;

import java.util.Date;
import java.util.GregorianCalendar;

public class SobrecargaDeConstructores_EmpleadosEjercicio {

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
				misEmpleados[5]= new Jefatura("Maria Sanchez",45000,2010,12,11);// de esta forma no se le aplica el incentivo que se le aplico al otro jefeº
				Jefatura jefaFinanzas=(Jefatura) misEmpleados[5];
				jefaFinanzas.estableceIncentivo(2370);//de esta forma si aplicamos el Incentivo a Maria es similar a como lo hicimos con el jefe Javier
				for (Empleado e: misEmpleados) {
					e.subeSueldo(4);
				}

				for (Empleado e: misEmpleados) {
					System.out.println("Nombre: "+e.dameNombre()+" Sueldo: "+
							e.dameSueldo()+" Fecha de incorp: "+e.damealtaContrato());
				}
			}
		}
		class Empleado{
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
	