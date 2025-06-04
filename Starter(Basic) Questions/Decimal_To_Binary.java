import java.util.*;

class Decimal_To_Binary
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            System.out.println("Enter a Decimal Number");
            int n = sc.nextInt();
            int bn=0,pow=0;
            while(n>0)
            {
                int d = n%2;
                bn=bn+d*(int)Math.pow(10,pow);
                pow++;
                n=n/2;
            }
            System.out.println("Binary Equivalent = " + bn);
        }
    }
}