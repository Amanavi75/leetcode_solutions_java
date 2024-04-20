/**
For each "push" operation, we are going to compare the value to our current minimum and if it's smaller than that, we are going to push the "val" to the minStack. Otherwise, we are going to peek at the minStack and push it that value again.
For each "pop" operation, we are going to pop both from the main stack and the minStack. Therefore for each step, we will have the same "minimum value" information available. */

/*class MinStack {

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
} */
/**
For each "push" operation, we are going to compare the value to our current minimum and if it's smaller than that, we are going to push the "val" to the minStack. Otherwise, we are going to peek at the minStack and push it that value again.
For each "pop" operation, we are going to pop both from the main stack and the minStack. Therefore for each step, we will have the same "minimum value" information available.  two stack logic*/

class MinStack {

     int min = Integer.MAX_VALUE;
    Stack<Integer> stack = new Stack<Integer>();
    public void push(int x) {
        // only push the old minimum value when the current 
        // minimum value changes after pushing the new value x
        if(x <= min){          
            stack.push(min);
            min=x;
        }
        stack.push(x);
    }

    public void pop() {
        // if pop operation could result in the changing of the current minimum value, 
        // pop twice and change the current minimum value to the last minimum value.
        if(stack.pop() == min) min=stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
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

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
