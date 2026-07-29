import java.util.HashMap;
import java.util.Map;
class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        // Iterate from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int value = romanMap.get(currentChar);

            if (value < prevValue) {
                total -= value;
            } else {
                total += value;
                prevValue = value;
            }
        }

        return total;
    }
}

