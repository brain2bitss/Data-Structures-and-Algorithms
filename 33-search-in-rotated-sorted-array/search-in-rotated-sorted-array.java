class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 1 && nums[0] == target){
            return 0;
        }else if(nums.length == 1 && nums[0] != target){
            return -1;
        }
        int count = 0; boolean found = false;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                found = true;
                break;
            }else{
                count++;
            }
        }
        return found != false ? count : -1;
    }
}