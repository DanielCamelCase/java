package Interfaces_2_explicacion_ejemplo;

public interface Trabajadores {

//////////////////////////////////////////////////////////////////////////////////
//INTEFACES 2 //          CLASE EMPLEADO       TRABAJADORES---establece_bonus() //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
////                           |                   |                            //
////                     CLASE JEFATURA          JEFES------tomar_decisiones()  //
////                                                                            //
// 																	            // 																
//////////////////////////////////////////////////////////////////////////////////



double establece_bonus (double gratificacion);
	
// todas las variables en interfaces son public static final es decir constantes publicas estaticas se ponga o no lo son siempre

public static final double bonus_base = 1500;

	
}
