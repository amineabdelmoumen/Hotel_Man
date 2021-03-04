package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class singleton {
	private static Connection connection;
	static
    { 
        String url = "jdbc:mysql://localhost:3306/Hotel"; 
        String user = "root"; 
        String pass = ""; 
        try { 
            Class.forName("com.mysql.jdbc.Driver"); 
            connection = DriverManager.getConnection(url, user, pass); 
        } 
        catch (ClassNotFoundException | SQLException e) { 
            e.printStackTrace(); 
        } 
    } 
    public static Connection getConnection() 
    { 
        return connection; 
    } 
 

}
