package leetcode

/** https://leetcode.com/problems/swap-nodes-in-pairs/ */
class SwapNodesInPairs {
    fun swapPairs(head: ListNode?): ListNode? {
        val dummy = ListNode(-1)
        dummy.next = head

        var head: ListNode? = dummy

        while (head?.next != null && head.next?.next != null) {
            val first = head.next
            val second = head.next?.next

            head.next = second
            first?.next = second?.next
            second?.next = first
            head = first

        }
        return dummy.next
    }
}

fun main(args: Array<String>) {
    val sol = SwapNodesInPairs()
    val result = sol.swapPairs(createListNode(1, 2, 3, 4))
    printListNode(result)
}