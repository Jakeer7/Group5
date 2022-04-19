package com.revature.foundation_project.doa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.foundation_project.sql_configuration.MySqlAccess;
import com.foundation_project.sql_queries.Queries;

public class Users 
{
	Connection conn=MySqlAccess.getConnection();
	static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	static Date date=new Date();
	static Scanner sc=new Scanner(System.in);
	PreparedStatement preaparedSt=null;
	MySqlAccess query=new MySqlAccess();
	public void addAdmin() throws SQLException
	{
		
		String currentDateTime = format.format(date);
		System.out.println("Enter new admin's name : ");
		String adminName=sc.next();
		System.out.println("Enter new admin's password : ");
		String adminPassword=sc.next();
		System.out.println("Enter new admin's mobile : ");
		String adminMobile=sc.next();
		PreparedStatement preparedStatement = conn.prepareStatement(Queries.INSERT_QUERY_FOR_USER);
		preparedStatement.setString(1,"R001");
		preparedStatement.setString(2,"Admin");
		preparedStatement.setString(3, adminName);
		preparedStatement.setString(4,adminPassword);
		preparedStatement.setString(5, adminMobile);
		preparedStatement.setString(6, currentDateTime);
		preparedStatement.executeUpdate();
		System.out.println("Great! Welcome aboard.");
	}
	public void updateAdmin() throws SQLException
	{
		String currentDateTime = format.format(date);
		System.out.println("Enter admin id to update admin profile : ");
		int adminId=sc.nextInt();
		System.out.println("Enter the new password for admin : "+adminId);
		String adminPassword=sc.next();
		PreparedStatement preparedStatement = conn.prepareStatement(Queries.UPDATE_QUERY_FOR_USER);
		preparedStatement.setString(1, adminPassword);
		preparedStatement.setString(2,currentDateTime);
		
//		preparedStatement.setString(3, adminMobile);
		preparedStatement.setInt(3, adminId);
		preparedStatement.executeUpdate();
		
		System.out.println("Admin "+adminId+" profile has been updated!\n");
	}
	public void removeUser() throws SQLException
	{
		System.out.println("Enter the admin to delete : ");
		String userId=sc.next();
		PreparedStatement preparedStatement = conn.prepareStatement(Queries.DELETE_QUERY_FOR_USER);
		preparedStatement.setString(1, userId);
		preparedStatement.executeUpdate();
		
		System.out.println("Removed.....We'll connect agian sometime!");
	}
	
