import java.util.HashSet;
import java.util.Set;

public class FindNoOfVowelsInString {
    public static void main(String[] args){
        FindNoOfVowelsInString v = new FindNoOfVowelsInString();
        System.out.println(v.findVowels("lameouiviaa"));

    }
    public int findVowels(String str){
        int count = 0;
        String s = str.toLowerCase();
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        for(char c: s.toCharArray()){
            if(vowels.contains(c)){
                count++;
            }
        }
        return count;
    }
}
