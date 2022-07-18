package my_library;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Lib_main {
    public static void main(String[] args) throws InstantiationException,IllegalAccessException,ClassNotFoundException
    {
        java.sql.Statement stmt=null;
        ResultSet rs=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/library1","root","root");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM books;");
            while(rs.next())
    {
    System.out.println(rs.getInt("BID")+" "+rs.getString("Book_name"));
    }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}
