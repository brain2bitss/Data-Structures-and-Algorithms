class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder current = new StringBuilder();
        int k = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (Character.isDigit(c)) {
                k = k * 10 + (c - '0');
            } 
            else if (c == '[') {
                countStack.push(k);
                stringStack.push(current);
                current = new StringBuilder();
                k = 0;
            } 
            else if (c == ']') {
                int count = countStack.pop();
                StringBuilder decoded = stringStack.pop();
                for (int j = 0; j < count; j++) {
                    decoded.append(current);
                }
                current = decoded;
            } 
            else {
                current.append(c);
            }
        }
        
        return current.toString();
    }
}