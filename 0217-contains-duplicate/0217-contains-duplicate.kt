class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val map = hashMapOf<Int, Int>()
        nums.forEach {
            if (map.contains(it)) {
                return true
            }
            map[it] = 0
        }
        return false
    }
}