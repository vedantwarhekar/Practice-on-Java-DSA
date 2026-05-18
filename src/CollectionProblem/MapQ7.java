package CollectionProblem;

import java.util.HashMap;
import java.util.Map;

//Check if Two Strings Are Anagrams
//Input: "listen", "silent"
//Output: true
public class MapQ7 {
    public static void main(String[] args) {

        String str_first = "listen";
        String str_two = "silent";

        if(str_first.length() != str_two.length()){
            System.out.println("Not Anagram");
        }

        Map<Character,Integer> map = new HashMap<>();

        for(char c : str_first.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(char c : str_two.toCharArray()){
            if(!map.containsKey(c)){
                System.out.println("Not Anagram");
            }
            map.put(c,map.getOrDefault(c,0)-1);
            if(map.get(c) == 0){
             map.remove(c);
            }
        }

        if(map.isEmpty()){
            System.out.println("Anagram");
        }else {
            System.out.println("Not Anagram");
        }
    }
}
