//The approach used is to keep track of the count of each element in the array using a HashMap, then check which elements have a count greater than n/3, where n is the length of the array. The elements that have a count greater than n/3 are added to a HashSet to eliminate duplicates. Finally, the elements in the HashSet are added to a result ArrayList.
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        List<Integer> list= new ArrayList<>();
        for (int i =0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }else{
                hm.put(nums[i],1);
            }
        }
        
        for(Integer key:hm.keySet()){
            if(hm.get(key)>nums.length/3){
                list.add(key);
            }
        }
        return list;
    }
}
