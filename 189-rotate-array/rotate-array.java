class Solution {
    //CODED BY ADHI
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        //BASE CASE
        if(n == 1 || n == 0){
            return;
        }

        int F = 0; int E = n - 1;

        //BASE CASE
         k = k % n;
        if(k == 0) return;

        //REVERSE THE ENTIRE ARRAY 
        function(nums, n, F, E);

        

        //REVERSE THE FIRST PART OF THE 
        F = 0; E = k - 1;
        function(nums, k, F, E);

        //REVERSE REMAINING PART OF THE ARRAY
        F = k; E = n - 1;
        int rem_length = n - k;
        function(nums, rem_length, F, E);
    }
    private void function(int[] nums, int n, int F, int E){
        for(int i = 0; i < n; i++){
            int temp = nums[F];
            nums[F] = nums[E];
            nums[E] = temp; 
            F++;
            E--;
            if(F == E ||  F > E){
                break;
            }
        }
    }
}