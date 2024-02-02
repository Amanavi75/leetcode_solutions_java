// in first attempt i was getting the issue because of the overflow means
class Solution {
    public int reverse(int x) {
        int num = Math.abs(x);
        int reverse =0;
        while(num!=0){
           int digit = num%10;
           if (reverse > (Integer.MAX_VALUE - digit) / 10) {
                return 0;  // Agar overflow hua, toh 0 return kardo
            }
           reverse = reverse*10 + digit;
           num = num/10;
        } 

        return (x<0)?(-reverse):reverse;
    }
}
