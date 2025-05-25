class Smallest_Index_With_Digit_Sum_Equal_to_Index
{
    public int smallestIndex(int[] nums) 
    {
        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i],s=0;
            while(n>0)
            {
                int d=n%10;
                n=n/10;
                s+=d;
            }
            if(s==i)
                return i;
        }
        return -1;
    }
}