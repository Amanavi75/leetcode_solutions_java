//Traverse linearly the 'mid' pointer :
//for 0, swap its position with the mid and increament both the mid and low by 1
//for 1, continue traversing the mid pointer
//for 2, swap its position with high and decrease high by 1

//everything to the left of low pointer will be 0
//everything to the right of high pointer will be 2
//everything between low and mid - 1 will be 1

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int temp;
        int low = 0, mid=0,high=n-1;
        while(mid<=high){
            if(nums[mid]==0){
                  temp = nums[low];
                  nums[low] = nums[mid];
                   nums[mid] = temp;
                   mid++;
                   low++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                temp= nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
    }
}
