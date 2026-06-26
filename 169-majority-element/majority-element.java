class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                int val = map.get(nums[i]) + 1;
                map.put(nums[i], val);
            }else{
                map.put(nums[i], 1);
            }

            if(map.get(nums[i]) > nums.length / 2){
                return nums[i];
            }
        }
        return -1;
    }
}

// class Solution {
//     public int majorityElement(int[] nums) {
//         int count = 0;
//         int candidate = 0;

//         // Boyer-Moore Voting Algorithm
         
//         for (int num : nums) {
//             if (count == 0) {
//                 candidate = num;
//             }
//             count += (num == candidate) ? 1 : -1;
//         }
//         return candidate;
//     }
// }
