class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        if(nums[left] == target){
            return 0;
        }
        int right = nums.length - 1;
        int mid = 0; int result = -1;
        while(left <= right){
            mid = (left + right) / 2;
            if(nums[mid] == target){
                result = mid;
                break;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return result;
    }
}