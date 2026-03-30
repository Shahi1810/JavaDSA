import java.util.Arrays;

public class productOfArrayExceptItself {
    public int[] productExceptSelfWorstCase(int[] nums) {
        int[] ans = new int[nums.length];
        Arrays.fill(ans, 1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                ans[i] *= nums[j];
            }
        }
        return ans;
    }
    public int[] productExceptSelfBetterCase(int[] nums) {
        int n= nums.length;
        int[] pre = new int[n];
        int[] suff = new int[n];
        int[] ans=new int[n];
        pre[0]=1;
        suff[n-1] =1;

        for (int i = 1; i<n; i++) {
            pre[i]=pre[i-1]*nums[i-1];
        }

        for (int i = n-2; i >= 0; i--) {
            pre[i]=pre[i+1]*nums[i+1];
        }

        for (int i = 0; i < n; i++) {
            ans[i]=pre[i]*suff[i];
        }
        return ans;
    }
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int curr=1;
        int[] ans=new int[n];
        Arrays.fill(ans,1);
        for (int i = 0; i<n; i++) {
            ans[i]*=curr;
            curr*=nums[i];
        }
        curr=1;
        for (int i = n-1; i >= 0; i--) {
            ans[i]*=curr;
            curr*=nums[i];
        }
        return ans;
    }
}
