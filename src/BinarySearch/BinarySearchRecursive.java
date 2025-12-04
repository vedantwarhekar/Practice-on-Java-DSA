package BinarySearch;

public class BinarySearchRecursive {

    static int binarySearch(int[] arr, int start, int end, int target)
    {
        if(start <= end)
        {
            int mid = start + (end - start)/2;
            if(arr[mid] < target)
            {
               return binarySearch(arr,mid+1,end,target);
            }
            else if(arr[mid] > target)
            {
                return binarySearch(arr,start,mid-1,target);
            }else {
                return mid;
            }
        }
       return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2,4,5,6,7,8,9,10,11,13};
        System.out.println(binarySearch(arr,0,arr.length-1,11));
    }
}
