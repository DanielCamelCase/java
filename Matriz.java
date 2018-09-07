package pruebasIniciales;

public class Matriz {

	public static void main(String[] args) {
		
		// dos formas de declarar un array o matriz
		int [] miMatriz = new int[5];
		int miMatriz2[]=new int[5];
		// asi declaramos los valores de cada variable de la matriz
		miMatriz[0]=5;
		miMatriz[1]=10;
		miMatriz[2]=15;
		miMatriz[3]=20;
		miMatriz[4]=25;
		// asi llamamos a cada uno de los valores de la matriz
		System.out.println(miMatriz[0]);
		System.out.println(miMatriz[1]);
		System.out.println(miMatriz[2]);
		System.out.println(miMatriz[3]);
		System.out.println(miMatriz[4]);
		
		// asi seria una forma mas limpia de llamar cada uno de las variables 
		// de la matriz
		// al decirle al for que imprima para que sea menor a 5 imprime hasta 4 y como 
		// un array cuenta desde 0 al haber 5 elementos cuenta del 0 al 4

		for (int i=0;i<5;i++) {
			
			System.out.println("valor del indice " +i+ " = "+miMatriz[i]);
			
		}
		// asi podemos recorrer todos los indices si no sabemos el numero total que tenemos 
		
		for (int i=0;i<miMatriz.length;i++) {
	
			System.out.println("valor del indice " +i+ " = "+miMatriz[i]);
	
}
	}

}
