import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main (String[] args){

        FizzBuzz f = new FizzBuzz();
        System.out.println(f.FiBu(15));
    }
    public List FiBu(int n){
        List<String> list = new ArrayList<String>();
        for(int i = 1; i<=n ; i ++){
            if(i%3 == 0 && i%5 == 0){
               list.add("FizzBuzz");
            }
            else if(i%3 == 0){
                list.add("Fizz");
            }
            else if(i%5 == 0){
               list.add("Buzz");
            }
            else{
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
}
