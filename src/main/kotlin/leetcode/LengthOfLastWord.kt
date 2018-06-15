package leetcode

/** https://leetcode.com/problems/length-of-last-word/ */
class LengthOfLastWord {
    fun lengthOfLastWord(s: String): Int {
        val s = s.trim()
        if (s.isEmpty()) return 0
        return s.length - (s.lastIndexOf(' ') + 1)
    }
}

fun main(args: Array<String>) {
    val sol = LengthOfLastWord()
    println(sol.lengthOfLastWord("Hello World"))
    println(sol.lengthOfLastWord("a"))
    println(sol.lengthOfLastWord("a "))
}