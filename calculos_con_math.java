package pruebasIniciales;

public class calculos_con_math {

	public static void main(String[] args) {
	
//la clase math se utiliza para operaciones matematicas complejas
		
		double raiz = Math.sqrt(9); // sqrt = raiz cuadrada
		System.out.println("La raiz de 9 es = "+ raiz); // = 3.0 
		
		double num1 = 5.854;
		double resultado=Math.round(num1); // round = redondeo  
		System.out.println("5.854 redondeado es = "+ resultado); // = 6.0
		
		double base = 5 ;
		double exponente = 3;
		int resultado1 = (int)Math.pow(base, exponente); // elevar numero a una potencia
		System.out.println(base +" elevado a "+ exponente +" es = "+resultado1);
		

	}

}
