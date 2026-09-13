package Array.TwoPointer;

public class Practice {
    static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,0,7,4,0,2,3,5,0};

        int j = 0;
        for(int i =0; i < arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        printArray(arr);
    }
}
