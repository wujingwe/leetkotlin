package leetcode

/** https://leetcode.com/problems/longest-substring-without-repeating-characters/ */
class LengthOfLongestSubstring {
    // Hint: two pointers
    fun lengthOfLongestSubstring(s: String): Int {
        var i = 0
        var j = 0
        var max = 0
        val set = mutableSetOf<Char>()

        while (j < s.length) {
            if (set.contains(s[j])) {
                set.remove(s[i++])
            } else {
                set.add(s[j++])
                max = Math.max(max, j - i)
            }
        }
        return max
    }
}

fun main(args: Array<String>) {
    val sol = LengthOfLongestSubstring()
    println(sol.lengthOfLongestSubstring("abcabcbb"))
    println(sol.lengthOfLongestSubstring("bbbbb"))
    println(sol.lengthOfLongestSubstring("pwwkew"))
}