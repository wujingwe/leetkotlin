package leetcode

/** https://leetcode.com/problems/add-digits/ */
class AddDigits {
    fun addDigits(num: Int): Int {
        var sum = 0
        var num = num

        while (num > 0) {
            sum += num % 10
            num /= 10
        }
        while (sum >= 10) {
            sum = addDigits(sum)
        }

        return sum
    }
}

fun main(args: Array<String>) {
    val sol = AddDigits()
    println(sol.addDigits(38))
}
