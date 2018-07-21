package leetcode

/** https://leetcode.com/problems/valid-anagram/ */
class ValidAnagram {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) { return false }
        val map = mutableMapOf<Char, Int>()
        for (c in s) {
            map[c] = map.getOrPut(c) { 0 } + 1
        }
        for (c in t) {
            if (map[c] == null || map[c]!! <= 0) { return false }
            map[c] = map[c]!! - 1
        }
        return true
    }
}

fun main(args: Array<String>) {
    val sol = ValidAnagram()
    println(sol.isAnagram("anagram", "nagaram"))
    println(sol.isAnagram("rat", "car"))
    println(sol.isAnagram("aacc", "ccac"))
}
