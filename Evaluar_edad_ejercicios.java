package pruebasIniciales;

import java.util.*;

public class Evaluar_edad_ejercicios {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("introduzca su edad, por favor");
		
		int edad=entrada.nextInt();
		
		if(edad<=18) {
		
			System.out.println("usted es menor de edad");
			
		}
	
		else if (edad<=40) {
			
			System.out.println("usted es joven");
			
		}
			
		else if(edad<=65) {
			
			System.out.println("usted es adulto");
		}
		
		else if (edad<=90) {
			
			System.out.println("usted es anciano");
		}
		
	}	

}
