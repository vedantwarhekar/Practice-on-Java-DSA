package CollectionProblem;

import java.util.*;

public class Practice {
    public static void main(String[] args){
        List<Integer> list = List.of(1,20,3,4,5,6,70,8,90,10);
        int ele = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow();
        System.out.println(ele);
    }
}
