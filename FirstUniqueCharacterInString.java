import java.util.HashMap;

public class FirstUniqueCharacterInString {
    public static void main(String[] args){
        FirstUniqueCharacterInString fc = new FirstUniqueCharacterInString();
        System.out.println(fc.uniqueCharInString("binbinm"));

    }
    public int uniqueCharInString(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c, 1);
            }
        }
        System.out.println(map);
        for(int i =0; i<s.length();i++){
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}
