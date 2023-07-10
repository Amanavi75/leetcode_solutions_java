// create an empty stack
// loop through each character in the string
//if the character is an opening parenthesis ush the corresponding closing parenthesis onto the stack and smae with all the remaining parenthesis
//if the character is a closing bracket
// if the stack is empty (i.e., there is no matching opening bracket) or the top of the stack
// does not match the closing bracket, the string is not valid, so return false



class Solution {
    public boolean isValid(String s) {
     Stack<Character> stack = new Stack<Character>(); 
        for (char c : s.toCharArray()) { 
            if (c == '(') {
                stack.push(')'); 
            }else if(c=='{')
                stack.push('}'); 
            
            else if (c == '[') 
                stack.push(']'); 
            else if (stack.isEmpty() || stack.pop() != c) 
                return false;
        }
        return stack.isEmpty();
    }
}
