import java.sql.*;  
public class TM {
	public static void main(String a[]) {
		Connection c=null;
		PreparedStatement ps1=null,ps2=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			c =DriverManager.getConnection("jdbc:mysql://localhost:3306/tm", "root", "root");  
			ps1=c.prepareStatement("update account set balance=balance-? where ano=?");
			ps2=c.prepareStatement("update account set balance=balance+? where ano=?");
			
		    }
		    catch(ClassNotFoundException ce) {
			System.out.println("unable to load Driver");
		    }
	        catch(SQLException sql) {
	        	System.out.println("unable to establish connection");
	        }
		try {		
			ps1.setInt(1,1000);
			ps1.setInt(2,333);
			ps2.setInt(1,20000);
			ps2.setInt(2,444);
			
			int k1=ps1.executeUpdate();
			int k2=ps2.executeUpdate();
			if(k1>0&&k2>0) 
				System.out.println("Transaction Success");
			
			else 
				System.out.println("Transaction failure");
			
		    c.close();
		    }
		    catch(Exception e) {
		    	System.out.println(e);
		}
		
	}

}
