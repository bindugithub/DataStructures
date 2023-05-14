public class SumOfArray {
    public static void main(String[] args){
        SumOfArray s = new SumOfArray();
        System.out.println("The sum of elements in an array:" +s.ArraySum(new int[]{5,5,5,5,5}));

    }
    public int ArraySum(int a[]){
      int sum = 0;
      for (int i:a){
          sum = sum + i;
      }
      return sum;
    }
}
