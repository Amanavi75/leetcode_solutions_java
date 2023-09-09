/** start form end 
if hash count = 0 , just add the character to string 
for every hash count increment the hash count 
if hash count is not 0, then decrement hash count and skip CHARACTER */

class Solution {
    public boolean backspaceCompare(String s, String t) {
          return getActual(s).equals(getActual(t));
    }
    private String getActual(String input){
        StringBuilder actualString = new StringBuilder();
        int hashcount = 0;

        for(int i= input.length()-1;i>=0;i--){

            // keep a count of backspace character 
            if(input.charAt(i)=='#'){
                hashcount++;
                continue;
            }

            // if backspace count > 0reduce it and skip the character 
            if(hashcount>0){
                hashcount--;
            }else{
                // if no backspace , just insert at begining 
                actualString.insert(0,input.charAt(i));
            }
        }
        return actualString.toString();
    }
}
