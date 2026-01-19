package Stream;

import java.util.Arrays;
import java.util.stream.IntStream;

// given two array we your task is to merge it and after merging there should be only
// distinct element
public class Problem12 {
    public static void main(String[] args) {
        int[] arr = {2,4,5,2,6};
        int[] arr2 = {9,3,4,6,5};

        int[] result = IntStream.concat(Arrays.stream(arr), Arrays.stream(arr2)).distinct()
                .toArray();

        for(int i : result){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
