class Solution {
    fun wordBreak(s: String, wordDict: List<String>): Boolean {
        if (s.isEmpty()) return false
        val wordSet = HashSet<String>(wordDict)
        val seen = HashSet<Int>()
        return dfs(0, s, wordSet, seen)
    }

    fun dfs(index: Int, s: String, wordSet: HashSet<String>, seen: HashSet<Int>): Boolean {
        val len = s.length
        if (index == len) return true
        if (seen.contains(index)) return false
        for (i in index + 1..len) {
            val sub = s.substring(index, i)
            if (!wordSet.contains(sub)) continue
            if (dfs(i, s, wordSet, seen)) return true
        }
        seen.add(index)
        return false
    }
}