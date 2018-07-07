package leetcode

import java.util.*

/**
 * https://leetcode.com/problems/merge-k-sorted-lists/
 *
 * #heap
 */
class MergeKSortedLists {
    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        val queue = PriorityQueue<ListNode> { x, y -> x.`val` - y.`val`}

        lists.forEach {
            var current = it
            while (current != null) {
                queue.add(current)
                current = current.next
            }
        }

        val dummy = ListNode(-1)
        var head = dummy

        while (queue.isNotEmpty()) {
            val node = queue.poll()
            node.next = null
            head.next = node
            head = node
        }
        return dummy.next
    }
}

fun main(args: Array<String>) {
    val sol = MergeKSortedLists()
    printListNode(sol.mergeKLists(
            arrayOf(
                    createListNode(1, 4, 5),
                    createListNode(1, 3, 4),
                    createListNode(2, 6))))
    printListNode(sol.mergeKLists(
            arrayOf(
                    createListNode(-2, -1, -1, -1),
                    null)))
}
