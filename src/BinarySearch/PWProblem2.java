package BinarySearch;

//Find the square root of the given non negative value x. Round it off to the nearest floor integer value.
// Input: x = 4
// Output: 2

public class PWProblem2 {

    static int findSqrt(int x)
    {
        int start = 0;
        int end = x;
        int ans = -1;
        while (start <= end)
        {
            int mid = start + (end - start) /2;
            int val = mid * mid;
            if(val == x)
            {
                return  mid;
            }else if(val < x)
            {
                ans = mid;
                start = mid + 1;
            }else {
                end = mid -1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(findSqrt(32));
    }
}
