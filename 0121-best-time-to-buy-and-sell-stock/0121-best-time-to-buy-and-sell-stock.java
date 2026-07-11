class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int max_profit = 0;
        for(int price : prices){
            if(price< buy ) buy = price;
            int profit = price - buy;
            if(profit> max_profit) max_profit = profit;
        }
        return max_profit;
    }
}