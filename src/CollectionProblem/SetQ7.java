package CollectionProblem;

import java.util.HashSet;

// Problem — Longest Substring Without Repeating Characters
//Input: "abcabcbb"
//Output: 3 → "abc"
public class SetQ7 {
   public static void main(String[] args){
     String str = "abcabcbb";
     HashSet<Character> set = new HashSet<>();
     int maxLength = 0;
     int left = 0;
     for(int right = 0; right < str.length(); right++){
         if(set.contains(str.charAt(right))){
             set.remove(str.charAt(left));
             left++;
         }
         set.add(str.charAt(right));
         maxLength = Math.max(maxLength,right-left+1);
     }
       System.out.println(maxLength);
   }
}
