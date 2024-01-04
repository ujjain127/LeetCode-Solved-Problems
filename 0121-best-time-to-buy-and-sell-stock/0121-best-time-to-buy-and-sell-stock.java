class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0], max = 0;
        if(prices.length <= 1){
            return 0;
        }
        for(int i = 0; i < prices.length; i++){
            min = Math.min(min,prices[i]);
            int profit = prices[i] - min;
            max = Math.max(max,profit);
        }

        return max; 
    }
}