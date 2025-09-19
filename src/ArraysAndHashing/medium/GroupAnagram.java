package ArraysAndHashing.medium;


import java.util.*;

public class GroupAnagram {

    //Way 1: group by key of sorted String
    public List<List<String>> groupAnagram(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s: strs) {
            //sort string to put by key
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String sortedString = new String(charArr);

            map.putIfAbsent(sortedString, new ArrayList<>());
            map.get(sortedString).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public List<List<String>> groupAnagram2(String[] strs) {
        return null;
    }

    public static void main(String[] args) {
        GroupAnagram groupAnagram = new GroupAnagram();
        System.out.println(groupAnagram.groupAnagram(new String[] {"saa","aas", "asa", "hyu", "huy", "uyh", "hsd"}));
    }
}
