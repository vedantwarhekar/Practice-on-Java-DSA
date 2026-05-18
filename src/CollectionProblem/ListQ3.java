package CollectionProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Problem 2: Find second highest element
public class ListQ3 {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,9,4,5,67,83,2,3,5);
//        List<Integer> result = list.stream().sorted().toList();
//        System.out.println(result);
//        System.out.println(result.get(result.size()-2));

        int secondHighest = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow();
        System.out.println(secondHighest);

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MAX_VALUE;
        for(int i : list){
            if(i > max){
                secondMax = max;
                max = i;
            }else if( i < max && secondMax < i){
                secondMax = i;
            }
        }
        System.out.println(secondMax);
    }
}
