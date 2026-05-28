class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0; int j = i + 1;
        int[] res = new int[2];
        while(true){
            if(nums[i] + nums[j] == target){
                res[0] = i; res[1] = j;
                break;
            }
            j++;
            if(j > nums.length - 1){
                i++;
                if(i == nums.length - 1) break;
                j = i + 1;
            }
        }
        return res;
    }
}