package application;
import java.sql.*;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
public class demosql {

	
private String url,uname,pass;
private Connection con;
private ObservableList<admission> list;

	public demosql() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		 url = "jdbc:mysql://localhost:3306/uas0";
	     uname = "root";
	     pass  = "pass";
	    con = DriverManager.getConnection(url,uname,pass);
	}
	
/*	public String Details(String mail) throws Exception{
       String query = " select "+ "*" +"from student where EMAIL =\""+mail+"\"";
		Statement st = this.con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String name = rs.getString("username"); 
		
		
		System.out.println(name);
		
		
		return name;
	}*/
	public void insert (String FIRSTNAME,String LASTNAME,String PHONENO,String EMAIL,String PASSWORD) throws SQLException {
		Statement st = con.createStatement();
		
		String query = "insert into student values ( \""+FIRSTNAME+"\"," +" \""+ LASTNAME +"\"," +" \""+ PHONENO +"\"," +" \""+ EMAIL +"\"," +" \""+ PASSWORD +"\" )";
		st.executeUpdate(query);
	}
	
	public void delete ( String email) throws SQLException {
		Statement st = con.createStatement();
		
		String query = "delete from student where EMAIL = \"" + email + "\"";
		st.executeUpdate(query);
	}
	
	public void insertadm (String studenta,String emaila,String fathera,String gender,String Address,String tenthuni,int tenthper,int tenyear, String interu,int interper,int interyear,String DOB) throws SQLException {
		Statement st = con.createStatement();
		
		String query = "insert into admissionform values ( \""+studenta+"\"," +" \""+ emaila +"\"," +" \""+ fathera +"\"," +" \""+ gender +"\"," +" \""+ Address+"\"," +"\""+ tenthuni +"\", "+ tenthper +", "+ tenyear +"," +" \""+ interu +"\", "+ interper +", "+ interyear +"," +" \""+ DOB +"\")";
		st.executeUpdate(query);
	}
	public ObservableList<admission> print( ) throws SQLException {
		Statement st = con.createStatement();
		String query = "select " + "*"+ " from admissionform ";
		ResultSet rs = st.executeQuery(query);
		list = FXCollections.observableArrayList();
		
            while(rs.next()) {
    			list.add(new admission (rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getInt(7), rs.getInt(8), rs.getString(9),rs.getInt(10),rs.getInt(11),rs.getString(12)));
    		}                     
           
 
		return list;
		
	}
	public ObservableList<admission> printdashboard( ) throws SQLException {
	
		Statement st = con.createStatement();
		String query = "select  *  from admissionform where gender = \"1\" ";
	
		ResultSet rs = st.executeQuery(query);
		list = FXCollections.observableArrayList();
		
            while(rs.next()) {
    			list.add(new admission (rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getInt(7), rs.getInt(8), rs.getString(9),rs.getInt(10),rs.getInt(11),rs.getString(12)));
    		}                     
           
 
		return list;
		
	}
	public void updateDetails(String condition) throws SQLException{
		Statement st = con.createStatement();
		String query = "update admissionform set gender  =\"1\" where emaila = \"" + condition + "\"";
		st.executeUpdate(query);
		
	}
	
}
