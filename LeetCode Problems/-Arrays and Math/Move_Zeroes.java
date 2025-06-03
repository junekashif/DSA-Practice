class Move_Zeroes
{
    public void moveZeroes(int[] nums) 
    {
        int RollingSnow=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            RollingSnow++;
            else if(RollingSnow>0)
            {
                int t = nums[i];
                nums[i]=0;
                nums[i-RollingSnow]=t;
            }
        }
    }
}