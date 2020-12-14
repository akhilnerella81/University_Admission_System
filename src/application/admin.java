package application;

import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class admin implements Initializable {
	 @FXML
	    private Button btn2;

	 @FXML
	    private Button btn1;
	  @FXML
	    private Label abcd;
	 
	  @FXML
	      private TableView<admission> table;

	      @FXML
	      private TableColumn<admission,String > col1;

	      @FXML
	      private TableColumn<admission,String> col2;

	      @FXML
	      private TableColumn<admission,String> col3;

	      @FXML
	      private TableColumn<admission,String> col4;

	      @FXML
	      private TableColumn<admission,String> col5;

	      @FXML
	      private TableColumn<admission,Integer> col6;

	      @FXML
	      private TableColumn<admission,String> col7;

	      @FXML
	      private TableColumn<admission,Integer> col8;

	      @FXML
	      private TableColumn<admission,String> col9;

	      @FXML
	      private TableColumn<admission,String> col10;
	      
	      @FXML
	      private Label label;

	      
	     
	      public ObservableList<admission>  init() throws Exception {
	    	  demosql Yashwanth = new demosql();
	    	  ObservableList<admission> adds = Yashwanth.print();
	    	  ObservableList<admission> list	= FXCollections.observableArrayList(adds);
	    	  return list;
	
	      }
	      @FXML
	      void Select(ActionEvent event) throws Exception {

	      admission s = table.getSelectionModel().getSelectedItem();
	            
	      demosql lib = new demosql();
	      if(s==null) {
	    	  label.setText("Select a value");
	    	  return;
	      	}
	      lib.updateDetails( s.getEmail());
	      label.setText("Update Successfully");
	      this.table.setItems(init());
	      
	  

	      }
          
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	
		
		
		
		
		
		col1.setCellValueFactory(new PropertyValueFactory<admission,String>("student"));
		col2.setCellValueFactory(new PropertyValueFactory<admission,String>("email"));
		col3.setCellValueFactory(new PropertyValueFactory<admission,String>("father"));
		col4.setCellValueFactory(new PropertyValueFactory<admission,String>("gender"));
		col5.setCellValueFactory(new PropertyValueFactory<admission,String>("Univ1"));
		col6.setCellValueFactory(new PropertyValueFactory<admission,Integer>("per1"));
		col7.setCellValueFactory(new PropertyValueFactory<admission,String>("Univ2"));
		col8.setCellValueFactory(new PropertyValueFactory<admission,Integer>("per2"));
		col9.setCellValueFactory(new PropertyValueFactory<admission,String>("DOB"));
		col10.setCellValueFactory(new PropertyValueFactory<admission,String>("Addr"));
		try {
			this.table.setItems(init());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
			
	
    
		
			
		
	}
	 
	  

}
