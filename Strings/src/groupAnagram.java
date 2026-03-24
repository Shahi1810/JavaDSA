import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupAnagram {
    public List<List<String>> groupAnagramsWorstCase(String[] strs) {
        HashMap<String, List<String>>mp = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String sortedWord = new String(temp);
            if(!mp.containsKey(sortedWord)){
                mp.put(sortedWord,new ArrayList<>());
            }
            mp.get(sortedWord).add(strs[i]);
        }
        return new ArrayList<>(mp.values());
    }
}
