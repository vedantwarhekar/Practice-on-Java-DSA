package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Intialization {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Mohan");
        list.add("Keshav");
        list.add("Ragav");
        Stream<String> streamOfList = list.stream();

        String[] arr = {"Apple","Mango","pineapple","water"};
        Stream<String> streamOfArray = Arrays.stream(arr);

        Stream<Integer> limit = Stream.iterate(0,n -> n + 2).limit(100);
        System.out.println(limit.toList());

        Stream<String> generate = Stream.generate(() -> "hello").limit(5);
        System.out.println(generate.toList());
    }
}
