class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] store = {-1, -1};
        
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            if (nums[mid] == target) {
                store[0] = mid; 
            }
        }
        
        start = 0; end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            if (nums[mid] == target) {
                store[1] = mid; 
            }
        }
        
        return store;
    }
}