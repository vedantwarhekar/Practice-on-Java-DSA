package HashMap;
//Question (Isomorphic Strings):
//Given two strings s and t, determine whether they are isomorphic. Two strings are isomorphic if the characters
// in s can be replaced to get t, with a one-to-one mapping (no two characters map to the same character).
//
//Example:
//
//Input: s = "egg", t = "add"
//
//Output: true
//
//Explanation: e → a, g → d (consistent mapping)

import java.util.HashMap;

public class PWProblem3 {

    static boolean isIsomorphic(String s, String t){
        HashMap<Character,Character> hs = new HashMap<>();
        for(int i =0; i < s.length(); i++){
            char sCharAt = s.charAt(i);
            char tChatAt = t.charAt(i);
            if(hs.containsKey(sCharAt))
            {
                if(hs.get(sCharAt) != tChatAt) return false;
            }else if(hs.containsValue(tChatAt)){
                return false;
            }else {
                hs.put(sCharAt,tChatAt);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "egg";
        String t1 = "add";

        String s2 = "foo";
        String t2 = "bar";

        System.out.println("Is \"" + s1 + "\" and \"" + t1 + "\" isomorphic? "
                + isIsomorphic(s1, t1));  // true

        System.out.println("Is \"" + s2 + "\" and \"" + t2 + "\" isomorphic? "
                + isIsomorphic(s2, t2));  // false
    }

}
