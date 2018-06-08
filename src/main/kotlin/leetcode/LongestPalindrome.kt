package leetcode

/** https://leetcode.com/problems/longest-palindromic-substring/ */
class LongestPalindrome {
    fun longestPalindrome(s: String): String {
        var start = 0
        var end = 0

        for (i in 0 until s.length) {
            val len1 = palindrome(s, i, i)
            val len2 = palindrome(s, i, i + 1)
            val len = Math.max(len1, len2)
            if (len > end - start + 1) {
                start = i - (len - 1) / 2
                end = i + len / 2
            }
        }
        return s.substring(start, end + 1)
    }

    private fun palindrome(s: String, left: Int, right: Int): Int {
        val len = s.length
        var start = left
        var end = right

        while (start >= 0 && end < len && s[start] == s[end]) {
            start--
            end++
        }
        return end - start - 1
    }
}

fun main(args: Array<String>) {
    val sol = LongestPalindrome()
    println(sol.longestPalindrome("babad"))
    println(sol.longestPalindrome("cbbd"))
}