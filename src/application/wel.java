package application;

import javafx.scene.Node;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class wel {
	    @FXML
	    private Button btnup;

	    @FXML
	    private Button btnadmin;


	    @FXML
	    private Button btnout;


	    @FXML
	    private ImageView img;

	    @FXML
	    private Label lblwel;

	    @FXML
	    private Label titUAS;
	   
	   public void ADMIN(ActionEvent event) throws IOException {
	    	AnchorPane Usersigninpage = FXMLLoader.load(getClass().getResource("admin.fxml"));
	    	Scene Usersigninscene = new Scene(Usersigninpage);
	    	
	    	Usersigninscene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	    	Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());
	    	
	    	window.setScene(Usersigninscene);
	    	window.show();
	    }


 public void  Usersignin(ActionEvent event) throws IOException {
	    	BorderPane Usersigninpage = FXMLLoader.load(getClass().getResource("Sample.fxml"));
	    	Scene Usersigninscene = new Scene(Usersigninpage);
	    	
	    	Usersigninscene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	    	Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());
	    	
	    	window.setScene(Usersigninscene);
	    	window.show();
	    }
 public void  Usersignup(ActionEvent event) throws IOException {
 	AnchorPane Usersignuppage = FXMLLoader.load(getClass().getResource("signup.fxml"));
 	Scene Usersignupscene = new Scene(Usersignuppage);
 	
 	Usersignupscene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
 	Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());
 	
 	window.setScene(Usersignupscene);
 	window.show();
 }
}
