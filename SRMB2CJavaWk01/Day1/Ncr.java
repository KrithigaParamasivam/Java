import java.util.*;
public class Ncr
{
    
    static int nCr(int n, int r)
    {
        return fact(n) / (fact(r) * fact(n - r));
    }
    
    static int fact(int n)
    {
        int res = 1;
        for (int i = 2; i <= n; i++)
            res = res * i;
        return res;
    }
    public static void main(String[] args)
    {
       
        Scanner sc = new Scanner(System.in);
        int n,r;  
        System.out.println("Enter the value of n :");
        n = sc.nextInt();  
        System.out.println("Enter the value of r :");
        r = sc.nextInt(); 
        if(n>=r)
        {
            
            System.out.println("Value of "+ n+"C"+r+"= "+nCr(n, r));
        }
        else
            System.out.println("n value should be greater than or equals to r value");
    }
}
