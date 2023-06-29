class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = hashMapOf<String, MutableList<String>>()

        for (i in strs.indices) {
            val s = strs[i]
            val chars = s.toCharArray().sortedArray()
            val str = String(chars)

            if (!map.containsKey(str)) {
                map[str] = ArrayList()
            }
            map[str]?.add(s)
        }

        return ArrayList(map.values)
    }
}