package leetcode

/** https://leetcode.com/problems/reverse-linked-list-ii/ */
class ReverseLinkedList2 {
    fun reverseBetween(head: ListNode?, m: Int, n: Int): ListNode? {
        val dummy = ListNode(-1)
        dummy.next = head

        var begin: ListNode? = dummy
        repeat(m - 1) { begin = begin?.next }
        val current = begin?.next
        val reverse = reverse(current, n - m + 1)
        begin?.next = reverse
        return dummy.next
    }

    private fun reverse(head: ListNode?, count: Int): ListNode? {
        var current = head
        var prev: ListNode? = null

        var count = count
        while (count > 0) {
            val next = current?.next
            current?.next = prev
            prev = current
            current = next
            count--
        }
        head?.next = current
        return prev
    }
}

fun main(args: Array<String>) {
    val sol = ReverseLinkedList2()
    printListNode(sol.reverseBetween(createListNode(1, 2, 3, 4, 5), 2, 4))
    printListNode(sol.reverseBetween(createListNode(3, 5), 1, 2))
}
