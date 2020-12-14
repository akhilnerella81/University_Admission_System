package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
//import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Maincontroller {
  @FXML
  private Label lblstatus;
  @FXML
  private TextField txtusername;
  @FXML
  private TextField txtpwd;
  
  public void Login(ActionEvent event) throws Exception {
	  if(txtusername.getText().equalsIgnoreCase("user") && txtpwd.getText().equalsIgnoreCase("pass")) {
		  lblstatus.setText("Logged in Successfully");
			 AnchorPane Usersigninpage = (AnchorPane)FXMLLoader.load(getClass().getResource("studentsigned.fxml"));
				
		    	Scene Usersigninscene = new Scene(Usersigninpage);
		    	
		    	Usersigninscene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		    	Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());
		    	
		    	window.setScene(Usersigninscene);
		    	window.show();

	  }
	  else {
		  lblstatus.setText("Login Failed");
	  }
  }

}
