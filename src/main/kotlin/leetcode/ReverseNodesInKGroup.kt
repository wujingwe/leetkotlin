package leetcode

/**
 * https://leetcode.com/problems/reverse-nodes-in-k-group/
 *
 * Reverse a linked list: https://www.geeksforgeeks.org/reverse-a-linked-list/
 */
class ReverseNodesInKGroup {
    fun reverseKGroup(head: ListNode?, k: Int): ListNode? {
        var count = 0
        var current = head
        while (count < k && current != null) {
            count++
            current = current.next
        }

        if (count == k) {
            var prev: ListNode? = reverseKGroup(current, k)
            var curr = head
            while (count-- > 0) {
                val next = curr?.next
                curr?.next = prev
                prev = curr
                curr = next
            }

            return prev
        }
        return head
    }
}

fun main(args: Array<String>) {
    val sol = ReverseNodesInKGroup()
    printListNode(sol.reverseKGroup(createListNode(1, 2, 3, 4, 5), 2))
    printListNode(sol.reverseKGroup(createListNode(1, 2, 3, 4, 5), 3))
}