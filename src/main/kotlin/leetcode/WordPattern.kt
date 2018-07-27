package leetcode

/** https://leetcode.com/problems/word-pattern/ */
class WordPattern {
    fun wordPattern(pattern: String, str: String): Boolean {
        val tokens = str.split(' ')
        if (tokens.size != pattern.length) {
            return false
        }

        val map = mutableMapOf<Char, String>()
        for (i in 0 until pattern.length) {
            val c = pattern[i]
            if (!map.contains(c)) {
                if (map.containsValue(tokens[i])) {
                    return false
                }
                map[c] = tokens[i]
            } else if (map[c] != tokens[i]) {
                return false
            }
        }
        return true
    }
}

fun main(args: Array<String>) {
    val sol = WordPattern()
    println(sol.wordPattern("abba", "dog cat cat dog"))
    println(sol.wordPattern("abba", "dog cat cat fish"))
    println(sol.wordPattern("aaaa", "dog cat cat dog"))
    println(sol.wordPattern("abba", "dog dog dog dog"))
}
