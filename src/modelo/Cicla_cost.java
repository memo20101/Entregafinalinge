package modelo;
/** Esta clase obtiene el precio de las ciclas 
@author Guillermo Sarmiento , Juan Andres Bautista ,Juan David Gonzalez 
@version 19/11/2022/A
    */
public class Cicla_cost extends Decorator_cost {
	 /** Esta clase constructora
		@author Guillermo Sarmiento , Juan Andres Bautista ,Juan David Gonzalez 
		@version 19/11/2022/A
		* @param newCost obtiene el nuevo costo
		    */
	public Cicla_cost(Precioparque newCost) {
		super(newCost);
		
		// TODO Auto-generated constructor stub
	}
	 /**
     * Calcula el costo del parqueadero de la  cicla .
    * @return cost.
     */

    public double cost(){  
    	return super.cost()-1200;  
    }
}
