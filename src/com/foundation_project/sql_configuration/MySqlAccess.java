package com.foundation_project.sql_configuration;

import java.sql.*;
import java.text.SimpleDateFormat;
//import java.util.*;
import java.util.Date;
import com.foundation_project.sql_queries.*;

//import com.revature.util.DateTimeUtil;

//import com.revature.constants.Constant;

public class MySqlAccess {
	private static Connection connection=null;
	private static Statement statement=null;
    private static PreparedStatement preparedStatement = null;
    private static ResultSet rs = null;

    
    static{
    	try 
    	{
    	
	    	connection=DriverManager.getConnection("jdbc:mysql://localhost/hotel_management","root","Dada@183*");
	    	statement = connection.createStatement();
    	}
    	catch(Exception e) {}
    	
    }
    public static Statement getStatement()
	{
		return statement;
	}
    public static Connection getConnection() {
		// TODO Auto-generated method stub
		return connection;
	}
    
    
    
    
    /*
    Date date=new Date();
	Queries q=new Queries();
	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
    public void insert(String adminName,String adminPassword,long adminMobile) throws Exception
    {
    	try {
    	//q.setINSERT_QUERY_FOR_ADMIN(q.INSERT_QUERY_FOR_ADMIN);
    	String currentDateTime = format.format(date);
    	preparedStatement=connection.prepareStatement(q.getINSERT_QUERY_FOR_ADMIN());
    	 
    	//preparedStatement.setString(1,"admin");
    	preparedStatement.setString(1,adminName);
        preparedStatement.setString(2,adminPassword);
        
        preparedStatement.setLong(3, adminMobile);
        preparedStatement.setString(4, currentDateTime);
        
        preparedStatement.executeUpdate();  //INSERT
        System.out.println("New admin has been added!");
    	}
    	catch(Exception e) {}
    	
    }
    public void update(String adminPassword,int id) throws Exception
    {
    	try {
    	//q.setUPDATE_QUERY_FOR_ADMIN(q.UPDATE_QUERY_FOR_ADMIN);
    	String currentDateTime = format.format(date);
    	preparedStatement=connection.prepareStatement(q.getUPDATE_QUERY_FOR_ADMIN());
    	preparedStatement.setString(1,adminPassword);
        preparedStatement.setString(2, currentDateTime);
        preparedStatement.setInt(3, id);
        preparedStatement.executeUpdate();
        System.out.println("Admin details has been updated!");
    	}
    	catch(Exception e) {}
    }
    public void delete(int id)throws Exception
    {
    	try {
    	//q.setDELETE_QUERY_FOR_ADMIN();
		preparedStatement=connection.prepareStatement(q.getDELETE_QUERY_FOR_ADMIN());
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
        System.out.println("Id: "+id+" has been deleted succesfully!");
    	}
    	catch(Exception e) {}
    }
   */
    
    
    
    
    
    
    
    /*
    public void select()throws Exception
    {
    	//rs=null;
    	statement=connection.createStatement();
    	q.setSELECT_ALL_FROM_ADMIN();
		//try{
			ResultSet rs=statement.executeQuery(q.getSELECT_ALL_FROM_ADMIN());
			//rs.beforeFirst();
		//System.out.println("Admin_id Admin_Name Admin_Password Admin_Mobile Admin_Last_Modified");
		System.out.println("\n\n");
		while(rs.next()) {
			String Admin_id=rs.getString("Admin_id");
			String Admin_Name=rs.getString("Admin_Name");
			String Admin_Password=rs.getString("Admin_Password");
			String Admin_Mobile=rs.getString("Admin_Mobile");
			String Admin_Last_Modified=rs.getString("Admin_Last_Modified");
			System.out.println(Admin_id+" "+Admin_Name+" "+Admin_Password+" "+Admin_Mobile+" "+Admin_Last_Modified);
		}
    }
    */
		//System.out.println("\n\n");
	
		
//		}catch(Exception e) {
//			
//			System.out.println("Im in catch!"+e);
//		}
		//return rs;
    	
    
    
    }
    
    

