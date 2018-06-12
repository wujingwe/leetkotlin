package leetcode

/** https://leetcode.com/problems/multiply-strings/ */
class MultiplyStrings {
    fun multiply(num1: String, num2: String): String {
        if (num1 == "0" || num2 == "0") return "0"

        val m = num1.length
        val n = num2.length
        val num1 = num1.reversed()
        val num2 = num2.reversed()

        val result = mutableListOf<String>()
        repeat(m) { i ->
            val sb = StringBuilder()
            repeat(i) { sb.append('0') }

            var carry = 0
            repeat(n) { j ->
                val x = (num1[i] - '0') * (num2[j] - '0') + carry
                sb.append(x % 10)
                carry = x / 10
            }
            if (carry > 0) { sb.append(carry) }
            result.add(sb.toString())
        }

        var sum = "0"
        for (i in 0 until result.size) {
            sum = add(sum, result[i])
        }
        return sum.reversed()
    }

    private fun add(num1: String, num2: String): String {
        val m = num1.length
        val n = num2.length
        val len = Math.max(m, n)

        var carry = 0
        val sb = StringBuilder()
        for (i in 0 until len) {
            val a = if (i < m) { num1[i] - '0' } else { 0 }
            val b = if (i < n) { num2[i] - '0' } else { 0 }

            val x = a + b + carry
            sb.append(x % 10)
            carry = x / 10
        }
        if (carry > 0) { sb.append(carry) }
        return sb.toString()
    }
}

fun main(args: Array<String>) {
    val sol = MultiplyStrings()
    println(sol.multiply("2", "3"))
    println(sol.multiply("123", "456"))
}