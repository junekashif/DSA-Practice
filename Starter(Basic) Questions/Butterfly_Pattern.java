import java.util.*;
class Butterfly_Pattern
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. ");
        int n = sc.nextInt();
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j>=n-2;j--)
            {
                System.out.print("  ");
            }
            for (int j=1;j<=(2*(n-i)+1);j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j>=n-2;j--)
            {
                System.out.print("  ");
            }
            for (int j=1;j<=(2*(n-i)+1);j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}