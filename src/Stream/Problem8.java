package Stream;

import java.util.List;

// Remove nulls & empty strings from a list
public class Problem8 {
    public static void main(String[] args)  {
        List<String> list = List.of("Vedant","swami","","Gajanan","madhav");

        List<String> result =list.stream()
                .filter(ele-> ele != null && !ele.isEmpty())
                .toList();

        System.out.println(result);
    }
}
