import java.util.Stack;

public class PalindromeString {
    public static void main(String[] args){
        PalindromeString p = new PalindromeString();
        //System.out.println(p.isPalindrome("aaba"));
       // System.out.println(p.isPalindromeUsingStack("IAS"));
        System.out.println(p.isPalindromeUsingStack("abbaa"));

    }
    public boolean isPalindrome(String s){
        StringBuilder r = new StringBuilder();
        for(int i = s.length()-1 ; i >=0 ; i--){
            r.append(s.charAt(i));
        }
        System.out.println(r.toString());
        if((r.toString()).equals(s)){
           return true;
        }
        return false;
    }

    public boolean isPalindromeUsingStack(String str){
        Stack<Character> stack = new Stack<>();
        StringBuilder reverse = new StringBuilder();
        for(int j=0; j<str.length(); j++){
        stack.push(str.charAt(j));
        }
        //System.out.println(stack);
        for(int z=0; z<str.length(); z++){
            if(str.charAt(z) != stack.pop()){
                return false;
            }
        }
        return true;
    }

    public boolean isPalindromeUsingLby2(String st){
        int length = st.length();
        for(int i=0; i<length/2 ; i++){
            if(st.charAt(i) != st.charAt(length-1-i)){
                return false;
            }
        }
        return true;
    }
}
