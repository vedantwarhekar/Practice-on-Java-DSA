package CollectionProblem;
//
//Given a List<Integer>, remove duplicates but preserve insertion order.
//

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class ListQ1 {
     public static void main(String[] args){
         List<Integer> list = Arrays.asList(1,2,3,4,2,1,211,2,1,1,1,1,2,22,3,2,22,2,2,2,2);
        List<Integer> result = new ArrayList<>(new LinkedHashSet<>(list));
         System.out.println(result);
    }
}
