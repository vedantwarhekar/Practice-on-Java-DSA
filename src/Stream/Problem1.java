package Stream;

import java.util.Arrays;
import java.util.stream.Collectors;

// reverse the string
public class Problem1 {
    public static void main(String[] args) {
        String str = "This is Java Programming";
        String reverse = Arrays.stream(str.split(" "))
                .map(w -> new StringBuilder(w).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println(reverse);
    }
}
