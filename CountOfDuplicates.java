import java.util.HashMap;

public class CountOfDuplicates {
    public static void main(String[] args){
        CountOfDuplicates c = new CountOfDuplicates();
        System.out.println(c.duplicateCount(new int[]{3,3,3,3,3,1,2,4}));

    }
    public int duplicateCount(int[] a){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<a.length; i++){
              map.put(a[i], map.getOrDefault(a[i], 0)+1);
            }
            /*    map.put(a[i], map.get(a[i])+1);
            }
            else{
                map.put(a[i], 1);
            }*/

        System.out.println(map);
        for(int i: map.keySet()){
            if(map.get(i) >1)
                return map.get(i);
        }
        return -1;
    }
}
