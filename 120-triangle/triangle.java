class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] dp = new int[n + 1];
        for(int row = n - 1; row >= 0; row--){
            for(int i = 0; i <= row; i++){
                int value = triangle.get(row).get(i);
                dp[i] = value + Math.min(dp[i], dp[i+1]);
            }
        }
        return dp[0];
    }
}