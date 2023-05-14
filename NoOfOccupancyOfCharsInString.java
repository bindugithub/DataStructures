import java.util.HashMap;

public class NoOfOccupancyOfCharsInString {
    public static void main(String[] args){
        NoOfOccupancyOfCharsInString no = new NoOfOccupancyOfCharsInString();
        System.out.println(no.charsInString("missing"));

    }
    public HashMap charsInString(String s){
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
        return map;
    }
}
