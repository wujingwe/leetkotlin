package leetcode

/** https://leetcode.com/problems/palindrome-number/ */
class PalindromeNumber {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false
        if (x % 10 == 0 && x != 0) return false

        var test = x
        var reverse = 0
        while (test > reverse) {
            reverse = reverse * 10 + test % 10
            test /= 10
        }
        return reverse == test || reverse / 10 == test
    }
}

fun main(args: Array<String>) {
    val sol = PalindromeNumber()
    println(sol.isPalindrome(121))
    println(sol.isPalindrome(-121))
    println(sol.isPalindrome(10))
}