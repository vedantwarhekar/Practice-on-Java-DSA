package HashSet;


import java.util.HashSet;

//Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
//Input 1:
//n = 6
//nums = [100,4,200,1,3,2]
//Output :4
public class PWProblem1 {
    public static int longestSubsequent(int[] nums){
        HashSet<Integer> hs = new HashSet<>();
        int maxStreak = 0;
        for(int num : nums){
          hs.add(num);
        }
        for(int num: hs){
            if(!hs.contains(num-1)){ // if less than its number than current number is starting point
                int currNum = num; // 1
                int currStreak = 1; // length of consecutive
                while (hs.contains(currNum +1)){
                    currNum++;
                    currStreak++;
                }
                maxStreak = Math.max(maxStreak,currStreak);
            }
        }
        return maxStreak;
    }
    public static void main(String[] args) {
     int arr[] = {100,4,200,1,3,2};
     System.out.println(longestSubsequent(arr));
    }
}
