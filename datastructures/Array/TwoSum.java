package datastructures.Array;

/**
 * Two Sum - Classic Interview Question (Easy to Medium)
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        // HashMap solution - O(n) time, O(n) space
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {}; // No solution
    }
}