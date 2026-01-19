package Stream;

import java.util.List;

// Flatten a List<List> using flatMap()
public class Problem5 {
    public static void main(String[] args) {
        List<List<String>> list = List.of(
          List.of("A","B","c"),
          List.of("D","E"),
          List.of("F")
        );

        List<String> result = list.stream()
                .flatMap(inner -> inner.stream())
                .toList();

        System.out.println(result);
    }
}
