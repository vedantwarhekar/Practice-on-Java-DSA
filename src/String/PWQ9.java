package String;

import java.util.HashMap;

//“Count frequency of characters in a string.”
public class PWQ9 {
    public static void main(String[] args){
        String str = "aaabbckikhllldylsssj";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
         if(map.containsKey(str.charAt(i))){
             map.put(str.charAt(i),map.get(str.charAt(i))+1);
         }else{
             map.put(str.charAt(i),1);
         }
        }

//        for(int i = 0 ; i < str.length(); i++){
//            char ch = str.charAt(i);
//            map.put(str.charAt(i), map.getOrDefault(ch,0)+1);
//        }
        System.out.println(map);
    }
}
