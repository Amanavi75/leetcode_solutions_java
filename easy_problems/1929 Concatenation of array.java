class Solution {
    public int[] getConcatenation(int[] nums) {
     int [] array2 = new int[2*nums.length]; // intializig the new array of double size of the old array where we will store that 
     for(int i =0;i<nums.length;i++){
         array2[i]=nums[i]; 
         array2[i+nums.length]=nums[i];// concatenating the two array 
     } 
     return array2;  
    }
}
