package leetcode

class ListNode(var `val`: Int = 0) {
    var next: ListNode? = null
}

fun createListNode(vararg nums: Int) : ListNode {
    val result = ListNode(nums[0])
    var curr = result
    for (i in 1 until nums.size) {
        curr.next = ListNode(nums[i])
        curr = curr.next!!
    }
    return result
}

fun printListNode(node: ListNode?) {
    val sb = StringBuilder()

    @Suppress("NAME_SHADOWING")
    var node = node
    while (node != null) {
        if (sb.isNotEmpty()) {
            sb.append(" -> ")
        }
        sb.append(node.`val`)

        node = node.next
    }
    println(sb)
}