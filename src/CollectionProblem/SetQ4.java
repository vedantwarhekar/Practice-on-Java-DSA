package CollectionProblem;

import java.util.*;

//
//First Duplicate Element
//Input: {2, 1, 3, 5, 3, 2}
//Output: 3
public class SetQ4 {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(2, 1, 3, 5, 3, 2);
        Set<Integer> seen = new HashSet<>();
        for(int i: al){
            if(!seen.add(i)){
                System.out.println(i);
                return;
            }
        }
    }
}
