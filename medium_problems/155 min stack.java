/**
For each "push" operation, we are going to compare the value to our current minimum and if it's smaller than that, we are going to push the "val" to the minStack. Otherwise, we are going to peek at the minStack and push it that value again.
For each "pop" operation, we are going to pop both from the main stack and the minStack. Therefore for each step, we will have the same "minimum value" information available. */

class MinStack {

    Stack<Integer> minStack;
    Stack<Integer> stack;

    public MinStack() {
        minStack = new Stack<>();
        stack = new Stack<>();
    }
    
    public void push(int val) {
        int currentMin;
        
        if (minStack.isEmpty() || val <= (currentMin = minStack.peek()))
            minStack.push(val);
        else
            minStack.push(currentMin);

        stack.push(val);
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
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
