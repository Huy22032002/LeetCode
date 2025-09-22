package ArraysAndHashing.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TopFrequentElement {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums) {
            map.put(i, map.getOrDefault(map.get(i),0)+1);
            //[1,2,2,3,3,3] => 1:1, 2:2, 3:3
        }
        System.out.println(map.values());
        Arrays.sort(map.values().toArray());
        System.out.println("a: " + Arrays.toString(map.values().toArray()));
        return null;
    }

    public static void main(String[] args) {
        TopFrequentElement topFrequentElement = new TopFrequentElement();
        topFrequentElement.topKFrequent(new int[] {1,2,2,3,3,3,3,4}, 2);
    }
}
