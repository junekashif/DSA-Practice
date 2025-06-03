class Best_Time_To_Buy_And_Sell_Stocks_I 
{
    public int maxProfit(int[] prices) 
    {
        int buy=prices[0],profit=0;
        for(int i=1;i<prices.length;i++)
        {
            int sell=prices[i];
            if(buy<sell)
            profit=Math.max(profit,sell-buy);
            else
            buy=sell;
        }
        return profit;
    }
}