
public class secondLargest {
    public int sLargest(int[] nums) {
        int largest = nums[0];
        int slargest = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                int temp = largest;
                largest = nums[i];
                slargest = temp;
            }
            if(nums[i]<largest && nums[i]>slargest){
                slargest=nums[i];
            }
        }
        return slargest;
    }
}
