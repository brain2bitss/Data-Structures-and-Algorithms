class Solution {
    public int titleToNumber(String columnTitle) {
        StringBuilder str = new StringBuilder(columnTitle);
        int result = 0;
        int index = 0;
        int ascii = -5;
        
        while (index < str.length()) {
            ascii = str.charAt(index);
            int value = ascii - 65 + 1;
            result = result * 26 + value;
            index++;
        }
        return result;
    }
}