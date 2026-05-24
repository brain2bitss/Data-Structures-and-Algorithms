class Solution {
    public boolean containsDuplicate(int[] nums) {
        int array_length = nums.length;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < array_length; i++){
            mp.put(nums[i],i);
        }
        int size_of_mp = mp.size();
        return size_of_mp != array_length;
    }
}