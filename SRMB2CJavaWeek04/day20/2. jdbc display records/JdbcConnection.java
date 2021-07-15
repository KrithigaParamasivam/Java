import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnection {
   static final String DB_URL = "jdbc:mysql://localhost:3306/student";
   static final String USER = "root";
   static final String PASS = "root";
   static final String QUERY = "SELECT * FROM details";

   public static void main(String[] args) {
      
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(QUERY);
      ) {		      
         while(rs.next()){
            //getting and Display values
            System.out.print("ID: " + rs.getInt("id"));
            System.out.print(", NAME: " + rs.getString("uname"));
            System.out.print(", DEPARTMENT: " + rs.getString("department"));
            System.out.println(", YEAR: " + rs.getString("uyear"));
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}
