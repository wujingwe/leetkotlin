package leetcode

/** https://leetcode.com/problems/remove-nth-node-from-end-of-list/ */
class RemoveNthFromEnd {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var first = head
        var second = head

        for (i in 0 until n) {
            first = first?.next
        }
        if (first == null) { // no enough nodes to consume
            return head?.next
        }

        while (first?.next != null) {
            first = first.next
            second = second?.next
        }
        second?.next = second?.next?.next

        return head
    }
}

fun main(args: Array<String>) {
    val sol = RemoveNthFromEnd()

    printListNode(sol.removeNthFromEnd(createListNode(1, 2, 3, 4, 5), 2))
    printListNode(sol.removeNthFromEnd(createListNode(1), 1))
    printListNode(sol.removeNthFromEnd(createListNode(1, 2), 1))
}