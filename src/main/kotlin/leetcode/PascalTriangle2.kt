package leetcode

/** https://leetcode.com/problems/pascals-triangle-ii/ */
class PascalTriangle2 {
    fun getRow(rowIndex: Int): List<Int> {
        val result = MutableList(rowIndex + 1) { 0 }
        result[0] = 1
        for (i in 1..rowIndex) {
            result[i] = 1
            for (j in i - 1 downTo 1) {
                result[j] += result[j - 1]
            }
        }
        return result
    }
}

fun main(args: Array<String>) {
    val sol = PascalTriangle2()
    println(sol.getRow(3))
    println(sol.getRow(4))
}
