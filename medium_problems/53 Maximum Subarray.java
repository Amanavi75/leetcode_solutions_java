//We will run a loop(say i) to iterate the given array.
//Now, while iterating we will add the elements to the sum variable and consider the maximum one.
//f at any point the sum becomes negative we will set the sum to 0 as we are not going to consider it as a part of our answer.


class Solution {
    public int maxSubArray(int[] nums) {
     int max = nums[0];
     int sum = 0;

    for(int i =0;i<nums.length;i++){
        sum+=nums[i];
        if(sum>max){
            max=sum;
        }
        if(sum<0){
            sum=0;
        }
       }
       return max;
    }
}
