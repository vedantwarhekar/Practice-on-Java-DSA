package Stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Partition a list into even/odd groups using partitioningBy()
// partitioningBy only  map into two group true/ false only two
public class Problem11 {
    public static void main(String[] args)
    {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        Map<Boolean,List<Integer>> reult = numbers.stream()
                .collect(Collectors.partitioningBy(
                        n-> n % 2 == 0
                ));
        System.out.println(reult);
    }
}
