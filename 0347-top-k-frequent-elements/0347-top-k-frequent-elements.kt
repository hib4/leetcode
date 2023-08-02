class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val res = IntArray(k)

        val freq = hashMapOf<Int, Int>()
        for (n in nums) {
            freq[n] = freq.getOrDefault(n, 0) + 1
        }

        val pair = freq.toList().sortedBy { it.second }
        for (i in 0 until k) {
            res[i] = pair[pair.lastIndex - i].first
        }

        return res
    }
}