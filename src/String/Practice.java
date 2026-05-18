/*
find
 */

package String;

import java.util.HashMap;
import java.util.LinkedHashMap;

class Practice
{
    static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length())return false;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < str1.length(); i++){
            map.put(str1.charAt(i),map.getOrDefault(str1.charAt(i),0)+1);
        }
        for(int j = 0; j < str2.length(); j++){
            char ch = str2.charAt(j);
            if(!map.containsKey(ch)) return false;
            map.put(ch,map.get(ch)-1);
            if(map.get(ch) == 0) map.remove(ch);
        }
        return map.isEmpty();
    }
    public static void main(String[] args)
    {
        String str = "ssbassbjkb";
        String unique = "";
        for(int i =0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(unique.indexOf(ch) == -1){
                unique+=ch;
            }
        }
        System.out.println(unique);
    }
}
