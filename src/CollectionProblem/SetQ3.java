package CollectionProblem;

import java.util.Arrays;
import java.util.HashSet;

// Question 2: Find Common Elements Between Two Arrays
// Input:
// arr1 = {1,2,3,4,5}
// arr2 = {3,4,5,6,7}
// Output:3,4,5
public class SetQ3 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4,5));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5,6,7));
//      retainAll() is a method from the Collection interface that
//      is used to keep only the common elements between two collections.
        set.retainAll(set2);
        System.out.println(set);
    }
}
