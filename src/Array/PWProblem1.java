package Array;

// find the second larget element in array
public class PWProblem1 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 20, 15};
        int larget = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int num : arr)
        {
            if(num > larget)
            {
                secondLargest = larget;
                larget = num;
            }else if(num > secondLargest && num != larget)
            {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element");
        } else {
            System.out.println("Second largest = " + secondLargest);
        }
    }
}
