package com.t2;

import java.sql.Connection;
import java.sql.Statement;


public class customerservise {
public void regCustomer(customer cus) {
	try {
		
		String query="insert into customer values('"+cus.getEmail()+"','"+cus.getName()+"','"+cus.getAge()+"','"+cus.getPassword()+"')";
		
		Statement statement= DBConnect.getConnection().createStatement();
		statement.executeUpdate(query);
//		
		
//        Connection connection = DBConnect.getConnection();
//        Statement statement = connection.createStatement();
//        statement.executeUpdate(query);
        
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
