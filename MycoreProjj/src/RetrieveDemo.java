//package connect;

import java.sql.*;

public class RetrieveDemo {
	public static void main(String[] args) {
		try {
			//Register the JDBC driver
			Class.forName("com.mysql.jdbc.Driver");
			// Establish the connection
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","anand0231");
			// create Statement
			Statement stmt= con.createStatement();
			ResultSet rs=stmt.executeQuery("Select * from studentsdata");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));		}
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}

}
}