// first  the base case will be the  for the length of string must be equal 
 // we will create two map for strings 
 // after that we will traverse through the whole string1 using charAt 
 // and we will check that every mapped element is similar or not and increment it after one count  

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;
        int[] map1 = new int[256];
        int[] map2 = new int[256];
       
        for(int idx = 0; idx < s.length(); idx++){
            
            if(map1[s.charAt(idx)] != map2[t.charAt(idx)])
                return false;
            map1[s.charAt(idx)] = idx + 1;
            map2[t.charAt(idx)] = idx + 1;
        }
        return true;    
    }
}
