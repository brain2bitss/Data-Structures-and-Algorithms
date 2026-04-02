class Solution {
    public int maximumAmount(int[][] coins) {
        int m = coins.length;
        int n = coins[0].length;
        // dp[i][j][k] = max sum to reach (i,j) using k neutralizations
        Integer[][][] dp = new Integer[m][n][3];
        return dfs(coins, 0, 0, 0, dp);
    }
    
    private int dfs(int[][] coins, int i, int j, int used, Integer[][][] dp) {
        // Base case: reached destination
        if (i == coins.length - 1 && j == coins[0].length - 1) {
            int val = coins[i][j];
            if (val < 0 && used < 2) {
                return 0; // Can neutralize this last coin
            }
            return val;
        }
        
        if (dp[i][j][used] != null) return dp[i][j][used];
        
        int current = coins[i][j];
        int maxSum = Integer.MIN_VALUE;
        
        // Try all possibilities for current cell
        // Option 1: Take current value as is
        int newUsed1 = used;
        int value1 = current;
        
        // Option 2: Neutralize current (if negative and can still neutralize)
        int newUsed2 = used;
        int value2 = current;
        if (current < 0 && used < 2) {
            newUsed2 = used + 1;
            value2 = 0;
        }
        
        // Try moving right
        if (j + 1 < coins[0].length) {
            // Don't neutralize current
            maxSum = Math.max(maxSum, value1 + dfs(coins, i, j + 1, newUsed1, dp));
            // Neutralize current
            if (current < 0 && used < 2) {
                maxSum = Math.max(maxSum, value2 + dfs(coins, i, j + 1, newUsed2, dp));
            }
        }
        
        // Try moving down
        if (i + 1 < coins.length) {
            // Don't neutralize current
            maxSum = Math.max(maxSum, value1 + dfs(coins, i + 1, j, newUsed1, dp));
            // Neutralize current
            if (current < 0 && used < 2) {
                maxSum = Math.max(maxSum, value2 + dfs(coins, i + 1, j, newUsed2, dp));
            }
        }
        
        return dp[i][j][used] = maxSum;
    }
}