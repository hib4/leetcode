class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val freq = hashMapOf<Int, Int>()
        for (n in nums) {
            freq[n] = freq.getOrDefault(n, 0) + 1
        }

        val bucket = arrayOfNulls<MutableList<Int>>(nums.size + 1)
        for (i in bucket.indices) bucket[i] = mutableListOf()
        for (key in freq.keys) bucket[freq[key]!!]?.add(key)

        val res = arrayListOf<Int>()
        for (i in bucket.size - 1 downTo 0) {
            res.addAll(bucket[i]!!)
            if (res.size >= k) break
        }

        return res.toIntArray()
    }
}