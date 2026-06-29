import java.util.Stack;

class MinStack { 
    private Stack<Integer> stack = new Stack<>(); 
    private Stack<Integer> minStack = new Stack<>(); 

    public MinStack() { 
    } 
    
    public void push(int value) { 
        stack.push(value); 
        if (minStack.isEmpty()) {
            minStack.push(value);
        } else {
            minStack.push(Math.min(value, minStack.peek()));
        }
    } 

    public void pop() { 
        stack.pop(); 
        minStack.pop(); 
    } 

    public int top() { 
        return stack.peek(); 
    } 

    public int getMin() { 
        return minStack.peek(); 
    } 
}
