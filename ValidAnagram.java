import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args){
        ValidAnagram v = new ValidAnagram();
        System.out.println(v.isAnagram("anagram", "nagram"));

    }
    public boolean isAnagram(String s, String t){
        if(s.length()!=t.length())
            return false;
        HashMap<Character, Integer> smap = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            smap.put(s.charAt(i), smap.getOrDefault(s.charAt(i), 0)+1);
            smap.put(t.charAt(i), smap.getOrDefault(t.charAt(i), 0)-1);
        }
        System.out.println(smap);
        for(char c: smap.keySet()){
            if(smap.get(c)!=0)
                return false;
        }
         return true;
    }
}
