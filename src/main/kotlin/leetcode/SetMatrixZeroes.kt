package leetcode

/**
 * https://leetcode.com/problems/set-matrix-zeroes/
 *
 * explanation: https://leetcode.com/problems/set-matrix-zeroes/discuss/26014/Any-shorter-O(1)-space-solution
 */
class SetMatrixZeroes {
    fun setZeroes(matrix: Array<IntArray>): Unit {
        val m = matrix.size
        val n = matrix[0].size

        var fr = false
        var fc = false
        for (i in 0 until m) {
            for (j in 0 until n) {
                if (matrix[i][j] == 0) {
                    if (i == 0) fr = true
                    if (j == 0) fc = true
                    matrix[i][0] = 0
                    matrix[0][j] = 0
                }
            }
        }

        for (i in 1 until m) {
            if (matrix[i][0] == 0) {
                for (j in 1 until n) {
                    matrix[i][j] = 0
                }
            }
        }

        for (i in 1 until n) {
            if (matrix[0][i] == 0) {
                for (j in 1 until m) {
                    matrix[j][i] = 0
                }
            }
        }

        if (fr) {
            for (i in 0 until n) {
                matrix[0][i] = 0
            }
        }
        if (fc) {
            for (i in 0 until m) {
                matrix[i][0] = 0
            }
        }
    }
}

fun main(args: Array<String>) {
    val sol = SetMatrixZeroes()

    val array1 = arrayOf(
            intArrayOf(1, 1, 1),
            intArrayOf(1, 0, 1),
            intArrayOf(1, 1, 1))
    sol.setZeroes(array1)
    println(array1.map { it -> it.toList() })

    val array2 = arrayOf(
            intArrayOf(0, 1, 2, 0),
            intArrayOf(3, 4, 5, 2),
            intArrayOf(1, 3, 1, 5))
    sol.setZeroes(array2)
    println(array2.map { it -> it.toList() })

    val array3 = arrayOf(
            intArrayOf(1, 0, 3))
    sol.setZeroes(array3)
    println(array3.map { it -> it.toList() })
}
