package leetcode

/** https://leetcode.com/problems/happy-number/ */
class HappyNumber {
    fun isHappy(n: Int): Boolean {
        val set = mutableSetOf<Int>()

        var v = n
        while (true) {
            var sum = 0
            while (v > 0) {
                sum += (v % 10) * (v % 10)
                v /= 10
            }
            if (sum == 1) {
                return true
            } else if (set.contains(sum)) {
                return false
            }
            set.add(sum)
            v = sum
        }
    }
}

fun main(args: Array<String>) {
    val sol = HappyNumber()
    println(sol.isHappy(19))
}
