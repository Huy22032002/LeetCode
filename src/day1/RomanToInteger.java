package day1;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        if (s.length() == 1) {
            return map.get(s.charAt(0));
        }

        for (int i = 0; i < s.length()-1; i++) {
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))) {
                result -= map.get(s.charAt(i));
            }
            else {
                result += map.get(s.charAt(i));
            }

            if(i == s.length()-2) {
                result += map.get(s.charAt(i+1));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        RomanToInteger r = new RomanToInteger();
        System.out.println(r.romanToInt("II"));
    }
}
