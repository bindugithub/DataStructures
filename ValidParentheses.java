import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args){
        ValidParentheses v = new ValidParentheses();
        System.out.println(v.isValidParantheses("{}"));

    }

    public boolean isValidParantheses(String s){
        HashMap<Character, Character> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');
        for(char c:s.toCharArray()) {
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            }
            else if (stack.isEmpty() || map.get(c) != stack.pop() ){
                    return false;
                }
            }
            return stack.isEmpty();
        }
}


