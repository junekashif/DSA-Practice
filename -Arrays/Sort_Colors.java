public class Sort_Colors
{
    public void sortColors(int nums[]) 
    {
       int i,j,c=0,n=nums.length,f=0;
       int ar[]= new int[n];
       for(i=0;i<3;i++)
       {
        for(j=0;j<n;j++)
        {
            if(nums[j]==i)
            c++;
        }
        for(int k=1;k<=c;k++)
        {
            ar[f]=i;
            f++;
        }
        c=0;
       }
       for(i=0;i<n;i++)
       nums[i]=ar[i];
    }
}