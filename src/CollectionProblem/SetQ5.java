package CollectionProblem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// 5: Difference Between Two Sets
public class SetQ5 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5));

        set1.removeAll(set2);

        System.out.println(set1);
    }
}
