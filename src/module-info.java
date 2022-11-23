
 /** Controla el proyecto 
		@author Guillermo Sarmiento , Juan Andres Bautista ,Juan David Gonzalez 
		@version 19/11/2022/A

		    */
module Proyecto {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	requires javafx.graphics;
	requires java.sql;
	
	
	opens application to javafx.graphics, javafx.fxml,javafx.base ;
	opens modelo to javafx.graphics, javafx.fxml,javafx.base;
}
