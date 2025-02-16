class Solution {
    public long maxAlternatingSum(int[] nums) {
        long result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            result += Math.max(nums[i] - nums[i - 1], 0);
        }
        
        return result;
    }
}