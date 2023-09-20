class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    // Create a HashMap to store elements as keys and their indices as values.
    HashMap<Integer, Integer> map = new HashMap<>();
    
    // Iterate through the array 'nums'.
    for (int i = 0; i < nums.length; i++) {
        // Check if the current element 'nums[i]' is already present in the HashMap.
        if (map.containsKey(nums[i])) {
            // If 'nums[i]' is already in the HashMap, calculate the absolute difference
            // between the current index 'i' and the previously stored index for 'nums[i]'.
            int diff = Math.abs(i - map.get(nums[i]));
            
            // If the absolute difference 'diff' is less than or equal to 'k', return 'true'.
            if (diff <= k) {
                return true;
            }
        }
        
        // Put the current element 'nums[i]' and its index 'i' into the HashMap.
        // If 'nums[i]' was already in the HashMap, this will update its index to the current value of 'i'.
        map.put(nums[i], i);
    }
    
    // If no such pair of indices 'i' and 'j' is found, return 'false'.
    return false;
    }
}
