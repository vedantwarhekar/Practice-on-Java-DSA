package Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practice {
    public static void main(String[] args) {
        String str = "Vedant";
        String reverse = Arrays.stream(str.split("")).reduce(
                (a,b) -> a+b
        ).toString();
        System.out.println(reverse);
    }
}
