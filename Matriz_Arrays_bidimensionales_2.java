package pruebasIniciales;

public class Matriz_Arrays_bidimensionales_2 {

	public static void main(String[] args) {
		
		// es el mismo ejemplo que en el ejemplo anterior de bidimensional1
		// solo que definido de forma diferente

		int [][] matrix = {
				{ 10,15,20,25,30},// fila muestra una linea como esta seria [este][]
				{ 35,40,45,50,55},
				{ 10,15,20,25,30},
				{ 35,40,45,50,55},
				};			//|Z|seria [][este]
		// este for se encarga de dar un salto de linea cada vez que muestra
		// muestra cada fila = posicion de la primera dimension 
	for (int[]fila:matrix) {
		System.out.println("fila ");
		
		for (int z: fila) {
			// muestra cada resultado de la tabla definida en el array
		System.out.print(z +"Z ");	
		}
	}	
	
	}
}

