class Solution {
    public boolean isPalindrome(String s) {
         String ans = "";
        s = s.toLowerCase();   
        s= s.replace(" ",""); 
        s= s.replaceAll("\\p{Punct}", "");
        for(int i =s.length()-1;i>=0;i--){
            if(s.charAt(i)==(':')||s.charAt(i)==(',')){
               continue;
            }
            
            ans = s.charAt(s.length()-1-i)+ans;
            ans = ans.trim();

        }
        if(s.equals(ans)){
            return true;
        }
        return false;
    }
}
