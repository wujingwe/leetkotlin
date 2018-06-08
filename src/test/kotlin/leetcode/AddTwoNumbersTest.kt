package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class AddTwoNumbersTest {

    @Test
    fun `Add Two Numbers`() {
        val l1 = createListNode(2, 4, 3)
        val l2 = createListNode(5, 6, 4)
        val sol = AddTwoNumbers()
        val result = sol.addTwoNumbers(l1, l2)

        assertThat(result).isNotNull
        assertThat(result?.`val`).isEqualTo(7)
        assertThat(result?.next?.`val`).isEqualTo(0)
        assertThat(result?.next?.next?.`val`).isEqualTo(8)
    }

    @Test
    fun `Add Two Numbers (5+5)`() {
        val l1 = ListNode(5)
        val l2 = ListNode(5)

        val sol = AddTwoNumbers()
        val result = sol.addTwoNumbers(l1, l2)
        assertThat(result).isNotNull
        assertThat(result?.`val`).isEqualTo(0)
        assertThat(result?.next?.`val`).isEqualTo(1)
    }

    private fun createListNode(vararg nums: Int) : ListNode {
        val result = ListNode(nums[0])
        var curr = result
        for (i in 1 until nums.size) {
            curr.next = ListNode(nums[i])
            curr = curr.next!!
        }
        return result
    }
}