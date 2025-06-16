import java.util.*;
class Floyds_Triangle
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int n=sc.nextInt(),p=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
            System.out.print(p + " ");
            p++;
            }
            System.out.println();
        }
    }
}