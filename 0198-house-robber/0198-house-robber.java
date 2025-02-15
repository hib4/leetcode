class Solution {
    public int rob(int[] nums) {
        int size = nums.length;
        int[] memo = new int[size + 1];
        memo[0] = 0;
        memo[1] = nums[0];

        for (int i = 1; i < size; i++) {
            memo[i + 1] = Math.max(memo[i], memo[i - 1] + nums[i]);
        }

        return memo[size];
    }
}