package CollectionProblem;

import java.util.HashMap;
// two sum problem
//Input: nums = [2, 7, 11, 15], target = 9
//Output: [0, 1]
//Because nums[0] + nums[1] = 2 + 7 = 9
public class MapQ1 {
    public static void main(String[] args) {
        int[]  nums = {2, 7, 11, 15};
        int target = 9;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                System.out.println(map.get(complement)+" "+i);
                return;
            }
            map.put(nums[i],i);
        }
    }
}
