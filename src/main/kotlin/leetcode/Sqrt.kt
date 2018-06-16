package leetcode

/**
 * https://leetcode.com/problems/sqrtx/
 *
 * #binary search
 * #overflow
 */
class Sqrt {
    fun mySqrt(x: Int): Int {
        if (x < 2) return x

        var begin = 1
        var end = x

        while (begin < end) {
            val mid = begin + (end - begin) / 2
            if (mid == x / mid) {
                return mid
            } else if (mid > x / mid) {
                end = mid - 1
            } else {
                begin = mid + 1
            }
        }
        return if (begin > x / begin) { begin - 1 } else { begin }
    }
}

fun main(args: Array<String>) {
    val sol = Sqrt()
    println(sol.mySqrt(8))
    println(sol.mySqrt(4))
    println(sol.mySqrt(1))
    println(sol.mySqrt(6))
    println(sol.mySqrt(0))
    println(sol.mySqrt(2))
    println(sol.mySqrt(2147395599))
}