	public void seeAllAdmins() throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement preparedStatement=conn.prepareStatement(Queries.SELECT_ALL_FROM_ADMIN);
		ResultSet rs = preparedStatement.executeQuery();
		System.out.println("All admins:");
		while(rs.next())
		{
			String Admin_id=rs.getString("user_id");
			String Admin_Name=rs.getString("user_Name");
			String Admin_Password=rs.getString("user_Password");
			String Admin_Mobile=rs.getString("user_Mobile");
			String Admin_Last_Modified=rs.getString("User_Last_Modified");
			System.out.println(Admin_id+" "+Admin_Name+" "+Admin_Password+" "+Admin_Mobile+" "+Admin_Last_Modified);
		}
	}
	public void addReceptionist() throws SQLException {
		// TODO Auto-generated method stub
		String currentDateTime = format.format(date);
		System.out.println("Enter new recepitionist's name : ");
		String receptionistName=sc.next();
		System.out.println("Enter new recepitionist's password : ");
		String receptionistPassword=sc.next();
		System.out.println("Enter new recepitionist's mobile : ");
		String receptionistMobile=sc.next();
		PreparedStatement preparedStatement = conn.prepareStatement(Queries.INSERT_QUERY_FOR_USER);
		preparedStatement.setString(1,"Receptionist");
		preparedStatement.setString(2, receptionistName);
		preparedStatement.setString(3, receptionistPassword);
		preparedStatement.setString(4, receptionistMobile);
		preparedStatement.setString(5, currentDateTime);
		preparedStatement.executeUpdate();
		System.out.println("Great! Welcome aboard.");
		
	}
	public void addGuest() throws SQLException {
		// TODO Auto-generated method stub
		String currentDateTime = format.format(date);
		System.out.println("Enter new user's name : ");
		String userName=sc.next();
		System.out.println("Enter new user's password : ");
		String userPassword=sc.next();
		System.out.println("Enter new user's mobile : ");
		String userMobile=sc.next();
		PreparedStatement preparedStatement = conn.prepareStatement(Queries.INSERT_QUERY_FOR_USER);
		preparedStatement.setString(1,"Guest");
		preparedStatement.setString(2, userName);
		preparedStatement.setString(3, userPassword);
		preparedStatement.setString(4, userMobile);
		preparedStatement.setString(5, currentDateTime);
		preparedStatement.executeUpdate();
		System.out.println("Great! Welcome aboard.");
		
	}
	public void updateReceptionist() throws SQLException {
		String currentDateTime = format.format(date);
		System.out.println("Enter receptionist id to update receptionist profile : ");
		int receptionistId=sc.nextInt();
		System.out.println("Enter the new password for receptionist : "+receptionistId);
		String receptionistPassword=sc.next();
		PreparedStatement preparedStatement = conn.prepareStatement(Queries.UPDATE_QUERY_FOR_USER);
		preparedStatement.setString(1, receptionistPassword);
		preparedStatement.setString(2,currentDateTime);
		
//		preparedStatement.setString(3, receptionistMobile);
		preparedStatement.setInt(3, receptionistId);
		preparedStatement.executeUpdate();
		
		System.out.println("receptionist "+receptionistId+" profile has been updated!\n");
		
	}
	public void updateGuest() throws SQLException {
		String currentDateTime = format.format(date);
		System.out.println("Enter guest id to update guest profile : ");
		int guestId=sc.nextInt();
		System.out.println("Enter the new password for guest : "+guestId);
		String guestPassword=sc.next();
		PreparedStatement preparedStatement = conn.prepareStatement(Queries.UPDATE_QUERY_FOR_USER);
		preparedStatement.setString(1, guestPassword);
		preparedStatement.setString(2,currentDateTime);
		
//		preparedStatement.setString(3, guestMobile);
		preparedStatement.setInt(3, guestId);
		preparedStatement.executeUpdate();
		
		System.out.println("guest "+guestId+" profile has been updated!\n");
	}
//	public void removeReceptionist() throws SQLException {
//		// TODO Auto-generated method stub
//		System.out.println("Enter the reception to remove : ");
//		int receptionistId=sc.nextInt();
//		PreparedStatement preparedStatement = conn.prepareStatement(Queries.DELETE_QUERY_FOR_USER);
//		preparedStatement.setInt(1, receptionistId);
//		preparedStatement.executeUpdate();
//		
//		System.out.println("Removed.....We'll connect agian sometime!");
//	}
//	public void removeGuest() {
//		// TODO Auto-generated method stub
//		
//	}
	public void seeReceptionist() throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement preparedStatement=conn.prepareStatement(Queries.SELECT_ALL_FROM_RECEPTION);
		ResultSet rs = preparedStatement.executeQuery();
		System.out.println("All Receptionists:");
		while(rs.next())
		{
			String user_id=rs.getString("user_id");
			String user_Name=rs.getString("user_Name");
			String user_Password=rs.getString("user_Password");
			String user_Mobile=rs.getString("user_Mobile");
			String user_Last_Modified=rs.getString("User_Last_Modified");
			System.out.println(user_id+" "+user_Name+" "+user_Password+" "+user_Mobile+" "+user_Last_Modified);
		}
		
	}
	public void seeGuest() throws SQLException {
		// TODO Auto-generated method stu
		PreparedStatement preparedStatement=conn.prepareStatement(Queries.SELECT_ALL_FROM_GUEST);
		ResultSet rs = preparedStatement.executeQuery();
		System.out.println("All Guests:");
		while(rs.next())
		{
			String user_id=rs.getString("user_id");
			String user_Name=rs.getString("user_Name");
			String user_Password=rs.getString("user_Password");
			String user_Mobile=rs.getString("user_Mobile");
			String user_Last_Modified=rs.getString("User_Last_Modified");
			System.out.println(user_id+" "+user_Name+" "+user_Password+" "+user_Mobile+" "+user_Last_Modified);
		}
	}
}
