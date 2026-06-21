class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Base case: return empty string if input is empty
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        // Start by assuming the entire first word is the prefix
        String prefix = strs[0];
        
        // Compare the prefix with every other string in the array
        for (int i = 1; i < strs.length; i++) {
            // Shorten the prefix until it matches the beginning of strs[i]
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                
                // If the prefix becomes empty, there is no common prefix
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        return prefix;
    }
}
