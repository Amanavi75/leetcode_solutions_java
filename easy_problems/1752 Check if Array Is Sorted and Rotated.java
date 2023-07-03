class Solution {
    public boolean check(int[] nums) {
        int count=0;
        int n=nums.length-1;
        for(int i=1;i<=n;i++){
            if(nums[i-1]>nums[i]){
                count++;
            }
        }
        if(nums[n]>nums[0]) count++;
        return count<=1;
    }
   
}
