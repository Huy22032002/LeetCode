package ArraysAndHashing.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
    /*
    Time Complexity: O(n log n) + O(m log m)
    Space Complexity: O(1) or O(n + m) based on sorting algorithm
     */
    public boolean isAnagram(String s1, String s2) {
        char[] listChar1 = s1.toCharArray();
        char[] listChar2 = s2.toCharArray();

        Arrays.sort(listChar1);
        Arrays.sort(listChar2);

        return Arrays.equals(listChar1, listChar2);
    }

    /*
    Time Complexity: O(s1+s2)
    Space Complexity: O(1)
    */
    public boolean isAnagramHashMap(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }
        Map<Character, Integer> mapS1 = new HashMap<>();
        Map<Character, Integer> mapS2 = new HashMap<>();

        for(int i = 0; i < s1.length(); i++) {
            mapS1.put(s1.charAt(i), mapS1.getOrDefault(s1.charAt(i) ,0)+1);
            mapS2.put(s2.charAt(i), mapS2.getOrDefault(s2.charAt(i) ,0)+1);
        }
        return mapS1.equals(mapS2);
    }

    public static void main(String[] args) {
        Anagram a = new Anagram();
        System.out.println(a.isAnagram("huyuy", "hyuyu"));
    }

}
