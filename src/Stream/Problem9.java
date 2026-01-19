package Stream;

import java.util.List;

// Remove duplicates using Stream operations
public class Problem9 {
    public static void main(String[] args) {
        List<String> list = List.of("A", "B", "A", "C", "B");
        List<String> result = list.stream().distinct().toList();
        System.out.println(result);
    }
}
