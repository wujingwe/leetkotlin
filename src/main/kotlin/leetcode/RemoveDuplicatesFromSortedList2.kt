package leetcode

/** https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/ */
class RemoveDuplicatesFromSortedList2 {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        if (head == null) { return null }
        val dummy = ListNode(-1)
        dummy.next = head

        var current = dummy
        while (current.next != null && current.next!!.next != null) {
            val first = current.next
            var next = current.next?.next

            if (first?.`val` == next?.`val`) {
                while (first?.`val` == next?.`val`) {
                    next = next?.next
                }
                current.next = next
            } else {
                current = current.next!!
            }
        }
        return dummy.next
    }
}

fun main(args: Array<String>) {
    val sol = RemoveDuplicatesFromSortedList2()
    printListNode(sol.deleteDuplicates(createListNode(1, 2, 3, 3, 4, 4, 5)))
    printListNode(sol.deleteDuplicates(createListNode(1, 1, 1, 2, 3)))
    printListNode(sol.deleteDuplicates(createListNode(1, 2, 3)))
}
