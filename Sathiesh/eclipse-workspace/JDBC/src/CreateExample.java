import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/10247capgemini","root","Logesh@23");
		PreparedStatement st=con.prepareStatement("update usernew set uname=? where userid=?");
		
		st.setString(1, "ravi");
		st.setInt(2, 1001);
		st.executeUpdate();
		con.close();
		System.out.println("created successfully");
		
		

	}

}

