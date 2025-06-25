class Solution {
    public int maxProfit(int[] prices) {
        int max_profit=0;
        int min_profit=Integer.MAX_VALUE;
        int profit;
        for (int i=0;i<prices.length;i++){
            if(prices[i]<min_profit)
            {
                min_profit=prices[i];
            }
            else{
                profit=prices[i]-min_profit;
                if(profit>max_profit) max_profit=profit;
            }                          
        }
        return max_profit;
    }    
}
