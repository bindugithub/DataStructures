public class PalindromeNumber {
    public static void main(String[] args) {
         PalindromeNumber p = new PalindromeNumber();
         System.out.println( p.isPalindrome(-121));
    }

    public boolean isPalindrome(int n) {
        int temp = n;
        int r = 0;
        while (temp > 0) {
            System.out.println(">>>> temp="+temp + " r="+ r);
            r = r*10 + temp%10;
            temp = temp/10;
            System.out.println("<<<<<< temp="+temp + " r="+ r);
        }
        if (r == n) {
            return true;
        }
        return false;
    }
}
