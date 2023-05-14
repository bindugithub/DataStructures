public class Fibonacci {
    public static void main(String[] args){
        Fibonacci f = new Fibonacci();
        System.out.println("The fibonacci result is:" + f.Fib(1));

    }
    public int Fib(int n){
        int n1, n2, res;
        n1 = 0;
        n2 = 1;
        res = 0;
        if( n <= 1){
            return n;
        }
        while(n>1){
            res = n1 + n2;
            n1 = n2;
            n2 = res;
            n--;
        }
        return res;
    }
}
