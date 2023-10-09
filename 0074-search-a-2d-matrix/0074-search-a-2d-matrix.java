class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length; // 3
        int cols = matrix[0].length; // 3
        int begin = 0, end = rows * cols - 1;

        while (begin <= end) {
            int mid = (begin + end) >>> 1;
            int value = matrix[mid / cols][mid % cols];

            if (target > value) {
                begin++;
            } else if (target < value) {
                end--;
            } else {
                return true;
            }
        }

        return false;
    }
}