class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int backward = nums.length - 1;
        while(nums[backward] > nums[backward - 1]){
            backward--;
            if(backward == 0){
                break;
            }
        }
        return nums[backward];
    }
}