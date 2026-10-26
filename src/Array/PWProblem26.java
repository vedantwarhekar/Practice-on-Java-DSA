package Array;
/*
Problem Sort the Colors

Example 1:
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Explanation:
The array has two 0s, two 1s, and two 2s. Sorting them in-place places all 0s
first, then all 1s, then all 2s.

Example 2:
Input: nums = [2,0,1]
Output: [0,1,2]

*/


// For Two pointer approach refer question TwoPointer.Problem5
public class PWProblem26 {
    public static void sortColors(int[] nums) {
        int count0 = 0, count1=0, count2=0;
        for(int i =0; i < nums.length; i++){
            if(nums[i] == 0){
                count0++;
            }else if( nums[i] == 1){
                count1++;
            }else{
                count2++;
            }
        }
        for(int j = 0; j < nums.length; j++){
            if(count0 > 0){
                nums[j] = 0;
                count0--;
            }else if (count1 > 0){
                nums[j] = 1;
                count1--;
            }else if(count2 > 0){
                nums[j] = 2;
            }
        }

    }

    public static void main(String[] args) {
       int[] nums = {2,0,2,1,1,0};
       sortColors(nums);
       for(int i : nums){
           System.out.print(i +" ");
       }
        System.out.println();
    }
}
