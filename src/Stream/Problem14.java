package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// find the missing element from the array
public class Problem14 {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,5,8};

        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();

        Set<Integer> collect = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toSet());

        List<Integer> list = IntStream.range(min,max)
                .boxed()
                .filter(x -> !collect.contains(x))
                .toList();

        System.out.println(list);
    }
}
