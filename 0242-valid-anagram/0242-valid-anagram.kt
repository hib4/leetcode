class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val countS = hashMapOf<Char, Int>()
        val countT = hashMapOf<Char, Int>()

        for (i in s.indices) {
            countS[s[i]] = 1 + (countS[s[i]] ?: 0)
            countT[t[i]] = 1 + (countT[t[i]] ?: 0)
        }
        for (j in countS) {
            if (countS[j.key] != countT[j.key]) return false
        }
        return true
    }
}