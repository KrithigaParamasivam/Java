class Person{
    String name;
    int age;
    String number;
    String address;
    int salary;

    public void printSalary(){
        System.out.println("Name:"+name);
        System.out.println("Age"+age);
        System.out.println("PhoneNumber"+number);
        System.out.println("Address"+address);
        System.out.println("Salary:"+salary);
    }

}

class Emp extends Person{
    String specialization;
}

class Manager extends Person{
    String department;
}

class PersonMain{
    public static void main(String[] args){
        Emp e = new Emp();
        System.out.println("/Employee salary details/");
        e.name = "Brindha";
        e.age = 23;
        e.number = "986875675";
        e.address = "chennai";
        e.salary = 15000;
        e.specialization = "Employee";
        e.printSalary();

        Manager m = new Manager();
        System.out.println();
        System.out.println("/Manager salary details/");
        m.name = "susma";
        m.age = 23;
        m.number = "986875675";
        m.address = "coimbatore";
        m.salary = 20000;
        m.department = "Hr";
        m.printSalary();

    }
}
