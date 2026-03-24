import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {
    public boolean containsDuplicateWorstCase(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean containsDuplicateBetterCase(int[] nums) {
        HashMap<Integer,Integer>count = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            count.put(nums[i], count.getOrDefault(nums[i],0)+1);
        }
        for (int i : count.values()) {
             if(i>1) return true;
        }
        return false;
    }

    public boolean containsDuplicateBestCase(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for(int i : nums){
            if(!seen.contains(i)){
                seen.add(i);
            }else{
                return true;
            }
        }
        return false;
    }
}
