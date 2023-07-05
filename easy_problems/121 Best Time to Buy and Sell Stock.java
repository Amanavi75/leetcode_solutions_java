
// we will buy  on that day when the price is minimum from 1st to i-1th day and after that we will compare with the all day and check on which day profit is maximum 

 


class Solution {
    public int maxProfit(int[] prices) {
        
   int mini =prices[0];
   int maxProfit = 0;
   for (int i =0;i<prices.length;i++){
       int cost = prices[i]-mini;
       maxProfit= Math.max(maxProfit,cost);
       mini = Math.min(mini,prices[i]);
   }
     return maxProfit;
    }
}
