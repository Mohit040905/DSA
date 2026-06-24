class Solution {
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price : prices){
            if(price<minprice) minprice = price;
            int profit = price - minprice;
            if(profit>maxProfit) maxProfit = profit;
        }
        return maxProfit;
    }
}