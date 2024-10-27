
//package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDemo{
    /**
     * @param args
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO Auto-generated method stub
         Class.forName("com.mysql.jdbc.Driver"); // Not required for newer versions of JDBC

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root", "anand0231");
        PreparedStatement ps = con.prepareStatement("update studentsdata set sno=?, names=?, course=?");
        ps.setInt(1, 1);     
        ps.setString(2, "sam"); 
        ps.setString(3, "python");   

        int i = ps.executeUpdate();
        System.out.println(i + " records updated");

        con.close();
    }
}