class Solution {
    public String mergeAlternately(String word1, String word2) {
        int firstLength = word1.length();
        int secondLength = word2.length();
        int i = 0;
        int j = 0;
        StringBuilder finalResult = new StringBuilder();
       while (i < firstLength || j < secondLength) { // 
        if (i < firstLength) { // check if word1 has unprocessed index
       finalResult.append(word1.charAt(i++)); // append the index value to result and increment word's index by 1 
       }
       if (j < secondLength) { // check if word1 has unprocessed index
           finalResult.append(word2.charAt(j++));
                }
           }
       return finalResult.toString();
    }
}
