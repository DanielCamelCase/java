package pruebasIniciales;

import java.util.Scanner;

public class Condicionales_flujo_de_ejecucion_1 {

	public static void main(String[] args) {
		

		Scanner entrada=new Scanner(System.in);
		
		System.out.println("introduzca su edad, por favor");
		
		int edad=entrada.nextInt();
		
		if(edad>=18) {
		
			System.out.println("usted es mayor de edad");
			
		}
		
		else {
				
				System.out.println("usted es menor de edad");
				
			}
			

	}
}