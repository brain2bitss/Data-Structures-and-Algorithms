class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0; int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid -1;
            }
        }
        return right + 1;
        //instead of right + 1; we can also return as left;
    }
}


//The below program is correct but the time complexity of the program is o(n)

//But the question asked to solve the problem with O(log n)

//Using Binary search

// class Solution {
//     public int searchInsert(int[] nums, int target) {
//         int result = -1;int index = 0;
//         for(int i = 0;  i <= nums.length - 1; i++){
//             if(nums[i] >= target){
//                 result = i;
//                 break;
//             }
//             index = i;
//         }
//         if(result == -1){
//             result = index + 1;
//         }
//         return result;
//     }
// }