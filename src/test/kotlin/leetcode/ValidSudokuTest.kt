package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ValidSudokuTest {

    @Test
    fun `Valid Sudoku`() {
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
        assertThat(sol.isValidSudoku(array1)).isEqualTo(true)

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
        assertThat(sol.isValidSudoku(array2)).isEqualTo(false)

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
        assertThat(sol.isValidSudoku(array3)).isEqualTo(false)
    }
}
