class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int longest_subarray = 0;
        int sum = 0;

        map.put(0, -1);
        
        for(int i = 0; i < nums.length; i++){

            if(nums[i] == 1) sum++;
            if(nums[i] == 0) sum--;

            if(map.containsKey(sum)){
                longest_subarray = Math.max(longest_subarray, i - map.get(sum));
            }else{
                map.put(sum, i);
            }
        }
        return longest_subarray;
    }
}