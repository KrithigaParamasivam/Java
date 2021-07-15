import java.rmi.*;  
public class MyClient{  
public static void main(String args[]){  
try{  
Adder stub=(Adder)Naming.lookup("rmi://localhost:5555/sonoo");  
System.out.println("Addition of two no:"+stub.add(40,44));  
}catch(Exception e){}  
}  
}  