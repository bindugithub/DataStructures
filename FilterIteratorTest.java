import java.util.Arrays;
import java.util.List;

public class FilterIteratorTest {

    public static void main(String[]  args) {
        List<Integer> list = Arrays.asList(1,2,3,4,6);
        EvenFilterIterator numbers = new EvenFilterIterator(list);
        while(numbers.hasNext()) {
            System.out.println(numbers.next());
        }
    }
}
