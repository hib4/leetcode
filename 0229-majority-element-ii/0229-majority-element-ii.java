class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int fm = Integer.MAX_VALUE, fs = 0;
        int sm = Integer.MIN_VALUE, ss = 0;

        for (int num : nums) {
            if (fm == num) {
                fs++;
            } else if (sm == num) {
                ss++;
            } else if (fs == 0) {
                fm = num;
                fs++;
            } else if (ss == 0) {
                sm = num;
                ss++;
            } else {
                fs--;
                ss--;
            }
        }

        fs = 0;
        ss = 0;

        for (int num : nums) {
            if (fm == num) {
                fs++;
            } else if (sm == num) {
                ss++;
            }
        }

        if (fs > nums.length / 3) {
            res.add(fm);
        }
        if (ss > nums.length / 3) {
            res.add(sm);
        }
        
        return res;
    }
}