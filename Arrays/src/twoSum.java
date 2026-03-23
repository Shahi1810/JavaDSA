import java.util.HashMap;
import java.util.Map;

public class twoSum {

    public int[] twoSumWorstCase(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target)
                    return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
    public int[] twoSumBetterAndBestCase(int[] arr, int target) {
        Map<Integer, Integer> mapping = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            int remaining = target - arr[i];
            if (mapping.containsKey(remaining)) {
                return new int[]{i, mapping.get(remaining)};
            }
            mapping.put(arr[i], i);
        }
        return new int[]{0, 1};
    }
}
