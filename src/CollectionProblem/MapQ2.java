package CollectionProblem;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//Problem:
//Given a string, find the first non-repeating character.
//
//Input: "swiss"
//Output: w
public class MapQ2 {
    public static void main(String[] args) {
      String str = "swiss";
      Map<Character,Integer> map = new LinkedHashMap<>();
      for(char ch : str.toCharArray()){
         map.put(ch,map.getOrDefault(ch,0)+1);
      }
      for(char ch : map.keySet()){
          if(map.get(ch) == 1){
              System.out.println(ch);
              return;
          }
      }
      System.out.println("-1");
    }
}
