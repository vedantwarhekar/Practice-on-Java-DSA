package Stream;

import java.util.List;

//Use peek() to debug intermediate stages in a Stream
public class Problem10 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        list.stream()
                .peek(n -> System.out.println("Before Filter: "+n))
                .filter(n -> n % 2 == 0)
                .peek(n -> System.out.println("After Filter: "+n))
                .map(n -> n*10)
                .peek(n -> System.out.println("After Map: "+n))
                .toList();

    }
}
