class Solution {
    public int maximumProduct(int[] nums) {
    int n = nums.length;
        
     // Sort the array in ascending order.
    Arrays.sort(nums);   
    // Calculate two possible products:
    //Product of the three largest numbers.
    // 2. Product of the two smallest numbers (if they are negative) and the largest number.
    int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];//Product of the three largest numbers.
    int product2 = nums[0] * nums[1] * nums[n - 1]; //Product of the two smallest numbers(if they are negative)and the largest number.
        
        // Return the maximum of the two products.
        return Math.max(product1, product2);
    }
}
