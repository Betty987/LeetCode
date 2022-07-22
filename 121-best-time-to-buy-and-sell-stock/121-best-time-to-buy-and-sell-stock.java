class Solution{
    public int maxProfit(int[] prices) {
        int min_value=Integer.MAX_VALUE;
        int max_profit=0;
        for(int i=0;i<prices.length;i++) {
        	if(prices[i]<min_value) {
        		min_value=prices[i];
        		
        	}
        	else{
        		max_profit=Math.max(max_profit,prices[i]-min_value);
        	}
        }
        return max_profit;
    }
}
