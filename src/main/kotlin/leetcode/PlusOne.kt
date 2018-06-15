package leetcode

/** https://leetcode.com/problems/plus-one/ */
class PlusOne {
    fun plusOne(digits: IntArray): IntArray {
        val list = digits.toMutableList()
        val size = digits.size
        var carry = 0
        list[size - 1] += 1
        for (i in list.size - 1 downTo 0) {
            val sum = list[i] + carry
            list[i] = sum % 10
            carry = sum / 10

            if (carry == 0) break
        }
        if (carry != 0) {
            list.add(0, 1)
        }
        return list.toIntArray()
    }
}

fun main(args: Array<String>) {
    val sol = PlusOne()
    println(sol.plusOne(intArrayOf(1, 2, 3)).toList())
    println(sol.plusOne(intArrayOf(4, 3, 2, 1)).toList())
    println(sol.plusOne(intArrayOf(9, 9)).toList())
}