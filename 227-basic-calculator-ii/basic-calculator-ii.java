class Solution {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        int num = 0;
        char symbol = '+';
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            if(Character.isDigit(c)){
                num = num * 10 + (c - '0');
            }
            
            if((!Character.isDigit(c) && c != ' ') || i == s.length() - 1){
                if(symbol == '+'){
                    st.push(num);
                } else if(symbol == '-'){
                    st.push(-num);
                } else if(symbol == '*'){
                    st.push(st.pop() * num);
                } else if(symbol == '/'){
                    st.push(st.pop() / num);
                }
                
                symbol = c;
                num = 0;
            }
        }
        
        int result = 0;
        while(!st.isEmpty()){
            result += st.pop();
        }
        return result;
    }
}