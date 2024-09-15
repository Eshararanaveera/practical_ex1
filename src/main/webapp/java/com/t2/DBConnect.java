package com.t2;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        
        String username = "root";
        String password = "12345";
        String port = "3307";
        String databaseName = "t2";
        
        // Corrected the driver class name
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // Form the JDBC URL using the port and database name
        String url = "jdbc:mysql://localhost:" + port + "/" + databaseName + "?characterEncoding=utf8";
        
        // Removed the extra 'port' parameter as it's part of the URL
        Connection con = DriverManager.getConnection(url, username, password);
        
        return con;
    }
}

