package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ExcelSheetColumnNumberTest {

    @Test
    fun `Excel Sheet Column Number`() {
        val sol = ExcelSheetColumnNumber()

        assertThat(sol.titleToNumber("A")).isEqualTo(1)
        assertThat(sol.titleToNumber("AB")).isEqualTo(28)
        assertThat(sol.titleToNumber("ZY")).isEqualTo(701)
    }
}