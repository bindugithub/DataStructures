public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args){
        RemoveDuplicatesFromSortedArray rs = new RemoveDuplicatesFromSortedArray();
        System.out.println(rs.removeDuplicates(new int[]{0,0,1,1,2}));

    }
    public int removeDuplicates(int[] numbs) {
        if(numbs.length == 0 )
            return 0;
        int i =0;
        for(int j=1; j<numbs.length; j++){
            if(numbs[j] != numbs[i]){
                i++;
                numbs[i] = numbs[j];
            }
        }
        return i+1;

    }
}
