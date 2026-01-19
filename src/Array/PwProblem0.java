package Array;


// place all the zero to the end of the array without changing the sequence of non-zero element
public class PwProblem0 {
    public static void main(String[] args) {
      int[] arr = {1,0,3,0,4,0,6,8,0,9,0};
      int idx = 0;
      for(int i = 0; i < arr.length; i++){
          if(arr[i] != 0){
              arr[idx++] = arr[i];
          }
      }

      while (idx < arr.length){
          arr[idx++] = 0;
      }

      for(int i : arr){
          System.out.print(i+" ");
      }
        System.out.println();
    }
}
