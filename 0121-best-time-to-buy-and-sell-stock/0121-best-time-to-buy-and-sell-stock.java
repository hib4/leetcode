class Solution {
    public int maxProfit(int[] prices) {
        int current = prices[0], max = 0;

        for (int price : prices) {
            int sell = price - current;

            if (sell < 0) {
                current = price;
            }

            max = Math.max(sell, max);
        }

        return max;
    }
}