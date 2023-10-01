/**
initialize an empty stack.
Iterate through the characters of the input string.
Push characters onto the stack until a space is encountered.
When a space is encountered, pop characters from the stack and append them to the result string until the stack is empty.
Repeat steps 3-4 until the end of the string is reached.
 */

class Solution {
    public String reverseWords(String s) {
         Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (c != ' ') {
                stack.push(c);
            } else {
                while (!stack.isEmpty()) {
                    result.append(stack.pop());
                }
                result.append(' ');
            }
        }
        
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        
        return result.toString();
    }
}
