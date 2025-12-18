package HashMap;
// Check whether two Strings are anagram of each other. Return true if they are else return false.
// An anagram of a string is another string that contains the same characters, only the order of
// characters can be different. For example, “abcd” and “dabc” are an anagram of each other.
//Example 1:
//
//Input: s = "anagram", t = "nagaram"
//
//Output: true
//
//Example 2:
//
//Input: s = "rat", t = "car"
//
//Output: false

import java.util.HashMap;

public class PWProblem2 {

    static HashMap<Character,Integer> makeHashMap(String s){
        HashMap<Character,Integer> hs = new HashMap<>();
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(hs.containsKey(ch))
            {
                int currFreq = hs.get(ch);
                hs.put(ch,currFreq +1);
            }else {
                hs.put(ch,1);
            }
        }
        return hs;
    }

    public static boolean isAnagram(String s, String t)
    {
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer> hs = makeHashMap(s);
        HashMap<Character,Integer> hsm = makeHashMap(t);
        return hs.equals(hsm);
    }

    public static boolean isAnagram2(String s, String t){
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer> hs = makeHashMap(s);
        for (int i =0; i < t.length(); i++)
        {
            char ch = t.charAt(i);
            if(!hs.containsKey(ch)) return false;
            int currFreq = hs.get(ch);
            hs.put(ch,currFreq-1);
        }
        for(Integer i : hs.values())
        {
            if(i != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("vedant","tnadev"));
        System.out.println(isAnagram("vedant","tanadev"));
        System.out.println(isAnagram("vedant","tanadeV"));
        System.out.println("========================================");
        System.out.println(isAnagram2("vedant","tnadev"));
        System.out.println(isAnagram2("vedant","tanadev"));
        System.out.println(isAnagram2("vedant","tanadeV"));
    }
}
