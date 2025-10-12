public class largestNumber {
    //https://www.geeksforgeeks.org/problems/largest-element-in-array4009
    public int findLargest(int[] nums)
    {
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(max<nums[i])
            {
                max=nums[i];
            }
        }
        return max;
    }
}
