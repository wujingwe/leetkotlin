package leetcode

class PartitionList {
    fun partition(head: ListNode?, x: Int): ListNode? {
        val left =  ListNode(-1)
        var leftEnd: ListNode? = left

        val right = ListNode(-1)
        var rightEnd: ListNode? = right

        var current = head
        while (current != null) {
            if (current.`val` < x) {
                leftEnd?.next = current
                leftEnd = current
            } else {
                rightEnd?.next = current
                rightEnd = current
            }
            current = current.next
        }
        leftEnd?.next = right.next
        rightEnd?.next = null

        return left.next
    }
}

fun main(args: Array<String>) {
    val sol = PartitionList()
    printListNode(sol.partition(createListNode(1, 4, 3, 2, 5, 2), 3))
}
