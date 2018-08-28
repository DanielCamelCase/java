package pruebasIniciales;

public class Refundiciones {

	public static void main(String[] args) {
// Cuando necesitamos convertir un numero entero en decimal o viceversa
// Necesitamos hacer una Refundicion 
	
	double num2 = 4.2545;
	double raiz0 = Math.round(num2); // uso normal de math con double
	System.out.println(raiz0);// = 4.0
	
	
	double num1 = 4.2545;	
	int raiz=(int)Math.round(num1); // uso de Refundicion convirtiendo un double a un intero(int)
	System.out.println(raiz); // =4
	
	}

}
