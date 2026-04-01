class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length == 1)
            return;
        int index = 0; int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0 && index < nums.length){
                nums[index] = nums[i];
                index++;
            }else{
                count++;
            }
        }
        int li = nums.length - 1;
        for(int i = count; i > 0; i--){
            nums[li] = 0;
            li--;
        }
    }
}