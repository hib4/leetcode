class Solution {
    public int fib(int n) {
        if (n < 2) {
            return n;
        }

        int[] bucket =  new int[n + 1];
        bucket[0] = 0;
        bucket[1] = 1;

        for (int i = 1; i < n; i++) {
            bucket[i + 1] = bucket[i] + bucket[i - 1];
        }

        return bucket[n];
    }
}