package Stream;


import java.util.Arrays;

// From an array, fetch the first 3 odd numbers using Streams.
public class Problem2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] odd = Arrays.stream(arr).filter(x -> x % 2 != 0).
                limit(3).toArray();
        for(int i : odd)
            System.out.print(i+" ");
        System.out.println();
    }
}
