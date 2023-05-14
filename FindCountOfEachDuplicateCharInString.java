import java.util.HashMap;

public class FindCountOfEachDuplicateCharInString {
    public static void main(String[] args){
        FindCountOfEachDuplicateCharInString fd = new FindCountOfEachDuplicateCharInString();
        System.out.println(fd.countEachDuplicateCharInString("Bharrattr"));

    }
    public int countDuplicateCharInString(String s){
        int duplicateCount = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
                map.put(c, map.getOrDefault(c, 0)+1);
            }
        System.out.println(map);
        for(char z:map.keySet()){
            if(map.get(z) > 1){
               duplicateCount++;
            }
        }
        return duplicateCount;
    }

    public HashMap countEachDuplicateCharInString(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> resultMap = new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        System.out.println(map);
        for(char z:map.keySet()){
            if(map.get(z) > 1){
                resultMap.put(z, map.get(z));
            }
        }
        return resultMap;
    }
}
