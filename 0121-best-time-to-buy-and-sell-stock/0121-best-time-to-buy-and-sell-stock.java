class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int count = buy;
        int profit = 0;
        int sell =buy;
        for(int i = 0; i<prices.length; i++){
            if(prices[i]<buy){
                buy = prices[i];
                count = i;
                sell = buy;
                for(int j = count; j<prices.length;j++){
                    if(sell<prices[j]) sell = prices[j];
                    if((sell-buy)>profit) profit = sell-buy;
                }
            }
        }
        return profit;
    }
        
    
}