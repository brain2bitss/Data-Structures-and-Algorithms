import java.util.Arrays;

class Solution {
    public String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return "";
        }

        // Convert primitives to a helper class object to avoid string allocations in sorting
        NumStr[] arr = new NumStr[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = new NumStr(nums[i]);
        }

        // Sort using an allocation-free primitive custom comparison routine
        Arrays.sort(arr, (o1, o2) -> {
            long val1 = o1.val * o2.multiplier + o2.val;
            long val2 = o2.val * o1.multiplier + o1.val;
            return Long.compare(val2, val1); // Descending order evaluation
        });

        // Corner edge-case optimization: If the highest ranked item is 0, entire output is 0
        if (arr[0].val == 0) {
            return "0";
        }

        // Assemble string elements efficiently
        StringBuilder sb = new StringBuilder();
        for (NumStr num : arr) {
            sb.append(num.val);
        }

        return sb.toString();
    }

    // Light micro-optimized helper struct keeping integer values with pre-calculated multipliers
    private static class NumStr {
        int val;
        long multiplier;

        NumStr(int val) {
            this.val = val;
            this.multiplier = getMultiplier(val);
        }

        private long getMultiplier(int n) {
            if (n == 0) return 10;
            long p = 1;
            while (n > 0) {
                p *= 10;
                n /= 10;
            }
            return p;
        }
    }
}
