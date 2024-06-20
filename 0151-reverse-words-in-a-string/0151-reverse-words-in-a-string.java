class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().replaceAll(" +", " ").split(" ");

        for (int i = 0; i < words.length; i++) {
            for (int j = 1; j < words.length - i; j++) {
                String temp = words[j];
                words[j] = words[j - 1];
                words[j - 1] = temp;
            }
        }

        return String.join(" ", words);
    }
}