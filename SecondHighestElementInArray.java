import java.util.Arrays;

public class SecondHighestElementInArray {
    public static void main(String[] args){
        SecondHighestElementInArray se = new SecondHighestElementInArray();
        System.out.println(se.elementInArray(new int[] {5,1,2,7,9,4,10}));

    }

    public int elementInArray(int[] a){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i=0; i<a.length; i++){
            if (a[i] > first){
                second = first;
                first = a[i];
            }
            else if(a[i] > second){
                second = a[i];
            }
        }
        return second;
    }
}
