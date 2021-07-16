package day22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class MenuDriven
{
public static void main(String[] args) throws ClassNotFoundException, NumberFormatException, IOException, SQLException
{
System.out.println("**** Menu Options ****");
System.out.println();

while(true)
{
System.out.println("1. Insert Student Record");
System.out.println("2. Update Student Record");
System.out.println("3. Show Student Record");
System.out.println("4. Delete Student Record");
System.out.println("***** Enter Your choice*****");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
Statement stmt = conn.createStatement();

int choice;
choice = Integer.parseInt(br.readLine());
switch(choice)
{
case 1:

//System.out.println("Inserting Records.");
System.out.println("Enter student Id.");
int id=Integer.parseInt(br.readLine());

System.out.println("Enter Student Name.");
String name =(br.readLine());

System.out.println("Enter student department.");
String department = (br.readLine());

System.out.println("Enter student year.");
int year = Integer.parseInt(br.readLine());

System.out.println("Enter student address.");
String address = (br.readLine());
System.out.println(".");

stmt.executeUpdate("insert into details (id,name,department,year,address) values ("+id+",'"+name+"','"+department+"','"+year+"','"+address+"')");
//stmt.executeUpdate("INSERT INTO stud " + "VALUES (01,'Harry','btech',4,'chennai')");
System.out.println("Data is Sucessfully Inserted");
break;

case 2:
// UpdateStudent();
System.out.println("Enter student Id.");
id=Integer.parseInt(br.readLine());

System.out.println("Enter Student Name.");
name =(br.readLine());

System.out.println("Enter department.");
department = (br.readLine());

System.out.println("year.");
year = Integer.parseInt(br.readLine());

System.out.println("Enter address.");
address= (br.readLine());

stmt.executeUpdate("update details set name='"+name+"', department='"+department+"', year='"+year+"', address='"+address+"' where id= '"+id+"'");

System.out.println("Data is Sucessfully Updated");

break;

case 3:
System.out.println("Showing Student");
ResultSet rs = stmt.executeQuery("select * from details");
while(rs.next())
{

System.out.println( id =rs.getInt(1));
System.out.println(name = rs.getString(2));
System.out.println(department= rs.getString(3));
System.out.println(year= rs.getInt(4));
System.out.println(address= rs.getString(5));

}
rs.close();
stmt.close();
conn.close();
break;

case 4:

System.out.println("Enter the ID of student to be deleted ");
id=Integer.parseInt(br.readLine());
//delete from stud where id=3
stmt.executeUpdate("delete from details where id='"+id+"'");
System.out.println(" Deleted Sucessfull.. ");

}
}
}
}

