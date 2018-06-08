package leetcode

/** https://leetcode.com/problems/reverse-integer/ */
class ReverseInteger {
    fun reverse(x: Int): Int {
        var result = 0L

        @Suppress("NAME_SHADOWING")
        var x = x
        while (x != 0) {
            val v = x % 10
            x /= 10

            result = result * 10 + v

            if (result > Int.MAX_VALUE || result < Int.MIN_VALUE) {
                return 0
            }
        }
        return result.toInt()
    }
}

fun main(args: Array<String>) {
    val sol = ReverseInteger()
    println(sol.reverse(123))
    println(sol.reverse(-123))
    println(sol.reverse(120))
    println(sol.reverse(Int.MAX_VALUE)) // 2147483647
    println(sol.reverse(Int.MIN_VALUE)) // -2147483648
}