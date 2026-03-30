class Solution {
    public int maxProfit(int[] prices) {
     int n = prices.length;
     int  maxDiff=0;
     for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
            int diff = prices[j]-prices[i];
            if(diff>maxDiff){
                maxDiff = diff;
            }
        }
     }
     return maxDiff;
    }
}
