package CollectionProblem;

import java.util.HashMap;
import java.util.Map;

//Find Duplicate Elements in Array
//
//Input: {1,2,3,2,4,5,1}
//Output: 1,2
public class MapQ4 {
    public static void main(String[] args){
       int[] arr = {1,2,3,2,4,5,1};
       Map<Integer,Integer> map = new HashMap<>();
       for(int i =0; i< arr.length;i++){
           map.put(arr[i],map.getOrDefault(arr[i],0)+1);
       }
       for(int i : map.keySet()){
           if(map.get(i) > 1){
               System.out.print(i+" ");
           }
       }
        System.out.println();
    }
}
