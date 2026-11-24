package Array.TwoPointer;
/*
Given n non-negative integers representing an elevation map where the width of each bar
is 1, compute how much water it can trap after raining.

Example 1:
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array
[0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section)
are being trapped.

Example 2:
Input: height = [4,2,0,3,2,5]
Output: 9
*
*/
public class Problem7 {
    // Time Complexity O(n*n)
    public static int bruteForceTrap(int[] height) {
        int n = height.length-1;
        int water = 0;
        for(int i = 0; i <= n; i++){
            int leftMax = 0; int rightMax = 0;
            for(int j = 0; j <= i; j++){
                leftMax = Math.max(leftMax, height[j]);
            }
            for(int z= i; z <= n; z++){
                rightMax = Math.max(rightMax, height[z]);
            }
            water+= Math.min(rightMax,leftMax) - height[i];
        }
        return water;
    }

    public static int optimizedTrap(int[] height) {
        int left =0, right = height.length-1;
        int water = 0;
        int leftMax = height[left], rightMax = height[right];
        while(left < right){
            if(leftMax < rightMax){
                left++;
                leftMax = Math.max(leftMax,height[left]);
                water += leftMax - height[left];
            }else{
                right--;
                rightMax = Math.max(rightMax,height[right]);
                water += rightMax - height[right];
            }
        }
        return water;
    }

    public static void main(String[] args) {
        int bruteForceResult = bruteForceTrap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1});
        System.out.println(bruteForceResult);
        int optimizedForceResult = optimizedTrap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1});
        System.out.println(optimizedForceResult);
    }
}
