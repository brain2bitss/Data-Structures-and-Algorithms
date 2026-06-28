class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;
        
        // Frequency arrays for characters 'a' to 'z'
        int[] pCount = new int[26];
        int[] sCount = new int[26];
        
        // Initialize frequency count for pattern p
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }
        
        // Sliding window over s
        for (int i = 0; i < s.length(); i++) {
            // Add current character to window
            sCount[s.charAt(i) - 'a']++;
            
            // Remove character that's no longer in window
            if (i >= p.length()) {
                sCount[s.charAt(i - p.length()) - 'a']--;
            }
            
            // Compare frequency arrays
            if (Arrays.equals(sCount, pCount)) {
                result.add(i - p.length() + 1);
            }
        }
        
        return result;
    }
}