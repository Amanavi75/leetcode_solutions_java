/**
So, here also let's say our character are:
s = abc
t = cabx

if we take XOR of every character. all the n character of s "abc" is similar to n character of t "cab". So, they will cancel each other. 
And we left with our answer.

s =   abc
t =   cbax
------------
ans -> x
----------- */

class Solution {
    public char findTheDifference(String s, String t) {
        char result = 0; 
        for (char c : s.toCharArray()) {
            result ^= c; 
        }
        for (char c : t.toCharArray()) {
            result ^= c; 
        }
        
        return result;
    }
}
