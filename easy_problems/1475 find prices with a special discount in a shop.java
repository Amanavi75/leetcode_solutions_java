/**
create a method get price have parameter i, price and arr[] prices 
iterate from j= 1+1 to size of the prices array and if prices[j]< prices[i] then return price-prices[i].

 */
class Solution {
    public int[] finalPrices(int[] prices) {
        for(int i = 0; i < prices.length; i++)
            prices[i] = getPrice(i, prices[i], prices); 
        return prices;
    }

    public int getPrice(int i, int price, int[] prices){
        for(int j = i + 1; j < prices.length; j++)
            if(prices[j] <= prices[i])
                return price - prices[j];
        return price;
        
    }
}
