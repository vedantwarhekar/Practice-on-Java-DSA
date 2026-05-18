package CollectionProblem;

import java.util.List;
//Question
//From a list of integers, return numbers greater than 10.
public class ListQ5 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,20,3,4,5,6,70,8,90,10);
        List<Integer> list2 = list.stream().filter(x-> x > 10).toList();
        System.out.println(list2);
    }
}
