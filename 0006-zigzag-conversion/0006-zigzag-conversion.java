class Solution {
    public String convert(String s, int numRows) {
        if (numRows <= 1) return s;

        StringBuilder[] builders = new StringBuilder[numRows];
        for (int i = 0; i < builders.length; i++) {
            builders[i] = new StringBuilder();
        }

        int index = 0;
        int direction = -1;
        char[] chars = s.toCharArray();
        for (char c : chars) {
            builders[index].append(c);
            if (index == 0 || index == numRows - 1) {
                direction = -direction;
            }
            index += direction;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder b : builders) {
            result.append(b);
        }

        return result.toString();
    }
}