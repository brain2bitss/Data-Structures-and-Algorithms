class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;
        
        int[] count = new int[26];
        
        for (char c : p.toCharArray()) {
            count[c - 'a']++;
        }
        
        int matches = 0;  
        int left = 0;
        
        for (int right = 0; right < s.length(); right++) {

            int rightIdx = s.charAt(right) - 'a';
            if (count[rightIdx] > 0) {
                matches++;  
            }
            count[rightIdx]--;
            
            if (right - left + 1 == p.length()) {
                
                if (matches == p.length()) {
                    result.add(left);
                }
                
                int leftIdx = s.charAt(left) - 'a';
                if (count[leftIdx] >= 0) {
                    matches--; 
                }
                count[leftIdx]++;
                left++;
            }
        }
        
        return result;
    }
}