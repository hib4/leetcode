class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val arr = IntArray(26) { 0 }

        s.forEach { arr[it - 'a'] += 1 }
        t.forEach { arr[it - 'a'] -= 1 }

        return arr contentEquals IntArray(26) { 0 }
    }
}