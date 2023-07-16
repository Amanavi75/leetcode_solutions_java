//We maintain a variable count that keeps a track of the number of consecutive 1’s while traversing the array. 
//The other variable max_count maintains the maximum number of 1’s, 

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxi=0;
        int count =0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                maxi=Math.max(maxi,count);
            }else{
                count =0;
            }
        }
         return maxi;
    }
   
}

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxi=0;
        int count =0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                maxi=Math.max(maxi,count);
            }else{
                count =0;
            }
        }
         return maxi;
    }
   
}
