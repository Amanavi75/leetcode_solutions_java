/** 

We can use the hash function to store the characters and words in key and value pair format.

We will two hash maps:

One will store characters of pattern(i.e. a b c) as key and strings of Str array (i.e. dogs cat) as value.
Other will store strings of Str array (i.e. dogs cat) as key and characters of pattern(i.e. a b c) as value.
Follow the below steps to break the solution into simple form:

Step1: Store the words of string s as array of strings.
Step2: Operate a loop from 0 to length of pattern.
Step3: Compare the corresponding charater and words by storing them in both the hash maps.
**/

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String[] words = s.split(" ");
        
        // Check if the lengths match
        if (words.length != pattern.length())
            return false;

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (map.containsKey(c)) {
                if (!map.get(c).equals(word))
                    return false;
            } else {
                if (map.containsValue(word))
                    return false;
                map.put(c, word);
            }
        }
        return true;
    }
}
