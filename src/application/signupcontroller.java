package application;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class signupcontroller {
    @FXML
    private TextField txtfrstname;

    @FXML
    private TextField txtlstname;

    @FXML
    private TextField txtphnnumber;

    @FXML
    private TextField txtmail;

    @FXML
    private Button btnreg;

    @FXML
    private PasswordField pwd;

    @FXML
    private PasswordField repeatpwd;
    @FXML
    private Label STATUS;
    
    @FXML
    void TOLOGIN(ActionEvent event) throws Exception {
    	  boolean a = true;
    	  demosql SQL = new demosql();
    	  Pattern pattern_name;
    	  Matcher matcher;
    	  String nameregex = "[A-Z][a-z]+";
    	  pattern_name = Pattern.compile(nameregex);
    	  matcher = pattern_name.matcher(this.txtfrstname.getText());
    	  if(matcher.matches()) {
    		//  System.out.println("First name valid");
    		  a = a&&true;
    	  }
    	  else {
    		  a = a&&false;
    		//  System.out.println("First name not valid");
    	  }
    	  nameregex = "[A-Z][a-z]+";
    	  pattern_name = Pattern.compile(nameregex);
    	  matcher = pattern_name.matcher(this.txtlstname.getText());
    	  if(matcher.matches()) {
    		  //System.out.println(" name valid");
    		  a = a&&true;
    	  }
    	  else {
    		 // System.out.println(" namenot valid");
    		  a = a&&false;
    	  }
    	 
    	  nameregex = ".+@.+";
    	  pattern_name = Pattern.compile(nameregex);
    	  matcher = pattern_name.matcher(this.txtmail.getText());
    	  if(matcher.matches()) {
    		  //System.out.println("mail name valid");
    		  a = a&&true;
    	  }
    	  else {
    		  //System.out.println("mail not name valid");
    		  a = a&&false;
    	  }
    	  
    	  nameregex = "[0-9]{10}";
    	  pattern_name = Pattern.compile(nameregex);
    	  matcher = pattern_name.matcher(this.txtphnnumber.getText());
    	  if(matcher.matches()) {
    		  //System.out.println("phnnumber name valid");
    		  a = a&&true;
    	  }
    	  else {
    		 // System.out.println("phnnumber not name valid");
    		  a = a&&false;
    	  }
    	  if(a==true) {
    		  
    		  STATUS.setText("Registered");
          SQL.insert(this.txtfrstname.getText(), this.txtlstname.getText(), this.txtphnnumber.getText(),this.txtmail.getText(),this.pwd.getText() );
          BorderPane Usersigninpage = FXMLLoader.load(getClass().getResource("Sample.fxml"));
      	Scene Usersigninscene = new Scene(Usersigninpage);
      	
      	Usersigninscene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
      	Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());
      	
      	window.setScene(Usersigninscene);
      	window.show();
      	}
    	  else {
    		  STATUS.setText("Invalid Details.."); 
    	  }
	
    }
}
