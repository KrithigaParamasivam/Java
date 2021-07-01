import java.util.Collections;
import java.util.LinkedList;

class Employee
{
    private String ename = null;
    private int empNo = 0;
    private String desg = null;

    public Employee( String Name, int empNo,String Designation) {

        this.ename = Name;
        this.empNo = empNo;
        this.desg = Designation;
    }
    public String toString() {
        return "Employee Name : " +ename +"  Emp No: "+empNo+"  Designation: " + desg ;
    }
}
public class EmployeeList {
    public static void main(String[] args) {
        Employee e1 = new Employee( "sara",  121, "Developer");
        Employee e2 = new Employee("sakthi", 122, "Team Leader");
        Employee e3 = new Employee("musma",  123, "Project Head");
        Employee e4 = new Employee("deva",   124, "Trainer");

        LinkedList<Employee> employees = new LinkedList<Employee>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        for(int i=0; i< employees.size(); i++)
        {
            System.out.println(employees.get(i));
        }
    }

}