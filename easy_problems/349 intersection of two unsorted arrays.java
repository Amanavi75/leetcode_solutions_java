//Use two hashsets and input the elements of first array in the first hashset and remove duplicates while input of the second array elements.
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> n1 = new HashSet<>();
        HashSet<Integer> n2 = new HashSet<>();
        
        for(int i=0;i<nums1.length;i++){
            n1.add(nums1[i]);
        }
        
        for(int i=0;i<nums2.length;i++){
            if(n1.contains(nums2[i])){
                n2.add(nums2[i]);
            }
        }

        int[] arr = new int[n2.size()];

        int k =0;
        for(int i: n2){
            arr[k] = i;
            k++;
        }

        return arr;
    }
}
