package HashMap;

//Given an array of length n and a target, return a pair(indices) whose sum is equal to the target. If there is no pair present, return -1.
//Input1:
//n = 4
//arr[] = {1, 5, 7, -1}
//target = 6
//Output1: 0 1

import java.util.HashMap;

public class PWProblem4 {

    static int[] twoSumApp1(int[] arr,int target)
    {
        int n = arr.length;
        int ans[] = {-1};
        for(int i =0; i < n ; i++){
            for(int j = i+1;j < n; j++)
            {
                if(arr[i] + arr[j] == target)
                {
                    ans = new int[]{i,j};
                    return ans;
                }

            }
        }
        return ans;
    }

    static int[] twoSumApp2(int[] arr, int target) {
        int[] ans = {-1, -1};
        HashMap<Integer, Integer> hs = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int partner = target - arr[i];

            if (hs.containsKey(partner)) {
                return new int[]{i, hs.get(partner)};
            }

            hs.put(arr[i], i);
        }
        return ans;
    }

    public static void main(String[] args)
   {
       int arr[] = {1, 5, 7, -1};
       int ans[] = twoSumApp2(arr,6);
       System.out.println(ans[0]+" "+ans[1]);
   }
}
