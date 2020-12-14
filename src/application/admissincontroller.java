package application;


	import java.net.URL;
	import javafx.scene.layout.AnchorPane;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
	import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

	public class admissincontroller implements Initializable {
		ObservableList<String> typeofuser = (ObservableList<String>) FXCollections.observableArrayList("B.com","Agriculture","B.tech(CSE)","B.tech(ECE)","B.tech(EEE)","B.tech(Mech)","B.tech(Civil)");
	    @FXML
	    private ComboBox<String> combcourse;
	    @FXML
	    private TextField txtfather;
        @FXML
	    private TextField txtgender;

	    @FXML
	    private TextField txtAdr;

	    @FXML
	    private DatePicker dateDOB;

	    @FXML
	    private TextField txtun1;

	    @FXML
	    private TextField txtuni2;

	    @FXML
	    private TextField txtpercent1;

	    @FXML
	    private TextField txtpercent2;

	    @FXML
	    private TextField txtyear1;

	    @FXML
	    private TextField txtyear2;

	
	    @FXML
	    private Button bnsubmit;
	    @FXML
	    private TextField student;

	    @FXML
	    private TextField email;

	  
	    @Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
	    	combcourse.setValue(typeofuser.iterator().next());
			combcourse.setItems(typeofuser);
			txtgender.setVisible(false);
			
		}
	    @FXML
	    void Submitform(ActionEvent event) throws Exception {
	    	 demosql SQL = new demosql();
	    	 
	    	 SQL.insertadm(this.student.getText(),this.email.getText(),this.txtfather.getText(),"0",this.txtAdr.getText(),this.txtun1.getText(), Integer.parseInt(this.txtpercent1.getText()),Integer.parseInt(this.txtyear1.getText()),this.txtuni2.getText(),Integer.parseInt(this.txtpercent2.getText()),Integer.parseInt(this.txtyear2.getText()),dateDOB.getValue().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
	    	  AnchorPane Usersigninpage = FXMLLoader.load(getClass().getResource("thankyou.fxml"));
	        	Scene Usersigninscene = new Scene(Usersigninpage);
	        	
	        	Usersigninscene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	        	Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());
	        	
	        	window.setScene(Usersigninscene);
	        	window.show();
	    }
}