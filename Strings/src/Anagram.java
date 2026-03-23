import java.util.HashMap;
public class Anagram {
    public boolean isAnagramBestCase(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> mappingS = new HashMap<>();
        HashMap<Character,Integer> mappingT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            mappingS.put(s.charAt(i), 1+mappingS.getOrDefault(s.charAt(i),0));
            mappingT.put(t.charAt(i),1+mappingT.getOrDefault(t.charAt(i),0));
        }
        return mappingS.equals(mappingT);
    }
}
