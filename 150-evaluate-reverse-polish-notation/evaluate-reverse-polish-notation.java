import java.util.Stack;

class Solution { 
    public int evalRPN(String[] tokens) { 
        Stack<Integer> stack = new Stack<>(); 
        
        for (int i = 0; i < tokens.length; i++) { 
            String token = tokens[i]; 
            if (!token.equals("*") && !token.equals("/") && !token.equals("+") && !token.equals("-")) { 
                stack.push(Integer.parseInt(token)); 
            } else if (token.equals("+")) { 
                stack.push(stack.pop() + stack.pop()); 
            } else if (token.equals("*")) { 
                stack.push(stack.pop() * stack.pop()); 
            } else if (token.equals("-")) { 
                int num1 = stack.pop(); 
                int num2 = stack.pop(); 
                stack.push(num2 - num1); 
            } else { 
                int num1 = stack.pop(); 
                int num2 = stack.pop(); 
                stack.push(num2 / num1); 
            } 
        } 
        return stack.pop(); 
    } 
}
