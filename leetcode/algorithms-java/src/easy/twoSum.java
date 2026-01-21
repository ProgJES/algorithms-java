package easy;

import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public int[] Solution(int[] nums, int target) {
        Map<Integer, Integer> indexLocator = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (indexLocator.containsKey(complement)) {
                return new int[] {indexLocator.get(complement), i};
            }
            indexLocator.put(nums[i], i);
        }
        throw new IllegalArgumentException("No Solution");
    }
}
