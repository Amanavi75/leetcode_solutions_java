// sum the number till n 
// sum up of all the array element 
// substract array's element sum from sum of n number 



class Solution {
    public int missingNumber(int[] nums) {
        int sum;
        int n = nums.length;

        sum = n*(n+1)/2;
        int count =0;
        for(int i=0; i<nums.length; i++){
            count+=nums[i];
        }
        return sum-count;
    }
}
