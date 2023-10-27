package service;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import dao.UserDao;
import dao.UserDaoImplementation;
import Model.User;

public class UserService
{
	public void view() throws ClassNotFoundException, SQLException
	{
		List<User>userlist=new UserDaoImplementation().viewUser();
		for(User u:userlist)
		{
			System.out.println(u.getUserId());
			System.out.println(u.getUserName());
			System.out.println(u.getCity());
			System.out.println(u.getState());
		}
	}
     public void userInsert() throws ClassNotFoundException, SQLException
     {
    	 User u=new User();
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("enter the userid");
    	 int userid=sc.nextInt();
    	 System.out.println("enter the username");
    	 String username=sc.next();
    	 System.out.println("enter the city");
    	 String city=sc.next();
    	 System.out.println("enter the state");
    	 String state=sc.next();
    	 u.setUserId(userid);
    	 u.setUserName(username);
    	 u.setCity(city);
    	 u.setState(state);
    	 new UserDaoImplementation().insertUser(u);
     }
     public void userUpdate() throws ClassNotFoundException, SQLException
     {
    	 User u=new User();
    	 Scanner sc=new Scanner(System.in);
    	 
    	 System.out.println("enter the username");
    	 String username=sc.next();
    	 System.out.println("enter the city");
    	 String city=sc.next();
    	 System.out.println("enter the state");
    	 String state=sc.next();
    	 System.out.println("enter the userid");
    	 int userid=sc.nextInt();
    	 u.setUserName(username);
    	 u.setCity(city);
    	 u.setState(state);
    	 u.setUserId(userid);
    	 new UserDaoImplementation().updateUser(u);
     }
     public void userDelete() throws ClassNotFoundException, SQLException
     {
    	
    	 Scanner sc=new Scanner(System.in);
    	 
    	
    	 System.out.println("enter the userid");
    	 int userid=sc.nextInt();
    	
    	 new UserDaoImplementation().deleteUser(userid);
     }
     
}
     


