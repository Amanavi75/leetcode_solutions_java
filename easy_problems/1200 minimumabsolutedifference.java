class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length-1; i++){
            min = Math.min(min,Math.abs(arr[i]-arr[i+1]));
        }
        for(int i=0; i<arr.length-1; i++){
            List<Integer> list = new ArrayList<>();
            if(Math.abs(arr[i]-arr[i+1])==min){
                list.add(arr[i]);
                list.add(arr[i+1]);
                res.add(list);
            }
        }
        return res;
    }
}

/* first of all we have created an res arraylist  where we have have to store the pairs after i have taken a for loop to that will run till length of array -1 , after that we will take the difference of nearest pair and we will use he Math.abs() method to find the absolute value and we will store it in the min
again we will create an list i.e type of arraylist again we will add the pairs in that list and at last we will return the result */ 
