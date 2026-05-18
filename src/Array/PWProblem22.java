package Array;

import java.util.HashMap;
import java.util.Map;

// Two sum problem when array is not sorted we can not use two pointer approach
public class PWProblem22 {
    public static void main(String[] args) {
        int[] arr = {6,4,2,4,6,8,1,3,5,2};
        int target = 9;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            int key = target - arr[i];
            if(map.containsKey(key)){
                System.out.println("value found at index:- "+map.get(key)+" "+i);
                break;
            }
            map.put(arr[i],i);
        }
    }
}
