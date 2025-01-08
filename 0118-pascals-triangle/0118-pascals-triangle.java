class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> column = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    row.add(1);
                } else {
                    List<Integer> temp = column.get(column.size() - 1);
                    for (int k = 0; k < temp.size() - 1; k++) {
                        int result = temp.get(k) + temp.get(k + 1);
                        row.add(result);
                    }
                    j = i - 1;
                }
            }
            
            column.add(row);
        }

        return column;
    }
}