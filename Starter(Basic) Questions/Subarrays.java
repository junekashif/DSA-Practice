class Subarrays 
{
    public static void subarr(int ar[])
    {
        int n=ar.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int s=0;
                for(int k=i;k<=j;k++)
                {
                    System.out.print(ar[k]+" ");
                }
                System.out.print("   ");
            }
            System.out.println();
        }
    }
    public static void main(String arg[])
    {
        int a[]={1,2,3,4,5,6};
        subarr(a);
    }
}
