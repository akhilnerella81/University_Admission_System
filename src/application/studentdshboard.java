package application;


import java.io.IOException;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
//}
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

public class studentdshboard {

    @FXML
    private VBox vbox;

    @FXML
    private Button btndsh;

    @FXML
    private Button btnadmupl;

    @FXML
    private Button btnuploaddocs;

    @FXML
    private AnchorPane ancpane;

    private AnchorPane Adminhome;
    
    @FXML
    void BTMDOC(ActionEvent event)throws Exception {
    	
    }

    @FXML
    void BTNADM(ActionEvent event)throws IOException {
    	createPage("Admissionform.fxml");
    }

    @FXML
    void BTNDASH(ActionEvent event)throws Exception {
        
    	AnchorPane Usersigninpage = FXMLLoader.load(getClass().getResource("select.fxml"));
    	Scene Usersigninscene = new Scene(Usersigninpage);
    	
    	Usersigninscene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
    	Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());
    	
    	window.setScene(Usersigninscene);
    	window.show();   
         
    }
  


private void SetNode(Node node) {
	ancpane.getChildren().clear();
	ancpane.getChildren().add((Node) node);
	
	FadeTransition ft = new FadeTransition(Duration.millis(1500));
	ft.setNode(node);
	ft.setFromValue(0.1);
	ft.setToValue(1);
	ft.setCycleCount(1);
	ft.setAutoReverse(false);
	ft.play();
}

private void createPage(String S) throws IOException {
	
	Adminhome = FXMLLoader.load(getClass().getResource(S));
	SetNode(Adminhome);
	
}
}