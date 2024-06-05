package Hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class TwoSum {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2,7,11,15};
        int target = 9;

        int[] result = twoSum.twoSum(nums, target);
        if (result != null) {
            System.out.println(Arrays.toString(result));
        } else {
            System.out.println("No solution found.");
        }
    }
    public  int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> HT = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];//nums[j]==target-nums[i],j<i
            if(HT.containsKey(complement)){
                return new int[] {i, HT.get(complement)};
            }
            HT.put(nums[i], i);
        }
        //In case there is no solution, we will be  just return null
        return null;
    }
}
