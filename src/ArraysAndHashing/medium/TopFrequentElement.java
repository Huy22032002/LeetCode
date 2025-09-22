package ArraysAndHashing.medium;

import java.util.*;

public class TopFrequentElement {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        List<int[]> arr = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            arr.add(new int[] {entry.getKey(), entry.getValue()});
        }
        arr.sort((a,b) -> b[1] - a[1]);

        int[] res = new int[k];
        for(int i = 0; i < k; i++) {
            res[i] = arr.get(i)[0];
        }
        return res;
    }

    public static void main(String[] args) {
        TopFrequentElement topFrequentElement = new TopFrequentElement();
        int[] res = topFrequentElement.topKFrequent(new int[] {5,2,5,3,5,3,1,1,3}, 2);
        System.out.println(Arrays.toString(res));
    }
}
