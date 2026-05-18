package Array;

//recursive approach of remove
//duplicate from array without using any loop and without using any extra space
// with unsorted array
public class PWProblem3V2 {
    public int removeDuplicate(int[] arr){
        if(arr == null || arr.length == 0){
            return 0;
        }
        return remove(arr,0,0);
    }

    private int remove(int[] arr, int index, int uniqueIndex){
        if(index == arr.length){
            return uniqueIndex;
        }

        if(!isDuplicate(arr,index,0)){
            arr[uniqueIndex] = arr[index];
            return remove(arr,index+1,uniqueIndex+1);
        }

        return remove(arr,index+1,uniqueIndex);
    }

    private boolean isDuplicate(int[] arr, int current, int checkIndex){
        if(checkIndex == current) return false;

        if(arr[checkIndex] == arr[current]) return true;

        return isDuplicate(arr,current,checkIndex+1);
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 3, 2, 4, 1};
        PWProblem3V2 sol = new PWProblem3V2();
        int uniqueIndex = sol.removeDuplicate(arr);
        for(int i = 0; i < uniqueIndex; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
