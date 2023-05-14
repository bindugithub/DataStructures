import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumNoofMoves {

    public static void main(String[] args){
        List<Integer> list = Arrays.asList(4,7,2,3,9);
        System.out.println(MinimumNoofMoves.minimumMoves(list));
    }
    public static int minimumMoves(List<Integer> arr){
            List<Integer> sortedList =  new ArrayList<>();
            sortedList.addAll(arr);
            Collections.sort(sortedList);
            int j= 0;
            int ans =  sortedList.size();
            for(int i : arr){
                if( i == sortedList.get(j)){
                    j++;
                    ans--;
                }
            }
            return ans;

        }

    }
