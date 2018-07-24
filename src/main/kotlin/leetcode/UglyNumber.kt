package leetcode

class UglyNumber {
    fun isUgly(num: Int): Boolean {
        if (num == 0) {
            return false
        }
        var num = num
        intArrayOf(2, 3, 5).forEach {
            while (num % it == 0) {
                num /= it
            }
        }
        return num == 1
    }
}

fun main(args: Array<String>) {
    val sol = UglyNumber()
    println(sol.isUgly(0))
    println(sol.isUgly(6))
    println(sol.isUgly(8))
    println(sol.isUgly(14))
}
