package Tipos_Enumerados;

public class Uso_Tallas {
	
	
	// Tipos enumerados , Permite uso de constructores y metodos SETTERS y GETTERS
	// Tipos enumerados no admiten la construcion de objetos
	enum TallaSimple {Pequeña,Mediana,Grande,MuyGrande}
	
	
	public static void main(String[] args) {
		
		// variables para el tipo enumerado( TallaSimple )
				TallaSimple s = TallaSimple.Pequeña;
				TallaSimple m = TallaSimple.Mediana;
				TallaSimple L = TallaSimple.Grande;
				TallaSimple XL = TallaSimple.MuyGrande;
	
	}

	
	
}
