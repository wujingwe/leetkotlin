package leetcode

class PascalTriangle {
    fun generate(numRows: Int): List<List<Int>> {
        val result = MutableList(numRows) {
            i -> MutableList(i + 1) { 0 }
        }
        for (i in 0 until numRows) {
            result[i][0] = 1
            result[i][i] = 1
            for (j in 1 until i) {
                result[i][j] = result[i - 1][j - 1] + result[i - 1][j]
            }
        }
        return result
    }
}

fun main(args: Array<String>) {
    val sol = PascalTriangle()
    println(sol.generate(5))
}
