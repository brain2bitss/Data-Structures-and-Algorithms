class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int first = 0;
        int last = k;
        int add = 0;
        for(int i = first; i < last; i++){
            add = add + nums[i];
        }
        
        int max = add;

        while(last < nums.length){
            add = add - nums[first] + nums[last];
            max = Math.max(max, add);
            first++;
            last++;
        }
        return (double) max/k;
    }
}