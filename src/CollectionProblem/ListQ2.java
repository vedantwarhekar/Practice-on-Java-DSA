package CollectionProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

// remove duplicate from list and arrange it in sorted order
public class ListQ2 {
   public static void main(String[] args){
       List<Integer> list = Arrays.asList(1,2,3,4,2,1,211,2,1,1,1,1,2,22,3,2,22,2,2,2,2);
       List<Integer> result = new ArrayList<>(new TreeSet<>(list));
       System.out.println(result);
   }
}
