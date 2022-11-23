package modelo;
/** Esta obtiene el precio de la moto 
@author Guillermo Sarmiento , Juan Andres Bautista ,Juan David Gonzalez 
@version 19/11/2022/


    */
public class Moto_cost extends Decorator_cost {
	 /** Esta clase constructora
		@author Guillermo Sarmiento , Juan Andres Bautista ,Juan David Gonzalez 
		@version 19/11/2022/
        @param newCost obtiene el nuevo costo 
	
		    */
	public Moto_cost(Precioparque newCost) {
		super(newCost);
		// TODO Auto-generated constructor stub
	}
	 /**
     * Calcula el costo del parqueadero de la  moto .
    * @return cost.
     */
    public double cost(){  
    	return super.cost()+100;  
    }

}
