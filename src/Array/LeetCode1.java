package Array;

//4. Median of Two Sorted Arrays
//Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the
// two sorted arrays.

//The overall run time complexity should be O(log (m+n)).
//Example 1:
//Input: nums1 = [1,3], nums2 = [2]
//Output: 2.00000
//Explanation: merged array = [1,2,3] and median is 2.

public class LeetCode1 {
  public static void main(String[] args){
     int[] arr1 = {1,3};
     int[] arr2 = {2};
     int[] merged = new int[arr2.length+arr1.length];

     System.arraycopy(arr1,0,merged,0,arr1.length);
     System.arraycopy(arr2,0,merged,0,arr2.length);

     int total = arr1.length + arr2.length;
     if(total % 2 == 1){
         System.out.println(total/2);
         System.out.println(merged[total/2]);
     }else {
         System.out.println(total/2-1);
         System.out.println(merged[total/2-1]);
     }
  }
}
