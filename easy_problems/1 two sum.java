// approach - we will use two pointer approach in which we will first sort the element and after we will put first pointer at first index and last pointer at last element  if we have to  increment we will move our first pointer ahead if we have to decrease then move last pointer one step back  

// we will use the HashMap to check if the other element i.e. target-(selected element) exists. Thus we can trim down the time complexity of the problem.
//And for the second variant, we will store the element along will its index in the HashMap. Thus we can easily retrieve the index of the other element i.e. target-(selected element) without iterating the array. 

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }
}
