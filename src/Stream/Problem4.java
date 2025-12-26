package Stream;

import java.util.Arrays;
import java.util.Comparator;

//Find the second-highest number in a list
public class Problem4 {
    public static void main(String[] args) {
        int[] arr = {6,2,3,4,2,6,74,21,12,3};

        System.out.println(Arrays.stream(arr).distinct().boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1).findFirst().orElseThrow());
    }
}
