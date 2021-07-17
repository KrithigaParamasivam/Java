package rmi;

import java.rmi.*;  
import java.rmi.server.*;  
import java.sql.*;  
import java.util.*;  
class BankImpl extends UnicastRemoteObject implements Bank{  
BankImpl()throws RemoteException{}  
  
public List<Customer> getCustomers(){  
List<Customer> list=new ArrayList<Customer>();  
try{  
Class.forName("com.mysql.cj.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tm", "root", "root");  
PreparedStatement ps=con.prepareStatement("select * from account");  
ResultSet rs=ps.executeQuery();  
  
while(rs.next()){  
Customer c=new Customer();  
c.setano(rs.getInt(1));  
c.setuname(rs.getString(2));  
c.setbalance(rs.getInt(3));  

list.add(c);  
}  
  
con.close();  
}catch(Exception e){System.out.println(e);}  
return list;  
}//end of getCustomers()  
}  