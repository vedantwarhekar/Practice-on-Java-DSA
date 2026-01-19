package Stream;

import java.util.Arrays;
import java.util.stream.Stream;

// Reverse a string using stream api
public class Problem13 {
    public static void main(String[] args) {
        String str = "Vedant";
        String reverse = Arrays.stream(str.split(""))
                .reduce("",(a,b)->b+a);
        System.out.println("Reverse:- " + reverse);

       String reverse2 = Stream.of(str.split(""))
               .reduce("",(a,b)->b+a);
        System.out.println("Reverse 2:- "+reverse2);
    }
}
