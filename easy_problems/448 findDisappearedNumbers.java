class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;

        int a[] = new int[n];

        for(int i=0; i<n; i++){
            a[nums[i]-1]++;
        }

        List<Integer> ans = new ArrayList<>();

        for(int i=0; i<n; i++){
            if(a[i]==0) ans.add(i+1);
        }

        return ans;
    }
}
