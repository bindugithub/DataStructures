public class ReverseElementsOfAnArray {
    public static void main(String[] args){
        ReverseElementsOfAnArray rv = new ReverseElementsOfAnArray();
         rv.reverseElements(new int[]{1,2,3,4,5});

    }
    public void reverseElements(int[] a) {
        int n = a.length/2;
        for(int i=0; i<n; i++) {
            int temp = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = temp;
          //  swap(a, i, a.length-i-1);
        }
        for(int i:a){
            System.out.println(i);
        }
        
    }

    public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
