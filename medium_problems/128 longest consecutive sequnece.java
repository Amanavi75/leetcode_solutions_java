// first of we will add the elements in the hashset after that we will intialize the count for sequence after that we will run a loop in which we will check for the number -1 is in the hashet or not after that we will run a while loop till set contains num+1 , if it exist we will increase the number as well as count also and after that we will check for the maximum count of consequitive sequnece 

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null) return 0;
        Set<Integer> set = new HashSet<>();
        for(int x : nums) set.add(x);
        int max = 0;
        for(int x : nums) {
            int count = 0;
            if(!set.contains(x-1)) {
                x++;
                while(set.contains(x)){
                    count++;
                    x++;
                }
                max = Math.max(count+1,max);
            }
            
        }
        return max;
    }
}
