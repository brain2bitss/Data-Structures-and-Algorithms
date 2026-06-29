import java.util.Stack;

class MinStack {

    private Stack<Long> stack = new Stack<>();
    private long min = 0;

    public MinStack() {
        
    }
    
    public void push(int value) {
        long val = (long) value;
        if (stack.isEmpty()) {
            stack.push(val);
            min = val;
        } else if (val < min) {
            stack.push(2L * val - min);
            min = val;
        } else {
            stack.push(val);
        }
    }
    
    public void pop() {
        long popped = stack.pop();
        if (popped < min) {
            min = 2L * min - popped;
        }
    }
    
    public int top() {
        long top = stack.peek();
        if (top < min) {
            return (int) min;
        }
        return (int) top;
    }
    
    public int getMin() {
        return (int) min;
    }
}
