package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class MultiplyStringsTest {

    @Test
    fun `Multiply Strings`() {
        val sol = MultiplyStrings()
        assertThat(sol.multiply("2", "3")).isEqualTo("6")
        assertThat(sol.multiply("123", "456")).isEqualTo("56088")
    }
}
