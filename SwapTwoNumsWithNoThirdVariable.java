public class SwapTwoNumsWithNoThirdVariable {
    public static void main(String[] args){
        SwapTwoNumsWithNoThirdVariable s = new SwapTwoNumsWithNoThirdVariable();
        s.swapNums(5,9);


    }
    public void swapNums(int a, int b){
        System.out.println("Numbers Before Swapping: " +a+ " and " +b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Numbers After Swapping: " +a+ " and " +b);
    }
}

