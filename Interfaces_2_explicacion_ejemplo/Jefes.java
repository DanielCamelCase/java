package Interfaces_2_explicacion_ejemplo;

/////////////////////////////////////////////////////////////////////////////////////////
//  INTEFACES 2 //     CLASE EMPLEADO       TRABAJADORES---establece_bonus()           //
//              //          |                   |                                      //
//              //     CLASE JEFATURA           JEFES------tomar_decisiones()<<<<<<<<<<//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
//              //                                                                     //
//                                                                                     // 
/////////////////////////////////////////////////////////////////////////////////////////

public interface Jefes extends Trabajadores{
	// con extends Trabajadores la interfaz jefes tendra dos funciones la suya propia y hereda tambien el bonus de trabajadores 
	// todas las variables en interfaces son public static final es decir constantes publicas estaticas se ponga o no lo son siempre
	String tomar_decisiones (String decision);
	
}
