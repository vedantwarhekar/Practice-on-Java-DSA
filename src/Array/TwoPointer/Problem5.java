package Array.TwoPointer;

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
public class Problem5 {
    static void sortArray(int[] arr)
    {
        int n = arr.length-1;
        int low = 0;
        int mid = 0;
        int high = n-1;

        while(mid <= high){
            if(arr[mid] == 0){
                arr[mid] = arr[low];
                arr[low] = 0;
                mid++;
                low++;
            }else if(arr[mid] == 1){
                mid++;
            }
            else {
                arr[mid] = arr[high];
                arr[high] = 2;
                high--;
            }
        }

    }
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortArray(arr);
        EasyProblem2.printArray(arr);
    }
}
