package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ZigZagConvertTest {

    @Test
    fun `ZigZag Conversion`() {
        val sol = ZigZagConvert()

        assertThat(sol.convert("PAYPALISHIRING", 3)).isEqualTo("PAHNAPLSIIGYIR")
        assertThat(sol.convert("PAYPALISHIRING", 4)).isEqualTo("PINALSIGYAHRPI")
        assertThat(sol.convert("A", 1)).isEqualTo("A")
    }
}