package String;

import java.util.HashMap;

//Count Occurrences of Anagrams
//Count number of anagram substrings of pat in txt
//Key idea
//Sliding window + frequency map
public class SlidingWindowQ1 {
    public static void main(String[] args) {
        String txt = "forxxorfxdofr";
        String pat = "for";

        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : pat.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int count = map.size();
        int start = 0, end = 0;
        int k = pat.length(), ans = 0;

        while (end < txt.length()){
            char ch = txt.charAt(end);

            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
                if(map.get(ch) == 0){
                    count--;
                }
            }

            if(end-start+1 < k){
                end++;
            }else if(end - start + 1 == k){
                if(count == 0){
                    ans++;
                }

                char left = txt.charAt(start);
                if(map.containsKey(left)){
                 map.put(left,map.get(left)+1);
                 if(map.get(left) == 1){
                     count++;
                 }
                }

                start++;
                end++;
            }
        }

        System.out.println("Answer:- "+ans);
    }
}
