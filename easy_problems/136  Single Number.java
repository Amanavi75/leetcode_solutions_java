// we will do with the help ofxor property , that is xor clearly states that if the numbers ar same and if we will do a xor the correspoding value will be zero 
// and zero xor any number is the number itself 
class Solution {
    public int singleNumber(int[] nums) {
        int xor  = 0;
        for (int i =0;i<nums.length;i++){
            xor = xor ^ nums[i];
        }
        return xor;
    }

}
