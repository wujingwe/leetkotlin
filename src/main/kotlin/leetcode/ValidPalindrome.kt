package leetcode

/** https://leetcode.com/problems/valid-palindrome/ */
class ValidPalindrome {
    fun isPalindrome(s: String): Boolean {
        var begin = 0
        var end = s.length - 1

        while (begin < end) {
            while (begin < end && !s[begin].isLetterOrDigit()) { begin++ }
            while (end > begin && !s[end].isLetterOrDigit()) { end-- }
            if (begin == end) { break }

            if (!s[begin].equals(s[end], true)) {
                return false
            }
            begin++
            end--
        }
        return true
    }
}

fun main(args: Array<String>) {
    val sol = ValidPalindrome()
    println(sol.isPalindrome("A man, a plan, a canal: Panama"))
    println(sol.isPalindrome("race a car"))
    println(sol.isPalindrome(".,"))
    println(sol.isPalindrome("0P"))
}
