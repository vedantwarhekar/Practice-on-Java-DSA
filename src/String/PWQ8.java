package String;

import java.util.LinkedHashMap;

// First non-repeated character in a string
public class PWQ8 {
//    public static void main(String[] args) {
//        String str = "ssbabssdjkb";
//        for(int i =0; i < str.length();i++){
//            if(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))){
//                System.out.println("The char found: - "+str.charAt(i)+" ");
//            }
//        }
//    }
      public static void main(String[] args) {
       String str = "ssbassbjkb";
       LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
       for(int i = 0; i < str.length(); i++){
           char ch = str.charAt(i);
           map.put(ch,map.getOrDefault(ch,0)+1);
       }

       for(char ch : map.keySet()){
           if(map.get(ch) == 1){
               System.out.println("First non-repeating character: " + ch);
               break;
           }
       }
      }
}
