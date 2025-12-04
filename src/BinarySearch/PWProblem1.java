package BinarySearch;


// find the first occurrence of the the element
// arr[] = {1,1,2,3,3,3,4,4,5,5} target = 3
// output = 3
public class PWProblem1 {

    static int binarySearch(int[] arr, int target)
    {
        int start = 0; int end = arr.length-1;
        int firstOccurrence = -1;
        while (start <= end)
        {
            int mid = start + (end -start) / 2;

            if(arr[mid] == target)
            {
                firstOccurrence = mid;
                end = mid -1;
            }else if(arr[mid] < target)
            {
                start = mid + 1;
            }else {
                end = mid -1;
            }
        }
        return firstOccurrence;
    }
    public static void main(String[] args) {
      int arr[] = {1,1,2,3,3,3,4,4,5,5};
        System.out.println(binarySearch(arr,4));
    }
}
