package pruebasIniciales;

public class bucle_for {

	public static void main(String[] args) {
		
		// creamos una variable, le damos una condicion en este caso que salga del bucle
		//cuando sea igual o mayor a 10 y damos un incremental para que la condicon se pueda cumplir
		// este seria el ejemplo mas simple de un FOR
		
		for(int i=0;i<=10;i++) {
			
			System.out.println("hola numero "+ i);
			
		}
		
		System.out.println("Ya termino el ejemplo de saludo incremental");
	
	// es lo mismo que el anterior cambiando la variable de nombre y haciendo que incremente de 
	// 10 en 10 hasta 100 
	for(int numero=0;numero<=100;numero+=10) {
		
		System.out.println("hola numero "+ numero);
		
	}
	
	System.out.println("Ya termino el ejemplo de saludo incremental");
}

}
