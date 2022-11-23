package application;
	
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

/** permite iniciar el sistema 
@author Guillermo Sarmiento , Juan Andres Bautista ,Juan David Gonzalez 
@version 19/11/2022/A

    */
public class Main extends Application  {
	// Se inicia por consola la vista del java Fx
	
	public void start(Stage primaryStage) {
		try {
			Parent root= FXMLLoader.load(getClass() .getResource("/vista/panel.fxml"));
			Scene scene = new Scene(root);
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	 /** constructor 
	@author Guillermo Sarmiento , Juan Andres Bautista ,Juan David Gonzalez 
	@version 19/11/2022/A
	@param args es un arreglo

	    */
	public static void main(String[] args) {
		launch(args);
	}


}
