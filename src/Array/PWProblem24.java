package Array;

//2.3 Max Consecutive Ones II
//📝 Problem Statement
//You are given a binary array nums (containing only 0s and 1s).
//You are allowed to flip at most one 0 to 1.
//Input:  nums = [1,0,1,1,0] -> [1,1,1,1,0]
//Flip first 0 -> 1
//Output: 4
public class PWProblem24 {
    public static void main(String[] args){
        int[] arr = {1,0,1,1,0};
        int left = 0;
        int maxCount = 0;
        int zeroCount = 0;

        for(int right =0; right < arr.length; right++){
            if(arr[right] == 0){
                zeroCount ++;
            }

            while (zeroCount > 1){
                if(arr[left] == 0){
                    zeroCount--;
                }
                left++;
            }

            maxCount = Math.max(maxCount,right - left +1);
        }
        System.out.println(maxCount);
    }
}
