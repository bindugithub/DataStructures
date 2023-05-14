import java.util.HashSet;
import java.util.Set;

public class RemoveVowelsFromString {
    public static void main(String[] args){
        RemoveVowelsFromString rv = new RemoveVowelsFromString();
        System.out.println(rv.removeVowels("leetcode"));

    }
    public String removeVowels(String s){
        Set<Character> vowels = new HashSet<>();
        StringBuilder newString = new StringBuilder();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        for(char c: s.toCharArray()){
            if(!vowels.contains(c)){
              newString.append(c);
            }
        }
        return newString.toString();
    }
}
