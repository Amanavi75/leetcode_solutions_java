// first we will create an array to store the answer of the same size that of the given array after that we will intilize positive index to 0 and negative to 1 and after we will check that if the element in the array is negative we will put it at 1 and increment the negative by 2 position since we have to add it alternatively same will go with positive we will at it to add 0 and increment its position by 2 after that we will return the ans

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int ans[] = new int[nums.length];
        int positiveIndex = 0;
        int negativeIndex = 1;
        for(int i =0;i<nums.length;i++){
            if(nums[i]<0){
                ans[negativeIndex]=nums[i];
                negativeIndex +=2;
            }else {
                ans[positiveIndex]=nums[i];
                positiveIndex +=2;
            }
        }
        return ans;
    }
}
