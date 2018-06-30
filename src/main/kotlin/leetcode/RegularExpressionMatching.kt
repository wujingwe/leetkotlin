package leetcode

/**
 * https://leetcode.com/problems/regular-expression-matching/
 *
 * #backtracking
 */
class RegularExpressionMatching {
    fun isMatch(s: String, p: String): Boolean {
        return backtrack(s, p, 0, 0)
    }

    private fun backtrack(s: String, p: String, index1: Int, index2: Int): Boolean {
        if (index1 == s.length && index2 == p.length) {
            return true
        }
        if (index2 == p.length) {
            return false
        }
        if (index1 == s.length) {
            return if (index2 < p.length - 1 && p[index2 + 1] == '*') {
                backtrack(s, p, index1, index2 + 1)
                        || backtrack(s, p, index1, index2 + 2)
            } else {
                false
            }
        }

        when {
            p[index2] == '.' || s[index1] == p[index2] -> {
                return if (index2 < p.length - 1 && p[index2 + 1] == '*') {
                    backtrack(s, p, index1 + 1, index2)
                            || backtrack(s, p, index1, index2 + 2)
                } else {
                    backtrack(s, p, index1 + 1, index2 + 1)
                }
            }
            p[index2] == '*' -> {
                return if (p[index2 - 1] == '.' || s[index1] == p[index2 - 1]) {
                    backtrack(s, p, index1 + 1, index2)
                            || backtrack(s, p, index1 + 1, index2 + 1)
                            || backtrack(s, p, index1, index2 + 1)
                } else {
                    backtrack(s, p, index1, index2 + 1)
                }
            }
            else -> {
                return if (index2 < p.length - 1 && p[index2 + 1] == '*') {
                    backtrack(s, p, index1, index2 + 2)
                } else {
                    false
                }
            }
        }
    }
}

fun main(args: Array<String>) {
    val sol = RegularExpressionMatching()
    println(sol.isMatch("a", ".*..a*")) // false
    println(sol.isMatch("ab", ".*c")) // false
    println(sol.isMatch("aa", "a")) // false
    println(sol.isMatch("a", "")) // false
    println(sol.isMatch("mississippi", "mis*is*p*.")) // false
    println(sol.isMatch("", "a")) // false
    println(sol.isMatch("aaa", "aaaa")) // false

    println("=====")

    println(sol.isMatch("a", ".*")) // true
    println(sol.isMatch("bbbba", ".*a*a")) // true
    println(sol.isMatch("", "")) // true
    println(sol.isMatch("", ".*")) // true
    println(sol.isMatch("a", "ab*")) // true
    println(sol.isMatch("aaa", "ab*a*c*a")) // true
    println(sol.isMatch("aaa", "a*a")) // true
    println(sol.isMatch("aa", "a*")) // true
    println(sol.isMatch("ab", ".*")) // true
    println(sol.isMatch("aab", "c*a*b")) // true
}
