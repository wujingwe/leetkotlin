package leetcode

/** https://leetcode.com/problems/implement-strstr/ */
class StrStr {
    fun strStr(haystack: String, needle: String): Int {
        val m = haystack.length
        val n = needle.length

        if (n == 0) return 0
        if (n > m) return -1

        for (i in 0..m - n) {
            var hPos = i
            var nPos = 0

            run breaking@ {
                repeat(n) {
                    if (haystack[hPos] != needle[nPos]) {
                        return@breaking
                    }
                    hPos++
                    nPos++
                }
            }
            if (nPos == n) {
                return hPos - n
            }
        }
        return -1
    }
}

fun main(args: Array<String>) {
    val sol = StrStr()
    println(sol.strStr("hello", "ll"))
    println(sol.strStr("hello", "lo"))
    println(sol.strStr("aaaaa", "bba"))
    println(sol.strStr("aaa", "aaaa"))
    println(sol.strStr("", "a"))
    println(sol.strStr("mississippi", "issipi"))
}