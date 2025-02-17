class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        String result = null;

        boolean[][] dp = new boolean[len][len];

        for (int i = len - 1; i >= 0; i--) {
            for (int j = i; j < len; j++) {
                dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || dp[i + 1][j - 1]);

                if (dp[i][j] && (result == null || j - i + 1 > result.length())) {
                    result = s.substring(i, j + 1);
                }
            }
        }
        
        return result;
    }
}