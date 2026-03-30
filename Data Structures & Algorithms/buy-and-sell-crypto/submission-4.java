class Solution {
    public int maxProfit(int[] prices) {
     int n = prices.length;
     if (n==0) return 0;
     int maxsellingprice = prices[n-1];
     int  maxProfit=0;
     for(int i=n-2;i>-1;i--){
        maxProfit = Math.max(maxProfit,maxsellingprice-prices[i]);
        maxsellingprice = Math.max(maxsellingprice,prices[i]);
     }
     return maxProfit;
    }
}
