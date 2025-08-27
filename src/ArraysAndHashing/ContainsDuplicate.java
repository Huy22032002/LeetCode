package ArraysAndHashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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

    //use HashSet length ~ HashSet
    //stream(): đưa từng phần tử về dạng stream để java có thể xử lý sequential or parallel
    public boolean containsDuplicate3(int[] nums) {
        return Arrays.stream(nums).distinct().count() < nums.length;
    }
}
