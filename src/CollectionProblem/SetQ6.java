package CollectionProblem;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

// Question 6: Sort Elements Using TreeSet
public class SetQ6 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,1,7,3);
        TreeSet<Integer> set = new TreeSet<>(list);
        System.out.println(set);
    }
}
