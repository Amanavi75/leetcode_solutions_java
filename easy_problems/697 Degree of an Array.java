class Solution {
    public int findShortestSubArray(int[] nums) {
     //maximum occurance
    int max = 0;
    //Final result
    int result = 0;
    //To keep the occurance of the elements in array
    Map<Integer, Integer> map = new HashMap<>();
    // Keep track of first occurance of element
    Map<Integer, Integer> first_seen = new HashMap<>();
    for(int i = 0; i < nums.length; i++){
       //Add the index with element if it is first seen 
      first_seen.putIfAbsent(nums[i], i);
      map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        if(map.get(nums[i]) > max){
            max = map.get(nums[i]);
            //store the length with maximum occurance subarray
            result = i - first_seen.get(nums[i]) + 1;  
        }
//if more than one element have the maximum occurance,then find one with minimum length
        else if(map.get(nums[i]) == max){
            result = Math.min(result, i - first_seen.get(nums[i])+1);
        }
             
    }
    return result; 
    }
}
