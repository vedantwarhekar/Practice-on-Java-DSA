package Array;

// remove duplicate from sorted array
public class PWProblem21 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,2,3,4,4,5,6,7,7};
        int k = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[k]){
                k++;
                arr[k] = arr[i];
            }
        }
        for(int i = 0; i <= k; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("===================");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
