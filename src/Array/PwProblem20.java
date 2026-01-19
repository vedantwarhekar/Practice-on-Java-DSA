package Array;

//Question: Calculate the Pivot Index of an Array
//
//Pivot Index is the index where the sum of
//elements on the left is equal to the sum of elements on the right.
//Input:  [1, 7, 3, 6, 5, 6]
//Output: 3
public class PwProblem20 {
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6};

        int totalSum = 0;
        int leftSum = 0;

        for(int i: arr){
            totalSum += i;
        }

        for(int i = 0; i < arr.length;i++){
            int rightSum = totalSum-leftSum-arr[i];
            if(rightSum == leftSum)
                System.out.println("Pivot index is:- "+arr[i]);
            leftSum+=arr[i];
        }
    }
}
