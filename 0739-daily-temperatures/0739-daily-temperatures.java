class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] res = new int[len];
        if (len <= 1) {
            return res;
        }
        for (int i = len - 2; i >= 0; i--) {
            int j = i + 1;
            while (res[j] != 0 && temperatures[i] >= temperatures[j]) {
                j += res[j];
            }
            if (temperatures[i] < temperatures[j]) {
                res[i] = j - i;
            }
        }
        return res;
    }
}