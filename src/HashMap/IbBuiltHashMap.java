package HashMap;

import java.util.HashMap;
import java.util.Map;

public class IbBuiltHashMap {

    static void hashMap(){
        //Syntax
        Map<String,Integer> hashMap = new HashMap<>();
        //Adding Element
        hashMap.put("vedant",22);
        hashMap.put("Krishna",39);
        hashMap.put("swami",26);
        hashMap.put("gajanan",33);

        // getting values from hashmap
        System.out.println(hashMap.get("swami")); // 26
        System.out.println(hashMap.get("madhusudan")); // it returns null because it not exists

        //changing/ updating value of the hashmap
        hashMap.put("vedant",16); // 16
        System.out.println(hashMap.get("vedant")); // 16

        //Removing the pair from the hashmap
        System.out.println(hashMap.remove("vedant")); // 16
        System.out.println(hashMap.remove("tanadev")); // null

        // check if the key exist in the hash map
        System.out.println(hashMap.containsKey("vedant")); //false
        System.out.println(hashMap.containsKey("swami")); // true

        // adding a new key only if the key not exists
        hashMap.putIfAbsent("tnadev",33); // will enter
        hashMap.putIfAbsent("swami",108); // will not enter

        // get all ket of the hashmap
        System.out.println(hashMap.keySet());

        // get all values from the hash map
        System.out.println(hashMap.values());

        // get all entries from the hashmap
        System.out.println(hashMap.entrySet());

        System.out.println();
       // Traversing all the entries from the hashmap
        for(String key : hashMap.keySet()){
            System.out.printf("Age of %s is %d\n",key,hashMap.get(key));
        }
        System.out.println();
        for(Map.Entry<String,Integer> e : hashMap.entrySet())
        {
            System.out.printf("Age of %s is %d\n", e.getKey(),e.getValue());
        }
        System.out.println();
        for(var e : hashMap.entrySet())
        {
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }
    }
    public static void main(String[] args) {
        hashMap();
    }
}
