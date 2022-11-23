package modelo;
/** Esta clase obtiene los atributos de la interfaz Cloneable

	@author Guillermo Sarmiento , Juan Andres Bautista ,Juan David Gonzalez 
	@version 19/11/2022/A
	    */
public abstract class Item implements Cloneable {

	@Override
	 /** Esta clase obtiene los atributos de la interfaz Cloneable

	@author Guillermo Sarmiento , Juan Andres Bautista ,Juan David Gonzalez 
	@version 19/11/2022/A
	    */
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	 /** permite tener la ubicacion 
		@author Guillermo Sarmiento , Juan Andres Bautista ,Juan David Gonzalez 
		@version 19/11/2022/A
		@param location obtiene la locacion o el id de donde esta 
		@return location 
		    */
	public abstract int goTo (int location);

}