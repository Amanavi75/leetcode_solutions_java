class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int [] r = new int [n-k+1];
        int ri=0;
        // storing index 
        Deque<Integer> q = new ArrayDeque<>();
        for ( int i =0; i< n;i++){
            // remove numbers out of range k 
            if(!q.isEmpty()&& q.peek()==i-k){
                q.poll();
            }
            // remove smaller numbers in k range as they are useless 
            while(!q.isEmpty() && nums[q.peekLast()] < nums[i]) {
                q.pollLast();
            }

            q.offer(i);
            if(i>=k-1){
                r[ri++]=nums[q.peek()];
            }
        }
        return r;
    }
}
