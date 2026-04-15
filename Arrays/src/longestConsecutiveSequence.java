import java.util.Arrays;

public class longestConsecutiveSequence {
    public int longestConsecutiveWorst(int[] nums) {
        int longest = 1;
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            int cnt = 1;
            while(linearSearch(nums, x+1) == true){
                x= x+1;
                cnt= cnt+1;
            }
            longest = Math.max(longest,cnt);
        }
        return longest;
    }

    public boolean linearSearch(int[] arr,int x){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x){
                return true;
            }
        }
        return false;
    }
}
