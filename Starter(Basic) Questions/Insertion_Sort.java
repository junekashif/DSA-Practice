class Insertion_Sort
{
    public static void InsertSort(int ar[])
    {
        int len=ar.length;
        for(int i=0;i<len-1;i++)
        {
            int minpos=i;
            for(int j=i+1;j<len;j++)
            {
                if(ar[minpos]>ar[j])
                minpos=j;
            }
            int temp = ar[i];
            ar[i] = ar[minpos];
            ar[minpos]=temp;
        }
    }
    public static void printArr(int ar[])
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
    public static void main(String arg[])
    {
        int arr[]={5,2,1,6,4,4};
        InsertSort(arr);
        printArr(arr);
    }
}