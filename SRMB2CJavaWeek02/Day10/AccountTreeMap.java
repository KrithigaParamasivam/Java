
import java.util.*;
class Account
{
    private String accNo = null;
    private String balance = null;

    public Account( String accNo, String balance) {

        this.accNo = accNo;
        this.balance=balance;

    }
    public String toString() {
        return "Account Number : " + accNo +"  Balance : " + balance +"\n";
    }
}

class AccountTreeMap {
    public static void main(String args[])
    {
        TreeMap<String,String>ac = new TreeMap<String,String>();
        ac.put("Aaaaaaa"," Rs:7000");
        ac.put("xxxxxxx"," Rs:20000.19");
        ac.put("yyyyyyy"," Rs:25000.12");
        ac.put("bbbbbbb"," Rs:40000");
        ac.put("fffffff"," Rs:34435");
        System.out.println("The account details are: ");
        Set<Map.Entry<String, String>> s=ac.entrySet();
        for(Map.Entry<String,String> emp:s)
        {
            System.out.println("Emp No: "+emp.getKey()+" "+emp.getValue());
        }
        System.out.println();
        System.out.println("Enter the AccountNumber to view the balance:");
        Scanner s1=new Scanner(System.in);
        System.out.println(ac.get(s1.next()));
       // System.out.println("Initial Balance of accountNo Aaaaaaa is" + ac.get("Aaaaaaa"));
        //System.out.println("Initial Balance of accountNo yyyyyyy  is" + ac.get("yyyyyyy"));
        //System.out.println("Initial Balance of accountNo abca  is" + ac.get("abca"));

    }
}
