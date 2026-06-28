// class Solution {
//     public List<Integer> findDuplicates(int[] nums) {

//         List<Integer> arr = new ArrayList<>();
        
//         Arrays.sort(nums);
//         int j = 1;

//         for(int i = 0; i < nums.length -1; i++){
//             if(nums[i] == nums[j]){
//                 arr.add(nums[i]);
//             }
//             j++;
//         }
//         return arr;
//     }
// }

class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> list = new ArrayList<>();
        HashSet map = new HashSet<>();
        
        for(int i = 0; i < nums.length; i++){

            if(map.contains(nums[i])){
                list.add(nums[i]);
            }else{
                map.add(nums[i]);
            }
        }

        return list;
    }
}