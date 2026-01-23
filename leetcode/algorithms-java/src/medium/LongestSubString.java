package medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubString {
    public int SolutionV1(String s) {
        // Version.1
        int left = 0, right = 0, result = 0;
        Set<Character> containerSet = new HashSet<>();

        while (right < s.length()) {
            char c = s.charAt(right);

            if (!containerSet.contains(c)) {
                containerSet.add(c);
                right++;
                result = Math.max(result, right-left);
            } else {
                containerSet.remove(s.charAt(left));
                left++;
            }
        }
        return result;
    }
    public int SolutionV2(String s) {
        // Version.2
        int stringLength = s.length();
        int result = 0;
        int left = 0;
        Map<Character, Integer> containerMap = new HashMap<>();

        for (int right = 0; right < stringLength; right++) {
            char c = s.charAt(right);
            if (containerMap.containsKey(c) && containerMap.get(c) >= left) {
                left = containerMap.get(c) + 1;
            }
            containerMap.put(c, right);
            result = Math.max(result, right - left + 1);
        }
        return result;
    }
}
