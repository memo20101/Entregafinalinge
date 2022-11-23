package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import modelo.conexion.Conexion;
/** Clase que tiene los atributos principales 
@author Guillermo Sarmiento , Juan Andres Bautista ,Juan David Gonzalez 
@version 19/11/2022/A
    */
public class Vehiculo extends Item {
	/**

	 * 
	 */
	  private String Placa;
	    private String Fecha;
	   
		 /** Constructor de la Clase vehiculo
		@author Guillermo Sarmiento , Juan Andres Bautista ,Juan David Gonzalez 
		@version 19/11/2022/A
	 * @param Placa obtiene la placa del vehiculo
	 * @param Fecha obtiene la fecha 
		    */

	    public Vehiculo( String Placa, String Fecha) {
	        this.Placa= Placa;
	        this.Fecha= Fecha;
	    }
	    /** Obtiene el dato de la placa
		@author Guillermo Sarmiento , Juan Andres Bautista ,Juan David Gonzalez 
		@version 19/11/2022/A
		@return Placa 
		    */                   
	    public String getPlaca() {
	        return Placa;
	    }
	    /** Envia el dato de la placa
		@author Guillermo Sarmiento , Juan Andres Bautista ,Juan David Gonzalez 
		@version 19/11/2022/A
		@param Placa es el atributo que tiene la placa 
		    */  
	    public void setPlaca(String Placa) {
	        this.Placa = Placa;
	    }
	    /** Obtiene el dato de la Fecha
		@author Guillermo Sarmiento , Juan Andres Bautista ,Juan David Gonzalez 
		@version 19/11/2022/A
		@return Fecha 
		    */   
	    public String getFecha() {
	        return Fecha;
	    }
	    /** Envia el dato de la Fecha
		@author Guillermo Sarmiento , Juan Andres Bautista ,Juan David Gonzalez 
		@version 19/11/2022/A
		@param Fecha es la fecha actual 
		    */  
	    public void setFecha(String Fecha) {
	        this.Fecha = "21/10/2022";
	    }

		@Override
		  /** Envia el dato de la Fecha
				@author Guillermo Sarmiento , Juan Andres Bautista ,Juan David Gonzalez 
				@version 19/11/2022/A
				@param location es la ubicacion 
				@return location 
				    */ 
		public int goTo(int location) {
			// TODO Auto-generated method stub
			return 0;
		}
		 /** Obtiene los datos de la base de datos 
		@author Guillermo Sarmiento , Juan Andres Bautista ,Juan David Gonzalez 
		@version 19/11/2022/
        @return  obs que es el que actualiza la tabla 
		    */  
		 public ObservableList<Vehiculo> getServicios() {
		        ObservableList<Vehiculo> obs = FXCollections.observableArrayList();
		        try {

		            /* Abro la conexion*/
		        	Connection connection = null;
					Conexion conexion = new Conexion();
					connection = conexion.getConnetcion();	
					Statement st = connection.createStatement();

		            /* realizo la consulta*/
					ResultSet rs = st.executeQuery("SELECT placa as placa, created_at as fecha FROM vehicle");

		            /* recorro los resultados*/
		            while (rs.next()) {

		                // Cojo los datos
		                String placa = rs.getString("placa");
		                String fecha = rs.getString("fecha");
		               

		                /** Creo el servicio*/
		                Vehiculo s = new Vehiculo(placa, fecha);

		                obs.add(s);

		            }

		        } catch (SQLException ex) {
		            System.out.println("");
		        }
		        return obs;
		    }
		 /** este metodo filtra 
			@author Guillermo Sarmiento , Juan Andres Bautista ,Juan David Gonzalez 
			@version 19/11/2022/A
		 * @param x obtiene el dato 
		 * @return obs  actualiza la lista 
			    */
		 public ObservableList<Vehiculo> getFiltro(String x) {
		        ObservableList<Vehiculo> obs = FXCollections.observableArrayList();
		        try {

		            /* Abro la conexion*/
		        	Connection connection = null;
					Conexion conexion = new Conexion();
					connection = conexion.getConnetcion();	
					Statement st = connection.createStatement();

		            /* realizo la consulta*/
					ResultSet rs = st.executeQuery("SELECT placa as placa, created_at as fecha FROM vehicle WHERE placa = '"+x+"'");

		            /* recorro los resultados*/
		            while (rs.next()) {

		                // Cojo los datos
		                String placa = rs.getString("placa");
		                String fecha = rs.getString("fecha");
		               

		                /** Creo el servicio*/
		                Vehiculo s = new Vehiculo(placa, fecha);

		                obs.add(s);

		            }

		        } catch (SQLException ex) {
		            System.out.println("");
		        }
		        return obs;
		    }
	
		}
