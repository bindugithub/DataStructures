import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwoSum {
    public static void main(String[] args){
        TwoSum t = new TwoSum();
        int[] a = new int[]{2,5,5,9};
        System.out.println(t.twoSum(a, 10));
    }
    public List<Integer> twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map= new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        System.out.println(map);
        for(int i=0;i<nums.length;i++){
            int x = target - nums[i];
            if(map.containsKey(x) && map.get(x)!=i) {
                list.add(i);
                list.add(map.get(x));
                return list;
            }
        }
        return null;
    }
    public List<Integer> twoSumPointer(int[] a, int t){
        Arrays.sort(a);
        List<Integer> list1 = new ArrayList<>(2);
        int i=0; int j = a.length-1;
        while(i < j){
            if(a[i] + a[j] == t){
                list1.add(i);
                list1.add(j);
                break;
            }
            else if(a[i] + a[j] < t) {
                i++;
            }
            else {
                j--;
            }
        }
        // System.out.println(list1);
        return list1;
    }
}
