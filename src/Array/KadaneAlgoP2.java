////package Array;
////
///// /Given an integer array nums, find the contiguous subarray (containing at least one number)
///// /which has the largest sum, and return that subarray.
///// /If there are multiple subarrays with the same maximum sum, return any one of them.
///// /Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
///// /Output: [4,-1,2,1]
///// /
///// /Explanation:
///// /The subarray [4,-1,2,1] has the largest sum = 6.
//public class KadaneAlgoP2 {
//    static int[] maximumSubarray(int[] arr){
//        int currSum = 0; int start = 0; int end = 0; int maxSum = 0;
//        for(int i =0; i < arr.length;i++){
//            currSum+=arr[i];
//            if(maxSum > currSum){
//                maxSum = currSum;
//                end = i;
//            }
//            if(currSum < 0){
//                currSum =0;
//                start = i+1;
//            }
//        }
//    }
//    public static void main(String[] args) {
//        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
//        int[] result = maximumSubarray(arr);
//    }
//}
