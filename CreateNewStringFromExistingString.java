import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CreateNewStringFromExistingString {
    public static void main(String[] args){
        CreateNewStringFromExistingString cs = new CreateNewStringFromExistingString();
        System.out.println(cs.newString("something else"));

    }
    public String newString(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder newString = new StringBuilder();
        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+ 1 );
        }
        System.out.println(map);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                continue;
            }
            if(map.get(s.charAt(i))==1){
                newString.append(s.charAt(i));
            }
        }
        return newString.toString();
    }
}
