package HashMap;

import java.util.LinkedHashMap;
import java.util.Map;

//Problem — First Non-Repeating Character
//Given a string, find the first non-repeating character and return its index.
//If none exists → return -1.
public class PWProblem0 {
    public static void main(String[] args){
        String str =  "aabbcdeff";
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(int i =0; i < str.length();i++){
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i),0)+1);
        }
        int index = -1;
        for(int i = 0; i < str.length(); i++){
            if(map.get(str.charAt(i)) == 1){
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
