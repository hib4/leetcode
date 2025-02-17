class Solution {
    public int maxProfit(int[] prices) {
        int current = 0, max = 0;

        for (int i = 1; i < prices.length; i++) {
            current = Math.max(0, current + (prices[i] - prices[i - 1]));
            max = Math.max(current, max);
        }

        return max;
    }
}