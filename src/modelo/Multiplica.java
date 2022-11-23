package modelo;
/** Esta clase multiplica 
@author Guillermo Sarmiento , Juan Andres Bautista ,Juan David Gonzalez 
@version 19/11/2022/A
    */
public class Multiplica implements Strategy{
	@Override  
	 /** Esta clase multiplica lo que entra en b
		@author Guillermo Sarmiento , Juan Andres Bautista ,Juan David Gonzalez 
		@version 19/11/2022/A
		    */
    public double calculation(double b) {  
        return 10*b;  
    }  

}
