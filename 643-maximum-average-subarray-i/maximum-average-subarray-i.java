class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int first = 0;
        int last = k;
        double add = 0.0;
        for(int i = first; i < last; i++){
            add = add + nums[i];
        }
        double average = add/k;
        double max = average;

        while(last < nums.length){
            add = add - nums[first] + nums[last];
            average = add/k;
            max = Math.max(max, average);
            first++;
            last++;
        }
        return max;
    }
}