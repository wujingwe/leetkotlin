package leetcode

/** https://leetcode.com/problems/power-of-two/ */
class PowerOfTwo {
    fun isPowerOfTwo(n: Int): Boolean {
        var sum = 0
        var n = n
        while (n > 0) {
            sum += (n and 0x01)
            if (sum > 1) { return false }
            n = n shr(1)
        }
        return sum == 1
    }
}

fun main(args: Array<String>) {
    val sol = PowerOfTwo()
    println(sol.isPowerOfTwo(1))
    println(sol.isPowerOfTwo(16))
    println(sol.isPowerOfTwo(218))
}
