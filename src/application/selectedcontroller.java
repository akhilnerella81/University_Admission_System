package application;


	import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
	import javafx.scene.control.Label;
	import javafx.scene.control.TableColumn;
	import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


		public class selectedcontroller implements Initializable {
		
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
			    	  ObservableList<admission> adds = Yashwanth.printdashboard();
			    	  ObservableList<admission> list	= FXCollections.observableArrayList(adds);
			    	  return list;
			
			      }
			      
			  
		          
			@Override
			public void initialize(URL arg0, ResourceBundle arg1) {
				
			
				//list.add(new admission("a","b","c","d","e","DF","g","123",1,2));
				
				
				
				
				
				col1.setCellValueFactory(new PropertyValueFactory<admission,String>("student"));
				col2.setCellValueFactory(new PropertyValueFactory<admission,String>("email"));
				col3.setCellValueFactory(new PropertyValueFactory<admission,String>("father"));
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


