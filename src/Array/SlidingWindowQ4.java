package Array;

// Given an array, find the maximum sum of any contiguous subarray of size k.
// Example
// Input: [2,1,5,1,3,2], k=3
// Output: 9 → [5,1,3]
public class SlidingWindowQ4 {
    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        int k = 3, maximum =0, windowSum =0;
        for(int i =0; i < arr.length; i++){
            windowSum += arr[i];
            if(i >= k-1){
                maximum = Math.max(maximum,windowSum);
                windowSum-= arr[i-(k-1)];
            }
        }
        System.out.println("Maximum:- "+maximum);
    }
}
