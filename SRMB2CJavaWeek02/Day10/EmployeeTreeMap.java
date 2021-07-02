import java.security.KeyStore;
import java.util.*;

class Employee
{
    private String name = null;
    private String designation = null;

    public Employee( String name, String designation) {

        this.name = name;
        this.designation=designation;

    }
    public String toString() {
        return "Employee Name : " + name +"   Designation: " + designation +"\n";
    }
}

class EmployeeTreeMapClass {
    public static void main(String args[])
    {
        TreeMap<Integer,Employee> employees = new TreeMap<Integer,Employee>();
        employees.put(121,new Employee("Divya","Developer"));
        employees.put(122,new Employee("Mani","TeamLeader"));
        employees.put(123,new Employee("Prabhu","Trainer"));
        employees.put(122,new Employee("Mani","TeamHead"));
        employees.put(123,new Employee("Prabhu","Hra"));
        Set<Map.Entry<Integer, Employee>> s=employees.entrySet();
        for(Map.Entry<Integer,Employee> emp:s)
        {
            System.out.println("Emp No: "+emp.getKey()+" "+emp.getValue());
        }
        }
    }
