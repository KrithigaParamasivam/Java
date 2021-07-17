package rmi;

import java.util.*;  
import java.rmi.*;  
public class MyClient{  
public static void main(String args[])throws Exception{  
Bank b=(Bank)Naming.lookup("rmi://localhost:6666/javatpoint");  
  
List<Customer> list=b.getCustomers();  
for(Customer c:list){  
System.out.println(c.getano()+" "+c.getuname()+" "+c.getbalance());  
}  
  
}}  