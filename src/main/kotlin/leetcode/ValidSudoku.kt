package leetcode

/** https://leetcode.com/problems/valid-sudoku/ */
class ValidSudoku {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        repeat(9) { i ->
            val rows = mutableSetOf<Char>()
            val cols = mutableSetOf<Char>()
            val squares = mutableSetOf<Char>()
            repeat(9) { j ->
                val rc = board[i][j]
                if (rc != '.' && !rows.add(rc)) {
                    return false
                }

                val cc = board[j][i]
                if (cc != '.' && !cols.add(cc)) {
                    return false
                }

                val row = 3 * (i / 3)
                val col = 3 * (i % 3)
                val sc = board[row + j / 3][col + j % 3]
                if (sc != '.' && !squares.add(sc)) {
                    return false
                }
            }
        }
        return true
    }
}

fun main(args: Array<String>) {
    val sol = ValidSudoku()

    val array1 = arrayOf(
            charArrayOf('5', '3', '.', '.', '7', '.', '.', '.', '.'),
            charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
            charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
            charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
            charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
            charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
            charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
            charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
            charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9'))
    println(sol.isValidSudoku(array1))

    val array2 = arrayOf(
            charArrayOf('8', '3', '.', '.', '7', '.', '.', '.', '.'),
            charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
            charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
            charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
            charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
            charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
            charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
            charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
            charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9'))
    println(sol.isValidSudoku(array2))

    val array3 = arrayOf(
            charArrayOf('.', '.', '.', '.', '5', '.', '.', '1', '.'),
            charArrayOf('.', '4', '.', '3', '.', '.', '.', '.', '.'),
            charArrayOf('.', '.', '.', '.', '.', '3', '.', '.', '1'),
            charArrayOf('8', '.', '.', '.', '.', '.', '.', '2', '.'),
            charArrayOf('.', '.', '2', '.', '7', '.', '.', '.', '.'),
            charArrayOf('.', '1', '5', '.', '.', '.', '.', '.', '.'),
            charArrayOf('.', '.', '.', '.', '.', '2', '.', '.', '.'),
            charArrayOf('.', '2', '.', '9', '.', '.', '.', '.', '.'),
            charArrayOf('.', '.', '4', '.', '.', '.', '.', '.', '.'))
    println(sol.isValidSudoku(array3))
}

