import java.util.Arrays;
class Majority_Element
{
    public int majorityElement(int[] nums) 
    {
        Arrays.sort(nums);
        return (nums[nums.length/2]);
    }
}