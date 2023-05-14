import java.util.Iterator;
import java.util.List;

public class EvenFilterIterator implements Iterator<Integer> {
    List<Integer> list ;
    Iterator<Integer> itr;
    int nextNumber = -1;
    public EvenFilterIterator(List<Integer> list) {
     this.list = list;
     itr = this.list.iterator();
    }

    @Override
    public boolean hasNext() {
        while(itr.hasNext()) {
            int number = itr.next();

            if (number % 2 ==0) {
                this.nextNumber = number;
                return true;
            }
        }
        return false;
    }

    @Override
    public Integer next() {
        return this.nextNumber;
    }
}
