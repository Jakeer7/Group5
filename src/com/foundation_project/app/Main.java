package com.foundation_project.app;
import java.util.Scanner;
//import com.foundation_project.sql_configuration.MySqlAccess;
import com.revature.foundation_project.doa.Admin;
import com.revature.foundation_project.menu.Menu;

public class Main {

	public static void main(String[] args) throws Exception
	{
		Scanner scan=new Scanner(System.in);
		 
		 //MySqlAccess sql=new MySqlAccess();
		Admin admin=new Admin();
		do
		{
			Menu.mainMenu();
//			System.out.println("1. Add a user");
//			System.out.println("2. Update the user");
//			System.out.println("3. Remove user");
//			System.out.println("4. Display user");
//			System.out.println("5. Exit");
			
		int choice=scan.nextInt();
		switch(choice)
		{
		case 1:
			admin.addNewUser();
			break;
		case 2:
			admin.updateUser();
			break;
		case 3:
			admin.removeUser();
			break;
		case 4:
			admin.displayUser();
			break;
		case 5:
			System.exit(0);
		default:
			System.out.println("Sorry, I can't get you.....!   :( ");
			break;
			
		}
	}while(true);

	}

}
