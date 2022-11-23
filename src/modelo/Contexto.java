package modelo;
/** Esta clase obtiene los datos obtenidos y los unifica 
	@author Guillermo Sarmiento , Juan Andres Bautista ,Juan David Gonzalez 
	@version 19/11/2022/A
	 	
	    */
public class Contexto {
	private static Strategy strategy;  
	 /** Esta clase constructora
		@author Guillermo Sarmiento , Juan Andres Bautista ,Juan David Gonzalez 
		@version 19/11/2022/A
		 	@param strategy objeto de la clase strateg
		    */
    public Contexto(Strategy strategy){  
       this.strategy = strategy;  
    }  
    /** realiza el calculo de las funciones 
   	@author Guillermo Sarmiento , Juan Andres Bautista ,Juan David Gonzalez 
   	@version 19/11/2022/A 
   	@param x objeto de la clase strateg
   	@return x
   	
   	    */
    public static double executeStrategy(double x){  
       return strategy.calculation(x);  
    }  
}
