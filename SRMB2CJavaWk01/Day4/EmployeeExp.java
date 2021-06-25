import java.util.Scanner;

class Employee1 {
    int eno;
    String ename;
    int bpay;

    Employee1(int eno, String ename, int bpay ) {
        this.eno = eno;
        this.ename = ename;
        this.bpay = bpay;
    }

    void calc() throws PayOutofBoundException {
        if (bpay > 10000) {
            String str = "Your bpay should be less 10000, you are not eligible";
            throw new PayOutofBoundException(str);
        } else {
            System.out.println("EmpNo: " + eno);
            System.out.println("Name  :" + ename);
            System.out.println("bpay :" + bpay);

        }
    }
}

    class PayOutofBoundException extends Exception
    {
        public PayOutofBoundException(String str)
        {
            System.out.println(str);

        }

    }

    public class EmployeeExp
    {
        public static void main(String args[]) throws PayOutofBoundException
        {
            int bpay,eno;
            String ename;

            Scanner s=new Scanner(System.in);
            System.out.println("Enter Employee No:");
            eno=s.nextInt();
            System.out.println("Enter Name:");
            ename=s.next();
            System.out.println("Enter your BasicPay:");
            bpay=s.nextInt();
            Employee1 e=new Employee1(eno,ename,bpay);
            e.calc();

        }

    }

