import java.lang.*;
import java.lang.Math. *;
import java.lang.Number.*;
import java.util.Scanner;

class Number

{
    private double db1;
    public Number ( )
    {
        db1 = 240.0d;

    }
    public boolean isZero ( )
    {
        if (db1 == 0.0)
            return true;
        else
            return false;
    }
    public boolean isPositive ( )
    {
        if(db1 > 0.0)
            return true;
        else
            return false;
    }
    public boolean isNegative ( )
    {
        if (db1 < 0.0)
            return true ;
        else
            return false;
    }
    public boolean isodd( )
    {
        System.out.println(db1);
        if (db1 % 2 != 0.0)
            return true;
        else return false;
    }
    public boolean isEven ( )
    {
        if (db1 % 2 == 0.0)
            return true ;
        else return false;
    }
    public boolean isPrime ( )
    {
        int i, lastn;

        double a;
        boolean flag;
        a = Math.sqrt(db1);
        lastn = (int)a;
        flag = true;
        for (i=2; i<lastn; i++)
        {
            if (db1 != i)
            {
                if( db1 % i ==0)
                {
                    flag = false;
                    break;
                }
            }
        }
        if (flag)
            return true;
        else return false;
    }

   public boolean isAmstrong( ) {
       int num=153 ;
       int number, temp, total = 0;

       number = num;
       while (number != 0)
       {
           temp = number % 10;
           total = total + temp*temp*temp;
           number /= 10;
       }

       if (total == num)
           return true;
       else
           return false;
   }

    public double getFactorial ( )
    {
            int i,fact=1;
            int num1=5;
            for(i=1;i<=num1;i++){
                fact=fact*i;
            }
            return fact;
        }

    public double getReverse ( )
    {
        int a=345;
        int sum =0;
        int temp;
        while (a>0)
        {
            temp = a%10;
            sum = sum * 10 + temp;
            a = a/10;
        }
       // sum = sum * 10 +a;
        return sum;
    }

  //  public void dispBinary ( )
    //{
      //  System.out.println("ByteValue of lg :" + Long.toBinaryString(lg));
    //}

    public double getSqrt ( ){
        double a = 30;
        return(Math.sqrt(a));
    }

    public double getSqr ( ){
        double b = 30;
        return(b*b);

    }

    public double sumDigits ( ) {
        int b=240;
        int temp, d =0;

        while (b> 0) {
            temp = b % 10;
            d = d + temp;
            b = b / 10;
        }
        return d;

    }

    public static void main (String args [ ])
    {
        Number mynum = new Number( );
        System.out.println("");
        System.out.println ("isZero" + "="+ mynum.isZero() );
        System.out.println ("isPositive"+ "="+  mynum. isPositive());
        System.out.println ("isNegative" + "=" + mynum.isNegative() );
        System.out.println ("isOdd" + "="+mynum.isodd());
        System.out.println ("isEven"+ "="+mynum.isEven());
        System.out.println ("isPrime"+"="+mynum.isPrime());
        System.out.println ("getAmstrong" + "="+mynum.isAmstrong( ));
        System.out.println ("getFactorial"+"="+ mynum.getFactorial());
        System.out.println ("sumDigits" + "="+ mynum.sumDigits( ));
        System.out.println ("getReverse" + "="+ mynum.getReverse( ));
        System.out.println ("getSqrt" + "="+ mynum.getSqrt( ));
        System.out.println ("getSqrt" + "="+ mynum.getSqr( ));



    }
}
