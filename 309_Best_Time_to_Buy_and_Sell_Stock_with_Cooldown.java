class Solution {
    public int maxProfit(int[] prices) {
        int sold=Integer.MIN_VALUE;
        int held=Integer.MIN_VALUE;
        int reset=0;

        for(int x=0;x<prices.length;x++)
        {
            int prevSold=sold;
            sold=held+prices[x];
            held=Math.max(held,reset-prices[x]);
            reset=Math.max(reset,prevSold);

        }
        return Math.max(sold,reset);
        
    }
}
