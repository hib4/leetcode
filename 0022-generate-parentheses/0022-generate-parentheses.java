class Solution {
    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        gen("", n, 0);
        return res;
    }

    private void gen(String s, int left, int right) {
        if (left == 0 && right == 0) {
            res.add(s);
            return;
        }
        if (left > 0) gen(s + "(", left - 1, right + 1);
        if (right > 0) gen(s + ")", left, right - 1);
    }
}