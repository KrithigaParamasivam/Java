import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
class Insertdata
{
     public static final String DBURL = "jdbc:mysql://localhost:3306/student";
     public static final String DBUSER = "root";
     public static final String DBPASS = "root";
     public static void main(String args[])
     {
          try
          {
               //Loading the driver
               Class.forName("com.mysql.cj.jdbc.Driver");
               //Create the connection object
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
               //Insert the record
               String sql = "INSERT INTO details (id, uname, department, uyear) VALUES (?, ?, ?, ?)";
               PreparedStatement statement = con.prepareStatement(sql);
               statement.setInt(1, 4);
               statement.setString(2, "krithi");
               statement.setString(3, "mca");
               statement.setString(4, "3");

               int rowsInserted = statement.executeUpdate();
               if (rowsInserted > 0)
               {
                    System.out.println("A new record was inserted successfully!\n");
               }
               // Display the record
               String sql1 = "SELECT * FROM details";
               Statement stmt = con.createStatement();
               ResultSet result = stmt.executeQuery(sql1);

               while (result.next())
               {
                    System.out.println (result.getInt(1)+" "+
                    result.getString(2)+" "+
                    result.getString(3)+" "+
                    result.getString(4));
               }

               //Update the record
               String sql2 = "Update details set department = ? where uname = ?";
               PreparedStatement pstmt = con.prepareStatement(sql2);
               pstmt.setString(1, "mca");
               pstmt.setString(2, "brindha");
               int rowUpdate = pstmt.executeUpdate();
               if (rowUpdate > 0)
               {
                    System.out.println("\nRecord updated successfully!!\n");
               }

               //Delete the record
               String sql3 = "DELETE FROM details WHERE uname=?";
               PreparedStatement statement1 = con.prepareStatement(sql3);
               statement1.setString(1, "brindha");

               int rowsDeleted = statement1.executeUpdate();
               if (rowsDeleted > 0)
               {
                    System.out.println("A record was deleted successfully!\n");
               }
          }
          catch(Exception ex)
          {
               ex.printStackTrace();
          }
     }
}