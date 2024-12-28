class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();
        
        for (int x : nums1) {
            set.add(x);
        }
        for (int x : nums2) {
            if (set.contains(x)) {
                intersect.add(x);
            }
        }

        int size = intersect.size();
        int[] result = new int[size];

        int i = 0;
        for (int x : intersect) {
            result[i++] = x;
        }

        return result;
    }
}