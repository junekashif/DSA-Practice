import java.util.*;
class search{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number to search ");
        int n= sc.nextInt();
        int ar[]=new int[10];
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter a number in array");
            ar[i]=sc.nextInt();
        }
        Arrays.sort(ar);
        int start=0,end=ar.length,position=-1;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(ar[mid]==n)
            {
                position = mid;
                break;
            }
            else if(ar[mid]>n)
            {
                end = mid-1;
            }
            else if(ar[mid]<n)
            {
                start=mid+1;
            }
        }
        System.out.println(position);
    }
}