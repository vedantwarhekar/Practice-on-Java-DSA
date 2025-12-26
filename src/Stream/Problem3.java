package Stream;

import java.util.Arrays;

//16. Fetch only the second odd number using Streams.
public class Problem3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int odd = Arrays.stream(arr).filter(x -> x % 2 != 0)
                .skip(1)
                .findFirst().orElse(-1);
        System.out.println(odd);
    }
}
