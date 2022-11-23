package modelo;
/** Esta clase suma 
@author Guillermo Sarmiento , Juan Andres Bautista ,Juan David Gonzalez 
@version 19/11/2022/A
*/
public class Suma implements Strategy{
	 /** Esta clase permite sumar lo que entra en b 
		@author Guillermo Sarmiento , Juan Andres Bautista ,Juan David Gonzalez 
		@version 19/11/2022/A
		    */
	@Override  
    public double calculation(double b) {  
        return 500+b;  
    }  
}
