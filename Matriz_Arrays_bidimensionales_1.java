package pruebasIniciales;

public class Matriz_Arrays_bidimensionales_1 {

	public static void main(String[] args) {
		
		//asi declaramos un array de dos dimensiones
		int [][] matrix = new int [4][5];
		
		matrix[0][0] = 74;
		matrix[0][1] = 28;
		matrix[0][2] = 53;
		matrix[0][3] = 27;
		matrix[0][4] = 15;
		
		matrix[1][0] = 18;
		matrix[1][1] = 14;
		matrix[1][2] = 04;
		matrix[1][3] = 98;
		matrix[1][4] = 15;
		
		matrix[2][0] = 75;
		matrix[2][1] = 145;
		matrix[2][2] = 67;
		matrix[2][3] = 20;
		matrix[2][4] = 15;
		
		matrix[3][0] = 75;
		matrix[3][1] = 145;
		matrix[3][2] = 67;
		matrix[3][3] = 20;
		matrix[3][4] = 15;
	
		// asi usariamos el valor de un array de dos dimensiones
		System.out.println("valor de la posicion 2,3: "+matrix[2][3]);
		
		// este for va a recorrer la primera dimension del array bidimensional
		for (int i=0;i<4;i++) {
		// este for recorrera la segunda dimension
			for (int j=0;j<5;j++) {
				// aqui definimos que i recorrera el primero y j el segundo
				System.out.println("indice ["+i+" "+j+"] "+matrix[i][j]);
				// y mostramos de forma estructurada para mejor comprension del ejemplo de uso 
			}	
			
		}
		
	}

}
