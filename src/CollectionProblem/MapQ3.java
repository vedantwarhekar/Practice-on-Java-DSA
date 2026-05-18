package CollectionProblem;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

// count Character  in each word
//Input:
//        "java calypso java trade calypso risk"
//Output:
//java=4, calypso=7, trade=5, risk=4
public class MapQ3 {
    public static void main(String[] args){
        String str = "java calypso java trade calypso risk";
        String[] arr = str.split(" ");
        Map<String,Integer> map = new LinkedHashMap<>();
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i],arr[i].length());
        }
        System.out.println(map);
    }
}
