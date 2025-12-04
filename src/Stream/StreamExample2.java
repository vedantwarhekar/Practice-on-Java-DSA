package Stream;

import java.util.List;
import java.util.stream.Stream;

public class StreamExample2 {
    public static void main(String[] args) {
        List<Integer> collect = Stream.iterate(0, x -> x + 1)
                .limit(101)
                .skip(1)
                .filter(x -> x % 2 == 0)
                .map(x -> x/10)
                .distinct()
                .sorted()
                .peek(x -> System.out.println(x))
                .max((a, b)->(b - a))
                .stream().toList();
        System.out.println("Collect"+ collect);
    }
}
