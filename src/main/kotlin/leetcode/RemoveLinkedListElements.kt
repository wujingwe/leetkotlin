package leetcode

/** https://leetcode.com/problems/remove-linked-list-elements/ */
class RemoveLinkedListElements {
    fun removeElements(head: ListNode?, `val`: Int): ListNode? {
        val dummy = ListNode(-1)
        dummy.next = head

        var prev: ListNode? = dummy
        var curr = head
        while (curr != null) {
            if (curr.`val` == `val`) {
                prev?.next = curr.next
            } else {
                prev = prev?.next
            }
            curr = curr.next
        }
        return dummy.next
    }
}

fun main(args: Array<String>) {
    val sol = RemoveLinkedListElements()
    printListNode(sol.removeElements(createListNode(1, 2, 6, 3, 4, 5, 6), 6))
}
