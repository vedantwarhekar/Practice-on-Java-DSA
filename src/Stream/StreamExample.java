package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,5,2,4,6,89,4,2,56);
        List<Integer> filteredList = list.stream()
                .filter(x -> x % 2 == 0)
                .toList();
        System.out.println("filter list :- "+filteredList);


        List<Integer> mappedList = filteredList.stream()
                .map(x -> x / 2)
                .toList();
        System.out.println("mappedList "+mappedList);

        // map and filter together
        List<Integer> mapAndFilter = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x / 2)
                .distinct()
                .sorted((a, b) -> (b - a))
                .limit(3)
                .skip(1)
                .toList();
        System.out.println("map and filter "+mapAndFilter);

    }
}
