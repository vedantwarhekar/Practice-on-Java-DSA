package Array;

// Question 2 — Merge Two Sorted Arrays
public class PWProblem23 {
    public static void main(String[] args) {
      int[] arr = {2,3,4,5,8,9};
      int[] arr2 = {1,6,7,10};
      int[] result = new int[arr.length+arr2.length];

      int i = 0; int j = 0; int k = 0;
      while (i < arr.length && j < arr2.length){
          if(arr[i] < arr2[j]){
              result[k++] = arr[i++];
          }else{
              result[k++] = arr2[j++];
          }
      }
      while (i < arr.length) result[k++] = arr[i++];
      while (j < arr2.length) result[k++] = arr2[j++];

      for(int l : result){
          System.out.print(l+" ");
      }
        System.out.println();
    }
}
