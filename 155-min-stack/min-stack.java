class MinStack {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int value) {
        if(!minStack.isEmpty()){
            int min = Math.min(minStack.peek(),value);
            minStack.push(min);
            stack.push(value);
        }else{
            stack.push(value);
            minStack.push(value);
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

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */