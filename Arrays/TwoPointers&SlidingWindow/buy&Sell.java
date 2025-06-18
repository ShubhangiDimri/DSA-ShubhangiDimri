class Solution {
    public int maxProfit(int[] prices) {
        int maxP=0;
        int bestBuy=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]>bestBuy){
                maxP=Math.max(maxP,prices[i]-bestBuy);
            }
            bestBuy=Math.min(bestBuy,prices[i]);
        }
        return maxP;
    }
}
