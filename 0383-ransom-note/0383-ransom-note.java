class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            char m = magazine.charAt(i);
            map.put(m, map.getOrDefault(m, 0) + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char r = ransomNote.charAt(i);
            int value = map.getOrDefault(r, 0);
            if (value != 0) {
                if (value == 1) {
                    map.remove(r);
                } else {
                    map.put(r, --value);
                }
            } else {
                return false;
            }
        }


        return true;
    }
}