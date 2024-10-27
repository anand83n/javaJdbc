
//package connect;
import java.io.DataInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class InsertDemo {
	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","anand0231");
		System.out.println("connected successfully");
		PreparedStatement ps=con.prepareStatement("Insert into studentsdata(sno, names, course) VALUES (?,?,?)");
		DataInputStream br=new DataInputStream(System.in);
		do
		{
			System.out.println("Enter sno:");
			int sno=Integer.parseInt(br.readLine());
			System.out.println("Enter Names:");
			String name=br.readLine();
			System.out.println("Enter Course:");
			String course=br.readLine();
			
			
			ps.setInt(1,sno);
			ps.setString(2,name);
			ps.setString(3,course);
			
			int i=ps.executeUpdate();
			System.out.println(i+" records affected");
			System.out.println("Do u want to continue:y/n");
			String s=br.readLine();
			if(s.startsWith("n"))
			{
				break;
			}
		}
		while(true);
		con.close();

	}

}
