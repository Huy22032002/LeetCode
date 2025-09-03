package ArraysAndHashing;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    //time complexity: O(n)^2
    //space complexity: O(1)
    public int[] twoSum(int[] nums, int target) {
       for(int i = 0; i < nums.length-1; i++){
           for(int j = i+1; j < nums.length; j++){
               if(nums[i] + nums[j] == target){
                   return new int[]{i, j};
               }
           }
       }
       return null;
    }

    public int[] twoSumHashMap2Pass(int[] nums, int target) {
        Map<Integer, Integer> indices = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            indices.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if(indices.containsKey(diff) && indices.get(diff) != i ) {
                return new int[]{i, indices.get(diff)};
            }
        }
        return null;
    }

    public int[] twoSumHashMap1Pass(int[] nums, int target) {
        Map<Integer, Integer> prevMap = new HashMap<>();
        for(int i = 0; i < nums.length; i ++) {
            int diff = target - nums[i];
            if(prevMap.containsKey(diff)) {
                return new int[]{prevMap.get(diff), i};
            }
            prevMap.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,2,4,5};
        TwoSum twoSum = new TwoSum();
        System.out.println(Arrays.toString(twoSum.twoSumHashMap1Pass(a, 5)));
    }
}
