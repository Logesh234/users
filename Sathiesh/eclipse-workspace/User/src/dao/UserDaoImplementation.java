package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.User;

public class UserDaoImplementation implements UserDao
{
	public List<User>viewUser() throws ClassNotFoundException, SQLException
	{
		ArrayList<User> list=new ArrayList<User>();
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java10247","root","root");
		PreparedStatement st=con.prepareStatement("select * from user");
		ResultSet rs=st.executeQuery();
		while(rs.next())
		{
			User u=new User();
		   u.setUserId(rs.getInt(1));
		   u.setUserName(rs.getString(2));
		   u.setCity(rs.getString(3));
		   u.setState(rs.getString(4));
		   list.add(u);
		}
		return list;
	}
	public void insertUser(User u) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java10247","root","Logesh@23");
		PreparedStatement st=con.prepareStatement("insert into user values(?,?,?,?)");
		st.setInt(1, u.getUserId());
		st.setString(2, u.getUserName());
		st.setString(3, u.getCity());
		st.setString(4, u.getState());
		st.executeUpdate();
		System.out.println("inserted");
	}
	@Override
	public void updateUser(User u) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java10247","root","Logesh@23");
		PreparedStatement st=con.prepareStatement("update user set username=?,city=?,state=? where userid=?");
		
		st.setString(1, u.getUserName());
		st.setString(2, u.getCity());
		st.setString(3, u.getState());
		st.setInt(4, u.getUserId());
		st.executeUpdate();
		System.out.println("updated");
		
	}
	@Override
	public void deleteUser(int userid) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java10247","root","Logesh@23");
		PreparedStatement st=con.prepareStatement("delete from user where userid=?");
		

		st.setInt(1, userid);
		st.executeUpdate();
		System.out.println("deleted");
		
	}

}


