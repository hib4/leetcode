class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        while (l < r) {
            int t = numbers[l] + numbers[r];
            if (target > t) {
                l += 1;
            } else if (target < t) {
                r -= 1;
            } else {
                return new int[]{l + 1, r + 1};
            }
        }
        return new int[]{};
    }
}