package modelo.conexion;

import java.sql.*;
/** Esta crea la conexion y contiene los parametros para generarla 

	@author Guillermo Sarmiento , Juan Andres Bautista ,Juan David Gonzalez 
	@version 19/11/2022/A
	    */
public class Conexion {
	
	private String nombreBd="parqueadero";
	private String usuario="root";
	private String password="root";
	private String url="jdbc:mysql://localhost/"+nombreBd+"?useUnicode=true&use"
			+ "JDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&"
			+ "serverTimezone=UTC";
	 /**
    13      * Constructor.
    14      * @param nombrebd: nombre de la base de datos .
    15      * @param usuario: usuario de la base de datos.
    16      * @param password: contraseña de la base de datos .
              @param url: link de la base de datos
    17      */
	Connection conn=null;
	/** Esta clase genera la conexion a base de datos 

	@author Guillermo Sarmiento , Juan Andres Bautista ,Juan David Gonzalez 
	@version 19/11/2022/A
	    */
	public Conexion() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn=DriverManager.getConnection(url,usuario,password);
			
			if(conn!=null) {
				System.out.println("");
			}
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	/** Este metodo obtiene la base de datos  

	@author Guillermo Sarmiento , Juan Andres Bautista ,Juan David Gonzalez 
	@version 19/11/2022/A
	@return  conn 
	    */
	public Connection getConnetcion() {
		return conn;
	}
	/** Este metodo desconecta la base de datos 

	@author Guillermo Sarmiento , Juan Andres Bautista ,Juan David Gonzalez 
	@version 19/11/2022/A
	    */
	public void desconectar() {
		conn=null;
	}
	
}
