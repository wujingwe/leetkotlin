package leetcode

/** https://leetcode.com/problems/longest-common-prefix/ */
class LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) {
            return ""
        } else if (strs.size == 1) {
            return strs[0]
        }

        var commonPrefix = strs[0]
        for (i in 1 until strs.size) {
            val s = strs[i]

            commonPrefix = if (commonPrefix.length > s.length) {
                commonPrefix(commonPrefix, strs[i])
            } else {
                commonPrefix(strs[i], commonPrefix)
            }
        }
        return commonPrefix
    }

    private fun commonPrefix(s1: String, s2: String): String {
        val len = Math.min(s1.length, s2.length)
        var index = 0
        for (i in 0 until len) {
            if (s1[i] != s2[i]) {
                return s1.substring(0, index)
            }
            index++
        }
        return s1.substring(0, index)
    }
}

fun main(args: Array<String>) {
    val sol = LongestCommonPrefix()
    println(sol.longestCommonPrefix(arrayOf("flower", "flow", "flight")))
    println(sol.longestCommonPrefix(arrayOf("dog", "racecar", "car")))
}