class Solution {
    public int countNegatives(int[][] grid) {
        int result = 0; 
        for (int i =0; i<grid.length;i++){
            for(int j =0 ;j<grid[0].length;j++){
                if(grid[i][j]<0){
                    result++;
                }
            }
        } 
        return result;

    }
}
/* approach ;
first of all we will intiate a variable result with zero for the count of negetaive number after that we will iteraate the through the whole matrix row wise and whenever we will get a negative number we will just increment the count of result  and at last we will return the result */
