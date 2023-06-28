class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = hashMapOf<Int, Int>()
        nums.forEachIndexed { index, num ->
            val found = map[target - num]
            found?.let {
                return intArrayOf(found, index)
            }
            map[num] = index
        }
        return intArrayOf()
    }
}