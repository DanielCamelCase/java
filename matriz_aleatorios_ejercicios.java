package pruebasIniciales;

public class matriz_aleatorios_ejercicios {

	public static void main(String[] args) {

		int [] matrizAleatorios = new int[20];

		for (int i=0; i<matrizAleatorios.length;i++) {
			
			matrizAleatorios[i]= (int)Math.round(Math.random()*100);
			
		}
			
		for( int recorrer:matrizAleatorios) {
				
			System.out.print(" "+recorrer);
	
		}
	}
}
