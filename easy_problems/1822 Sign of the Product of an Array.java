class Solution {
    public int arraySign(int[] nums) {
        int negative = 0 ;
        for (int i:nums){
            if(i==0) return 0;
            if(i<0) negative++;
        }
        return negative%2 ==0 ? 1 : -1;
    }
}
/* here we initiate a negative with 0 for ever number the nums array we will check that if there is any zero then we will return zero after that we will check for the negative if the count of the negative will be even we will return as 1 and if odd we will return -1 */
