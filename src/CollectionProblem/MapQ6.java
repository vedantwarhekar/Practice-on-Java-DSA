package CollectionProblem;

//Problem
//
//You have two maps.
//If a key exists in both → add the values
//If key exists in only one → keep it.
//
//Input:
//Map1 = {A=10, B=20, C=30}
//Map2 = {B=5, C=15, D=40}
//
//Output:
//{A=10, B=25, C=45, D=40}

import java.util.HashMap;
import java.util.Map;

public class MapQ6 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 10);
        map1.put("B", 20);
        map1.put("C", 30);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 5);
        map2.put("C", 15);
        map2.put("D", 40);

        map2.forEach((key,value)->{
            map1.merge(key,value,Integer::sum);
        });

        System.out.println(map1);
    }
}
