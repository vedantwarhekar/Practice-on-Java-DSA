package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Practice {
    public static void main(String[] args) {
        List<Integer> collect = Stream.iterate(0, n -> n +2)
                .limit(101)
                .skip(1)
                .filter(x -> x % 2 == 0)
                .map(x -> x/2)
                .distinct()
                .sorted()
                .peek(x -> System.out.println(x))
                .max((a,b)->(b - a))
                .stream().toList();
        System.out.println(collect);
    }
}
