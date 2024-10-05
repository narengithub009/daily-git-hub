package Old;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if (map.containsKey(compliment)) {
                return new int[] { map.get(compliment), i };
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum location");
    }

    public static void main(String[] args) {

        TwoSum sum = new TwoSum();

        int[] nums = { 2, 67, 29, 7 };
        int target = 9;

        int[] result = sum.twoSum(nums, target);

        System.out.println("Indices [" + result[0] + ", " + result[1] + "]");
    }
}
