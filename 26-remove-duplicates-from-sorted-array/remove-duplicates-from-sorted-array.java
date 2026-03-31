class Solution {
    public int removeDuplicates(int[] nums) {
        int prev = 0;
        int curr = 1;
        while(curr < nums.length){
            if(nums[prev] == nums[curr]){
                curr++;
            }else{
                prev++;
                nums[prev] = nums[curr];
            }
        }
        return prev + 1;
    }
}