/**
For D -> stack.peek() x 2 ... So then we will have twice the value of Last
For C -> stack.pop() ... Invalidate last Score
For + -> x=stack.pop() , y=stack.pop() , z=x+y ,then push y,x,z resp..
For x -> stack.push(Integer.parseInt(x)))
 */
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        
        for(int i=0;i<operations.length;i++){
        if(operations[i].equals("C")){
                stack.pop();
            }

        else if(operations[i].equals("D")){
            stack.push(stack.peek()*2);
        }
        else if(operations[i].equals("+")){
            int x=stack.pop();
            int y=stack.pop();
            int z=x+y;
            stack.push(y);
            stack.push(x);
            stack.push(z);
        }
        else{
            stack.push(Integer.parseInt(operations[i]));
        }
        }
        int sum=0;
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        return sum;
    }
}
