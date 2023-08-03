class Solution {
    private companion object {
        private val phonePad = arrayOf("", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz")
    }

    fun letterCombinations(digits: String): List<String> {
        val res = arrayListOf<String>()
        if (digits.isEmpty()) return res
        val builder = StringBuilder()
        dfs(0, digits, builder, res)
        return res
    }

    private fun dfs(index: Int, digits: String, builder: StringBuilder, res: ArrayList<String>) {
        if (index == digits.length) {
            res.add(builder.toString())
            return
        }
        val candidates = phonePad[digits[index] - '0']
        for (c in candidates) {
            builder.append(c)
            dfs(index + 1, digits, builder, res)
            builder.deleteCharAt(builder.lastIndex)
        }
    }
}