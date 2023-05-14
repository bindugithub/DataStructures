import java.util.HashMap;
import java.util.List;

public class CountOfChars {
    public static void main(String[] args){
            CountOfChars c = new CountOfChars();
            System.out.println(c.charCount("aaaaaabbccdddd"));

        }

        public HashMap charCount(String s){
        HashMap<Character, Integer> resultMap = new HashMap<>();
            HashMap<Character, Integer> map = new HashMap<>();
            for(char c: s.toCharArray()){
                map.put(c, map.getOrDefault(c, 0)+1);
            }
            System.out.println(map);
            char tempchar = 0;
            int tempval = Integer.MIN_VALUE;
            for(char c: map.keySet()){
                if(map.get(c)>tempval){
                    tempval = map.get(c);
                    tempchar = c;
                }
            }
            resultMap.put(tempchar, tempval);
            return resultMap;

        }

    }

