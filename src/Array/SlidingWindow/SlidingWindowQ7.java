package Array.SlidingWindow;
// 485. Max Consecutive Ones
// Example 1
// Input: nums = [1,1,0,1,1,1]
// Output: 3
// Explanation: The first two digits or the last three digits are consecutive 1s.
// The maximum number of consecutive 1s is 3.
public class SlidingWindowQ7 {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, count =0;
        for(int i =0; i < nums.length; i++){

            if(nums[i] == 1){
                count+=1;

            }
            max = Math.max(max,count);
            if(nums[i] != 1){
                count = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
       int res = findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1});
        System.out.println(res) ;
    }
}
