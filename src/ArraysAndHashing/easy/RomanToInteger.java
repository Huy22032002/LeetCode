package ArraysAndHashing.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    // use s.length() only 1 time to reduce time
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int stringLength = s.length();
        int sum = 0;

        for(int i = 0; i < stringLength - 1; i++) {
            if(map.get(s.charAt(i)) >= map.get(s.charAt(i+1)) )
                sum+= map.get(s.charAt(i));
            else if(map.get(s.charAt(i)) < map.get(s.charAt(i+1)) )
                sum-= map.get(s.charAt(i));
        }
        return sum + map.get(s.charAt(stringLength - 1));
    }

    public int romanToInt2(String s) {
        int[] arr = new int[128];
        arr['I'] = 1;
        arr['V'] = 5;
        arr['X'] = 10;
        arr['L'] = 50;
        arr['C'] = 100;
        arr['D'] = 500;
        arr['M'] = 1000;
        int sum = 0;
        int stringLength = s.length();
        for(int i = 0; i < stringLength - 1; i++) {
            if(arr[s.charAt(i)] >= arr[s.charAt(i+1)]) {
                sum += arr[s.charAt(i)];
            }
            else{
                sum -= arr[s.charAt(i)];
            }
        }
        return sum + arr[s.charAt(stringLength-1)];
    }

    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        int result = romanToInteger.romanToInt2("IV");
        System.out.println(result);
    }

}
