package HashMap;

import java.util.HashMap;
import java.util.Map;

// find the most frequent element in array
public class PWProblem1 {
    public static void main(String[] args) {
        int[] arr = {1,3,1,4,5,6,8,2,8,6,8,9,3,1,4,5,6,8,3,7,8,8};

        Map<Integer,Integer> hashMap = new HashMap<>();

        for(int i = 0; i < arr.length; i++)
        {
            if(!hashMap.containsKey(arr[i]))
            {
                hashMap.put(arr[i],1);
            }else {
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
            }
        }
        System.out.println(hashMap.entrySet());

        int maxfreq = 0, ansKey = -1;
        for(var i : hashMap.entrySet())
        {
            if(i.getValue() > maxfreq)
            {
                maxfreq = i.getValue();
                ansKey = i.getKey();
            }
        }
        System.out.println("The key which has highest frequency is:- "+ansKey);
    }
}
