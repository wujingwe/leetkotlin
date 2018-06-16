package leetcode

/** https://leetcode.com/problems/add-binary/ */
class AddBinary {
    fun addBinary(a: String, b: String): String {
        var lenA = a.length - 1
        var lenB = b.length - 1
        val sb = StringBuilder()

        var carry = 0
        while (lenA >= 0 || lenB >= 0) {
            val x = if (lenA >= 0) { a[lenA--] - '0' } else { 0 }
            val y = if (lenB >= 0) { b[lenB--] - '0' } else { 0 }
            val sum = x + y + carry

            sb.append(sum % 2)
            carry = sum / 2
        }
        if (carry != 0) { sb.append(carry) }

        return sb.reverse().toString()
    }
}

fun main(args: Array<String>) {
    val sol = AddBinary()
    println(sol.addBinary("11", "1"))
    println(sol.addBinary("1010", "1011"))
}