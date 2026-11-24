package Array.SlidingWindow;
/*
1004. Max Consecutive Ones III
Given a binary array nums and an integer k, return
the maximum number of consecutive 1's in the array if you can flip at most k 0's.
Example 1:
Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
* */
public class SlidingWindowQ8 {
    public static int longestOnes1(int[] nums, int k) {
        int left = 0;
        int maxCount = 0;
        int zeroCount = 0;

        for(int right = 0; right < nums.length; right++){

            if(nums[right] == 0){
                zeroCount++;
            }
            while(zeroCount > k){
                if(nums[left] == 0){
                    zeroCount--;
                }
                left++;
            }
            maxCount = Math.max(maxCount, right - left  + 1);
        }
        return maxCount;
    }
    public static void main(String[] args) {
       int res1 = longestOnes1(new int[]{1,1,1,0,0,0,1,1,1,1,0},2);
        System.out.println(res1);
    }
}
