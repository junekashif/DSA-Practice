public class Maximum_Difference_Between_Adjacent_Elements_in_a_Circular_Array 
{
    public int maxAdjacentDistance(int[] nums) 
    {
        int ad=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(i==nums.length-1)
            {
                if((int)Math.abs(nums[i]-nums[0]) > ad)
                ad=(int)Math.abs(nums[i]-nums[0]);
            }
            else
            {
                if((int)Math.abs(nums[i]-nums[i+1]) > ad)
                ad=(int)Math.abs(nums[i]-nums[i+1]);
            }
        }
        return ad;
    }
}
