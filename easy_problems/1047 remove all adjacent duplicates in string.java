/**
Stack<Character> st = new Stack<>();: Here, a stack named st is created to store characters.
 The type parameter <Character> specifies that this stack will store character values.

The code then enters a for loop that iterates through each character in the input string s. 
The loop is controlled by the variable i.

Inside the loop, the code checks if the stack st is not empty (st.size() > 0) and if the character at the top of the stack (st.peek()) is equal to the current character in the string (s.charAt(i)). 
If this condition is true, it means there are consecutive duplicate characters in the string.
In such a case, the code removes the character from the stack using st.pop(), effectively eliminating the consecutive duplicates.

If the condition in step 3 is not true, meaning the current character is not a consecutive duplicate, 
the code pushes the character onto the stack using st.push(s.charAt(i)).

After processing all characters in the input string,
 the code creates a StringBuilder named sb to construct the final result.

System.out.println(st);: This line prints the contents of the stack st to the console. 
This is likely included for debugging purposes and can be removed in a production version of the code.

The code then enters a for-each loop to iterate through the characters remaining in the stack after duplicate removal. 
It appends each character to the StringBuilder sb using sb.append(ch).

Finally, the code returns the string representation of the StringBuilder by calling sb.toString(). 
This string will contain the original characters from the input string s with consecutive duplicates removed.
 */
class Solution {
    public String removeDuplicates(String s) {
        Stack <Character> st = new Stack<>();
        for(int i =0;i<s.length();i++){
            if(st.size()>0 && st.peek()==s.charAt(i)){
                st.pop();
            }else {
                st.push(s.charAt(i));
            }
        }
        StringBuilder sb=new StringBuilder();
        System.out.println(st);
        for(char ch: st){
           sb.append(ch);
        }
       return sb.toString(); 
    }
}
