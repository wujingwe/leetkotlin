package leetcode

/** https://leetcode.com/problems/remove-duplicates-from-sorted-list/ */
class RemoveDuplicatesFromSortedList {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        if (head == null) return head
        if (head.next == null) return head

        val dummy = ListNode(-1)
        dummy.next = head

        var curr = head
        while (curr != null && curr.next != null) {
            if (curr.`val` == curr.next!!.`val`) {
                curr.next = curr.next!!.next
            } else {
                curr = curr.next
            }
        }
        return dummy.next
    }
}

fun main(args: Array<String>) {
    val sol = RemoveDuplicatesFromSortedList()
    printListNode(sol.deleteDuplicates(createListNode(1, 1, 2)))
    printListNode(sol.deleteDuplicates(createListNode(1, 1, 2, 3, 3)))
    printListNode(sol.deleteDuplicates(createListNode(1, 1, 1)))
}