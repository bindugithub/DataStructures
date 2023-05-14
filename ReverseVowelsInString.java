import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class ReverseVowelsInString {
    public static void main(String[] args){
        ReverseVowelsInString rw = new ReverseVowelsInString();
        System.out.println(rw.reverseVowels("leetcode"));
    }
    public String reverseVowels(String s){
        Set<Character> vowels = new HashSet<>();
        StringBuilder newString = new StringBuilder();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        Stack<Character> st = new Stack<>();
        for(char c: s.toCharArray()) {
            if (vowels.contains(c)) {
                st.push(c);
            }
        }
        System.out.println(st);
        for(char c:s.toCharArray()){
            if(vowels.contains(c)){
                newString.append(st.pop());
            }
            else{
                newString.append(c);
            }
        }
        return newString.toString();

    }
}
