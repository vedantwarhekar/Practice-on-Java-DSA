package Array;


//recursive approach of remove
//duplicate from array without using any loop and without using any extra space
// with sorted array
public class PWProblem3V1 {
    static int removeDuplicate(int[] arr){
        if(arr == null || arr.length == 0){
            return 0;
        }
        return helper(arr,1,0) + 1;
    }

    static int helper(int[] arr, int index, int lastUniqueIndex){
        if(index == arr.length){
            return lastUniqueIndex;
        }

        if(arr[index] != arr[lastUniqueIndex]){
            arr[lastUniqueIndex+1] = arr[index];
            return helper(arr,index+1,lastUniqueIndex+1);
        }

        return helper(arr,index+1,lastUniqueIndex);
    }
    public static void main(String[] args){
       int[] arr = {1,1,2,2,3,4,4};
       int uniqueIndex = removeDuplicate(arr);
       for(int i = 0; i < uniqueIndex; i++){
           System.out.print(arr[i] + " ");
       }
       System.out.println();
    }
}
