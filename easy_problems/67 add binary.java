/** We start at the right end of each binary number, adding the digits and any carry-over value, and storing the result in a new string.
Now we move to the next digit on the left and repeats the process until it has gone through all the digits in both binary numbers.
If there is any carry-over value after adding all the digits, append it to the end of the new string.
Finally, the new string is reversed and returned as the sum of the two binary numbers. */


class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
       int carry = 0;
    int i = a.length() - 1;
    int j = b.length() - 1;

    while (i >= 0 || j >= 0 || carry == 1) 
    {
      if(i >= 0)
        carry += a.charAt(i--) - '0';
      if(j >= 0)
        carry += b.charAt(j--) - '0';
      sb.append(carry % 2);
      carry /= 2;
    }
    return sb.reverse().toString();
    }
}
