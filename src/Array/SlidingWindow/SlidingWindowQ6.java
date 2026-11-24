package Array.SlidingWindow;

/*
*   2461. Maximum Sum of Distinct Subarrays With Length K

You are given an integer array nums and an integer k. Find the maximum subarray
sum of all the subarrays of nums that meet the following conditions:

The length of the subarray is k, and
All the elements of the subarray are distinct.
Return the maximum subarray sum of all the subarrays that meet the conditions.

If no subarray meets the conditions, return 0.

A subarray is a contiguous non-empty sequence of elements within an array.
* */

import java.util.HashMap;

public class SlidingWindowQ6 {

    public static long  maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0;
        long windowSum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            windowSum+= nums[i];
            if(i >= k){
                windowSum -= nums[i-k];
                map.put(nums[i-k],map.get(nums[i-k])-1);
                if(map.get(nums[i-k]) == 0){
                    map.remove(nums[i-k]);
                }
            }
            if(i >=k-1 && map.size() == k){
                maxSum= Math.max(maxSum,windowSum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,4,2,9,9,9};
        long re = maximumSubarraySum(arr,3);
        System.out.println(re);
    }
}
