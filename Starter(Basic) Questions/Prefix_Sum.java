import java.util.*;
public class Prefix_Sum 
{
    public static void Print_PF_Sum(int ar[])
    {
        int pfs[]=new int[ar.length];
        pfs[0]=ar[0];
        int sum;
        for(int i=1;i<ar.length;i++)
        {
            pfs[i]=pfs[i-1]+ar[i];
        }
        for(int i=0;i<ar.length;i++)
        {
            for(int j=i;j<ar.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(ar[k]+" ");
                }
                if(i==0)
                sum=pfs[j];
                else
                sum=pfs[j]-pfs[i-1];
                System.out.print("= " + sum +"           ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter no. of elements in the array: ");
        int n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter a number: ");
            array[i]=sc.nextInt();
        }
        Print_PF_Sum(array);
    }
}
