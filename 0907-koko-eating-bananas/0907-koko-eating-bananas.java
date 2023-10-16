class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = 1;
        for (int p : piles) {
            r = Math.max(r, p);
        }
        int res = r;

        while (l <= r) {
            int m = (l + r) >>> 1;
            int hours = 0;
            for (int p : piles) {
                hours += Math.ceil((double) p / m);
            }
            if (hours <= h) {
                res = Math.min(res, m);
                r = m - 1;
            } else {
                l = m + 1;
            }
        }

        return res;
    }
}