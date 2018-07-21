package leetcode

/** https://leetcode.com/problems/palindrome-linked-list/ */
class PalindromeLinkedList {
    fun isPalindrome(head: ListNode?): Boolean {
        var p1 = head
        var p2 = head
        while (p2 != null) {
            p1 = p1?.next
            p2 = p2.next?.next
        }
        p1 = reverse(p1)

        p2 = head
        while (p1 != null) {
            if (p1.`val` != p2?.`val`) {
                return false
            }
            p1 = p1.next
            p2 = p2.next
        }
        return true
    }

    private fun reverse(head: ListNode?): ListNode? {
        var curr = head
        var prev: ListNode? = null

        while (curr != null) {
            val next = curr.next
            curr.next = prev
            prev = curr
            curr = next
        }
        return prev
    }
}

fun main(args: Array<String>) {
    val sol = PalindromeLinkedList()
    println(sol.isPalindrome(createListNode(1, 2, 3, 4)))
    println(sol.isPalindrome(createListNode(1, 2)))
    println(sol.isPalindrome(createListNode(1, 2, 2, 1)))
}
