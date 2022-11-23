package modelo;
/** Clase de la base del precio de lo que se va a decorar y almacena el precio de un vehiculo electrico 
@author Guillermo Sarmiento , Juan Andres Bautista ,Juan David Gonzalez 
@version 19/11/2022/A

    */
public class VehiculoElectrico_cost implements Precioparque  {
	 /** constructor
		@author Guillermo Sarmiento , Juan Andres Bautista ,Juan David Gonzalez 
		@version 19/11/2022/A
		    */
		public VehiculoElectrico_cost() {
			
		}
		 /**
	     * Calcula el costo del parqueadero del vehiculo electrico .
	    * @return cost.
	     */
		public double cost() {
			return 1500;
		}
}
