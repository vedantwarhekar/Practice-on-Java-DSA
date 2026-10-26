package Array.TwoPointer;

//283. Move Zeroes
//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//Note that you must do this in-place without making a copy of the array.

//Example 1:
//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]

//Example 2:
//Input: nums = [0]
//Output: [0]

public class Problem2 extends EasyProblem2 {

    public static void moveZeroes(int[] nums) {
        int j = 0;
        for(int i =0; i < nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {7,1,0,3,12};
        moveZeroes(arr);
        Problem2 pm2 = new Problem2();
        pm2.printArray(arr);
    }
}
