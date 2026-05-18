package CollectionProblem;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

//Problem:
//Remove duplicates from a list while maintaining insertion order.
public class SetQ2 {
    public static void main(String[] args) {
        List<Integer> list = List.of(3, 5, 3, 2, 8, 5, 1);
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()){
            lhs.add(itr.next());
        }
        System.out.println(lhs);
    }
}
