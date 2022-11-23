package modelo;

/**
 * Esta clase decora o obtiene el precio de los tipos de vehiculos
 * 
 * @author Guillermo Sarmiento , Juan Andres Bautista ,Juan David Gonzalez
 * @version 19/11/2022/A
 */

public abstract class Decorator_cost implements Precioparque {
	private Precioparque newCost;
	 /** Esta clase constructora
		@author Guillermo Sarmiento , Juan Andres Bautista ,Juan David Gonzalez 
		@version 19/11/2022/A
		@param newCost obtiene el nuevo costo 
		    */
	public Decorator_cost(Precioparque newCost) {
		this.newCost = newCost;
		/**
		 * Constructor.
		 */
	}

	/**
	 * Calcula el costo del parqueadero
	 * 
	 * @return newCost
	 */
	@Override
	public double cost() {
		return newCost.cost();
	}

}
