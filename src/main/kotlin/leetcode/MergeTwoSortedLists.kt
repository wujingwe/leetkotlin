package leetcode

/** https://leetcode.com/problems/merge-two-sorted-lists/ */
class MergeTwoSortedLists {
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        if (l1 == null) return l2
        if (l2 == null) return l1

        var head1 = l1
        var head2 = l2

        val head = ListNode(-1)
        var current = head
        while (head1 != null && head2 != null) {
            if (head1.`val` < head2.`val`) {
                current.next = head1
                head1 = head1.next
            } else {
                current.next = head2
                head2 = head2.next
            }
            current = current.next!!
        }
        current.next = if (head1 != null) { head1 } else { head2 }

        return head.next
    }
}

fun main(args: Array<String>) {
    val sol = MergeTwoSortedLists()
    val result = sol.mergeTwoLists(
            createListNode(1, 2, 4),
            createListNode(1, 3, 4))
    printListNode(result)
}