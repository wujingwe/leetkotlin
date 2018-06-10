package leetcode

import java.util.*

/** https://leetcode.com/problems/valid-parentheses/ */
class ValidParentheses {

    companion object {
        val map = mapOf(')' to '(', '}' to '{', ']' to '[')
    }

    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        return s.all { c ->
            if (c !in map) {
                stack.add(c)
            } else {
                stack.isNotEmpty() && stack.pop() == map[c]
            }
        } && stack.isEmpty()
    }
}

fun main(args: Array<String>) {
    val sol = ValidParentheses()
    println("${sol.isValid("()")}")
    println("${sol.isValid("()[]{}")}")
    println("${sol.isValid("(]")}")
    println("${sol.isValid("([)]")}")
    println("${sol.isValid("{[]}")}")
}