package leetcode

/**
 * https://leetcode.com/problems/word-search/
 *
 * #backtracking
 */
class WordSearch {
    fun exist(board: Array<CharArray>, word: String): Boolean {
        val m = board.size
        val n = board[0].size

        for (i in 0 until m) {
            for (j in 0 until n) {
                if (backtrack(board, word, i, j, 0)) { return true }
            }
        }
        return false
    }

    private fun backtrack(board: Array<CharArray>, word: String, row: Int, col: Int, index: Int): Boolean {
        if (index == word.length) { return true }

        val m = board.size
        val n = board[0].size
        if (row < 0 || row >= m || col < 0 || col >= n || word[index] != board[row][col]) {
            return false
        }
        board[row][col] = board[row][col].toInt().xor(256).toChar()

        val result = backtrack(board, word, row - 1, col, index + 1)
                || backtrack(board, word, row + 1, col, index + 1)
                || backtrack(board, word, row, col - 1, index + 1)
                || backtrack(board, word, row, col + 1, index + 1)

        board[row][col] = board[row][col].toInt().xor(256).toChar()
        return result
    }
}

fun main(args: Array<String>) {
    val sol = WordSearch()

    println(sol.exist(arrayOf(
            charArrayOf('A','B','C','E'),
            charArrayOf('S','F','C','S'),
            charArrayOf('A','D','E','E')), "ABCCED"))

    println(sol.exist(arrayOf(
            charArrayOf('A','B','C','E'),
            charArrayOf('S','F','C','S'),
            charArrayOf('A','D','E','E')), "SEE"))

    println(sol.exist(arrayOf(
            charArrayOf('A','B','C','E'),
            charArrayOf('S','F','C','S'),
            charArrayOf('A','D','E','E')), "ABCB"))

    println(sol.exist(arrayOf(
            charArrayOf('a')), "a"))

    println(sol.exist(arrayOf(
            charArrayOf('a', 'b')), "ba"))
}