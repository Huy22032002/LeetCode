package ArraysAndHashing.easy;

import java.util.*;

public class ContainsDuplicate {
    /**
     * use Bruteforce => time complexity: O(n^2), space complexity: O(1)
     */
    public boolean containsDuplicateBruteForce(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) return true;
            }
        }
        return false;
    }
    /**
     * use HashSet => time complexity: O(n), space complexity: O(n)
     */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) return true;
            set.add(num);
        }
        return false;
    }

    /*
    * use HashMap, time complexity: O(n), space complexity: O(n)
     */
    public boolean containsDuplicateHashMap(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(map.get(i), 0)+1);
        }
        return map.size() < nums.length;
    }

    //use HashSet length ~ HashSet
    //stream(): đưa từng phần tử về dạng stream để java có thể xử lý sequential or parallel
    public boolean containsDuplicate3(int[] nums) {
        return Arrays.stream(nums).distinct().count() < nums.length;
    }

    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        System.out.println(containsDuplicate.containsDuplicateHashMap(new int[] {1,2,3,4,5,52}));
    }
}
