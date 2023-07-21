// ========= O(log n base 2) =============
        // while(n>=2){
        //     if(n%2!=0) return false;
        //     n/=2;
        // }
        // return n==1;
        //=========================================

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        return ((n&(n-1))==0);
    }
}
