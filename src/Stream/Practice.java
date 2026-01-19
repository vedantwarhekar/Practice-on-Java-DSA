package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] odd = Arrays.stream(arr)
                .filter(n -> n%2 != 0)
                .limit(3).toArray();
        for(int i : odd){
            System.out.println(i);
        }
    }
}
