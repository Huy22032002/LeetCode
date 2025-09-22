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

    public String[] topKFrequent(String[] str, int k) {
        Map<String, Integer> map = new HashMap<>();
        for(String s: str) {
            map.put(s, map.getOrDefault(s, 0) +1);
        }
        List<String[]> lstString = new ArrayList<>();
        for(Map.Entry<String, Integer> entry: map.entrySet()) {
            lstString.add(new String[] {entry.getKey(), entry.getValue().toString()});
        }
        lstString.sort((a,b) -> Integer.parseInt(b[1]) - Integer.parseInt(a[1]));

        String[] result = new String[k];
        for(int i = 0; i < k; i++) {
            result[i] = lstString.get(i)[0];
        }
        return result;
    }

    public static void main(String[] args) {
        TopFrequentElement topFrequentElement = new TopFrequentElement();
        String[] res = topFrequentElement.topKFrequent(new String[] {"huy", "trinh", "huy", "trinh", "trinh", "tai"}, 2);
        System.out.println(Arrays.toString(res));
    }
}
