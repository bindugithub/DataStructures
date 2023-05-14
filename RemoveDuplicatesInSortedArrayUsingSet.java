import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesInSortedArrayUsingSet {
    public static void main(String[] args){
        RemoveDuplicatesInSortedArrayUsingSet dsa = new RemoveDuplicatesInSortedArrayUsingSet();
        System.out.println(dsa.removeDups(new int[]{4,4,4,3,3,2,2,1}));

    }
    public int removeDups(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        System.out.println(set);
        return set.size();
    }
}
