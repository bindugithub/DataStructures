import java.util.HashMap;

public class FirstDuplicateCharInString {
    public static void main(String[] args) throws Exception {
        FirstDuplicateCharInString fd = new FirstDuplicateCharInString();
        System.out.println(fd.duplicateCharInString("lyblu"));


    }
    public char duplicateCharInString(String s) throws Exception {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            if(map.containsKey(c)){
               return c;
            }
            else{
                map.put(c, 1);
            }
        }

        throw new Exception("Not Found");
    }
}
