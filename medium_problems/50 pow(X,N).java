//Initialize ans as 1.0  and store a duplicate copy of n i.e nn using to avoid overflow

//Check if nn is a negative number, in that case, make it a positive number.

//keep on iterating until nn is greater than zero, now if nn is an odd power then multiply x with ans ans reduce nn by 1. Else multiply x with itself and divide nn by two.

//Now after the entire binary exponentiation is complete and nn becomes zero, check if n is a negative value we know the answer will be 1 by and.

class Solution {
    public double myPow(double x, int n) {
       double ans =1.0;
       long nn = n;
       if (n<0) {
           nn= -1*nn;
       }
       while(nn>0){
           if(nn%2==1){
              ans = ans*x ;
              nn= nn-1;
           }else {
               x = x*x;
               nn=nn/2;
           }
       }
       if(n<0){
           ans = (double)(1.0) / (double)(ans);
       }
       return ans ;

    }
}
