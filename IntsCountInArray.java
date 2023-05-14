import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntsCountInArray {
    public static void main(String[] args){
        IntsCountInArray ar = new IntsCountInArray();
        System.out.println(ar.intCount(new int[]{2,2,2,3,6,6,8}, new int[]{3,2,5,6}));

    }
    public List<Integer> intCount(int[] a, int[] inp) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<a.length; i++){
            if(map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);
            }
            else{
                map.put(a[i],1);
            }
            //map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
        System.out.println(map);

        for( int z =0; z<inp.length; z++){
            if(map.containsKey(inp[z])) {
                list.add(map.get(inp[z]));
            }
            else{
                list.add(0);
            }
        }
        return list;
    }
}
