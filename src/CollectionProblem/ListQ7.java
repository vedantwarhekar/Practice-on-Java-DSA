package CollectionProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//Problem 6: Remove all even numbers from a List<Integer> without exception.
public class ListQ7 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(
                Arrays.asList(1, 20, 3, 4, 5, 6, 70, 8, 90, 10)
        );
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()){
         Integer value = itr.next();
         if(value % 2 == 0){
             itr.remove();
         }
        }
        System.out.println(list);
    }
}
