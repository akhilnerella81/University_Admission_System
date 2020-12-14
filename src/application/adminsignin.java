package application;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class adminsignin {

    @FXML
    private Button BTN;

    @FXML
    private TextField txtusername;

    @FXML
    private PasswordField txtpwd;

    @FXML
    private Label lblstatus;

    @FXML
    void Login(ActionEvent event) throws IOException {
    	  if(txtusername.getText().equalsIgnoreCase("admin") && txtpwd.getText().equalsIgnoreCase("admin")) {
    		  lblstatus.setText("Logged in Successfully");
    			 AnchorPane Usersigninpage = (AnchorPane)FXMLLoader.load(getClass().getResource("main.fxml"));
    				
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





