class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] second = new int[1001];
        for (int x : nums2) {
            second[x]++;
        }

        int size = 0;
        int[] temp = second.clone();
        for (int x : nums1) {
            if (temp[x] > 0) {
                size++;
                temp[x]--;
            }
        }

        int[] result = new int[size];
        int i = 0;
        for (int x : nums1) {
            if (second[x] > 0) {
                result[i++] = x;
                second[x]--;
            }
        }

        return result;
    }
}