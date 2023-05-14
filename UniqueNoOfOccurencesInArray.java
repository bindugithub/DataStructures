import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueNoOfOccurencesInArray {
    public static void main(String[] args){
        UniqueNoOfOccurencesInArray u = new UniqueNoOfOccurencesInArray();
        System.out.println(u.uniqueOccurrences(new int[]{1,1,1,1,3,2,2,3,3}));

    }
    public boolean uniqueOccurrences(int[] arr){
        if (arr.length == 0 || arr == null) {
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++) {
           map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(map);
        Set<Integer> set = new HashSet<>();
        for(int z: map.keySet()) {
            if (set.contains(map.get(z))) {
                return false;
            }
            set.add(map.get(z));
        }
        System.out.println(set);
        return true;

    }
}
