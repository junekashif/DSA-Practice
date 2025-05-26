class Product_of_Array_Except_Self 
{
    public int[] productExceptSelf(int[] nums) 
    {
        int[] result = new int[nums.length];
        result[0] = 1;
        for (int i = 1; i < nums.length; i++) 
        {
            result[i] = result[i - 1] * nums[i - 1];
        }
        int rightProduct = 1;
        for (int i = nums.length - 1; i >= 0; i--) 
        {
            result[i] = result[i] * rightProduct;
            rightProduct *= nums[i];
        }

        return result;
    }
}