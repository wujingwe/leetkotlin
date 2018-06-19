package leetcode

/**
 * https://leetcode.com/problems/search-a-2d-matrix/
 *
 * #binary search
 */
class Search2DMatrix {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        if (matrix.isEmpty() || matrix[0].isEmpty()) {
            return false
        }

        val m = matrix.size
        val n = matrix[0].size
        var begin = 0
        var end = m - 1

        while (begin < end) {
            val mid = begin + (end - begin) / 2
            if (matrix[mid][0] <= target && matrix[mid][n - 1] >= target) {
                return bsearch(matrix[mid], target)
            }
            if (matrix[mid][0] > target) {
                end = mid - 1
            }
            if (matrix[mid][n - 1] < target) {
                begin = mid + 1
            }
        }
        return bsearch(matrix[begin], target)
    }

    private fun bsearch(array: IntArray, target: Int): Boolean {
        var begin = 0
        var end = array.size - 1

        while (begin < end) {
            val mid = begin + (end - begin) / 2
            if (array[mid] == target) {
                return true
            }
            if (array[mid] > target) {
                end = mid - 1
            }
            if (array[mid] < target) {
                begin = mid + 1
            }
        }
        return array[begin] == target
    }
}

fun main(args: Array<String>) {
    val sol = Search2DMatrix()
    println(sol.searchMatrix(arrayOf(
            intArrayOf(1, 3, 5, 7),
            intArrayOf(10, 11, 16, 20),
            intArrayOf(23, 30, 34, 50)), 3))

    println(sol.searchMatrix(arrayOf(
            intArrayOf(1, 3, 5, 7),
            intArrayOf(10, 11, 16, 20),
            intArrayOf(23, 30, 34, 50)), 13))

    println(sol.searchMatrix(arrayOf(
            intArrayOf(1)), 1))
}
