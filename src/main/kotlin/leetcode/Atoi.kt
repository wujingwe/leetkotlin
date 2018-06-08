package leetcode

/** https://leetcode.com/problems/string-to-integer-atoi/ */
class Atoi {
    fun atoi(str: String): Int {
        var trimStr = str.trim()
        if (trimStr.isEmpty() || trimStr[0].isLetter()) {
            return 0
        }

        val sign = when {
            trimStr[0] == '+' -> {
                trimStr = trimStr.substring(1)
                1
            }
            trimStr[0] == '-' -> {
                trimStr = trimStr.substring(1)
                -1
            }
            else -> 1
        }

        var result = 0L
        for (i in 0 until trimStr.length) {
            if (!trimStr[i].isDigit()) {
                break
            }
            result = result * 10 + trimStr[i].toInt() - '0'.toInt()

            if (result * sign > Int.MAX_VALUE) return Int.MAX_VALUE
            else if (result * sign < Int.MIN_VALUE) return Int.MIN_VALUE
        }

        result *= sign
        return result.toInt()
    }
}

fun main(args: Array<String>) {
    val sol = Atoi()
    println(sol.atoi(""))
    println(sol.atoi("+1"))
    println(sol.atoi("42"))
    println(sol.atoi("   -42"))
    println(sol.atoi("4193 with words"))
    println(sol.atoi("words and 987"))
    println(sol.atoi("-91283472332")) // Int.MIN_VALUE
    println(sol.atoi("9223372036854775808")) // Int.MAX_VALUE
}