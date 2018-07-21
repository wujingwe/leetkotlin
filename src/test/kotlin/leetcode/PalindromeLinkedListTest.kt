package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class PalindromeLinkedListTest {

    @Test
    fun `Palindrome Linked List`() {
        val sol = PalindromeLinkedList()
        assertThat(sol.isPalindrome(createListNode(1, 2, 3, 4))).isEqualTo(false)
        assertThat(sol.isPalindrome(createListNode(1, 2))).isEqualTo(false)
        assertThat(sol.isPalindrome(createListNode(1, 2, 2, 1))).isEqualTo(true)
    }
}
