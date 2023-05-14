import java.util.HashMap;
import java.util.List;

public class FindNoWithDuplicateEntry {
    public static void main(String[] args){
        FindNoWithDuplicateEntry de = new FindNoWithDuplicateEntry();
        System.out.println(de.duplicateEntryNum(new int[]{3,1,4,4,2}));

    }
    public int duplicateEntryNum(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:nums) {
            if (map.containsKey(i)) {
                return i;
            }
            else{
                map.put(i, 1);
            }
        }
        return -1;
    }
}
