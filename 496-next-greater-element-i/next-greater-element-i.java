class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int index = nums2.length - 1;int ans = -1;
        for(int i = 0; i < nums1.length; i++){
            int num = nums1[i];
            boolean found = false;
            for(int j = 0; j < nums2.length; j++){
                if(num == nums2[j]){
                    index = j;
                    found = true;
                }
                if(found && nums2[index] < nums2[j] && index < j){
                    nums1[i] = nums2[j];
                    break;
                }else{
                    nums1[i] = -1;
                }
                
            }
        }
        return nums1;
    }
}