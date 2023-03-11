package com.autoiinnovations.admin.utility;

import java.sql.*;

public class DbConnection {
	static Connection con;

	
     // public Connection getDbConnection() {
    	  try {
    	  Class.forName("com.mysql.jdbc.Driver");
    	  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/autoi_admin","root","1234");
    	  System.out.println("1");
    	  }catch(Exception e) {
    		  e.printStackTrace();
    	  }
    	 // return con;
    	  System.out.println("2");
    	  
      }
}
