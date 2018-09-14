package Tipos_Enumerados;

import java.util.*;

public class Uso_Tallas_Constructor {

	// aqui creamos un Tipo enumerado con un constructor que funciona a modo de Metodo Setter
		enum Talla {
			
			MINI("S"),MEDIANO("M"),GRANDE("L"),MUYGRANDE("XL");
			
			private String abreviatura;
			
			private Talla(String abreviatura) {
				
				this.abreviatura = abreviatura;
			}
			// Metodo Getter 
			public String dameAbreviatura() {
				return abreviatura;
			}
			
		}
	
	public static void main(String[] args) {
		
		// ventana emergente de entrada de datos que el usuario debe introducir se guardara lo que escriba en (ENTRADA) 
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Escriba una Talla: Mini,Mediano,grande o MuyGrande");
		
		// aqui le decimos a java que nos convierta lo que el usuario nos da a traves de entrada a mayusculas y lo guardamos en 
		// entradaDatos                     toUpperCase pasa a mayusculas el texto
		String entrada_datos = entrada.next().toUpperCase();
		
		// aqui creamos una variable (laTalla) y a traves de Enum.evalueOf le damos como primer parametro el nombre de la clase 
		// enum establecida al principio y como segundo la varible donde almacenamos lo que el usuario escribe en el Scanner (entradaDatos)
		
		Talla la_talla = Enum.valueOf(Talla.class, entrada_datos);
		
		System.out.println("La talla introducida es "+ la_talla);
		System.out.println("La talla introducida equivale a una "+ la_talla.dameAbreviatura() );
	}

}
