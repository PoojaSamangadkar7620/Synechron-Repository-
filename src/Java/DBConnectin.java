package Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnectin {

	
	
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String dbURL = "jdbc:mysql://localhost:3306/synedatabase";
		
		String username = "root";
		
		String password = "root";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
        Connection con = DriverManager.getConnection(dbURL, username, password);
        
        Statement st = con.createStatement();
        
        String selectquery = "select * from Persons";
        
        ResultSet rs = st.executeQuery(selectquery);
        
        while(rs.next()) {
        	
        	System.out.println(rs.getString("PersonID"));
            System.out.println(rs.getString("FirstName"));
        }
	}

}