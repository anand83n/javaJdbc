
import java.sql.*;
public class MyClass {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Course","root","anand0231");
					Statement stmt=con.createStatement();
			ResultSet rs= stmt.executeQuery("Select * from Department");
			while(rs.next()) 
				System.out.println(rs.getInt(1) + "\t"+ rs.getString(2));
				con.close();
				
				
			} catch(Exception e) {System.out.print(e);}
		
	}
}
