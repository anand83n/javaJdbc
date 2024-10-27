//package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteDemo {
	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","anand0231");
		PreparedStatement ps=con.prepareStatement("delete from studentsdata where sno=?"); 
		ps.setInt(1,1);
		
			int i=ps.executeUpdate();
			System.out.println(i+" records deleted");
			
		con.close();

	}

}