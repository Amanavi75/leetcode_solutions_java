/** 
two pointer approach 
Initialization:

Initialize i to 0 and j to the last index of the array.
While Loop:

Keep iterating until i is less than j.
Increment i if the element at i is even.
Decrement j if the element at j is odd.
Swap the elements at i and j if the above conditions aren't met.
Return the Modified Array:

After the loop completes, the array will be sorted by parity. */

class Solution {
    public int[] sortArrayByParity(int[] nums) {
         int i = 0, j = nums.length - 1;
        
        while (i < j) {
            while (i < j && nums[i] % 2 == 0)
                i++;
            while (i < j && nums[j] % 2 == 1)
                j--;
            
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        
        return nums;
    }
}
