package modelo;
/** Esta clase calcula el costo
	@author Guillermo Sarmiento , Juan Andres Bautista ,Juan David Gonzalez 
	@version 19/11/2022/A
	    */
public class Carro_cost extends Decorator_cost  {
	 /** Esta clase constructora
		@author Guillermo Sarmiento , Juan Andres Bautista ,Juan David Gonzalez 
		@version 19/11/2022/A
		* @param newCost obtiene el nuevo costo
		    */
	public Carro_cost(Precioparque newCost) {
		super(newCost);
		/*
		 * @param newCost obtiene el nuevo costo*/
		// TODO Auto-generated constructor stub
	}

	 /**
     * Calcula el costo del parqueadero del carro .
    * @return cost.
     */
    public double cost(){  
    	return super.cost()+500;  
    }

}
