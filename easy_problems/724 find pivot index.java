class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int value : nums){
            sum = sum + value;
        }
         
        int start = 0, index = 0;
        for(index=0; index<nums.length; index++){
             
            sum = sum - nums[index];
            if(start == sum){
                return index;
            }
            start = start + nums[index];
        }
        return -1;
    }
}
