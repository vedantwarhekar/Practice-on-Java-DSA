package Array;

public class KadaneAlgoP1 {
    public static void main(String[] args) {
        int[] arr = {2,-5,1,7,-3,4,-6};
        int currSum = 0, maxSum = 0;
        for(int i = 0; i < arr.length; i++){
          currSum+=arr[i];
          if(currSum > maxSum){
              maxSum = currSum;
          }
          if(currSum < 0){
              currSum = 0;
          }
        }
        System.out.println("Max Sum:- "+ maxSum);
    }
}
