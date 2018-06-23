package leetcode

class TreeNode(var `val`: Int = 0) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun createTreeNodes(vararg nums: Int?): TreeNode {
    val queue = mutableListOf<TreeNode?>()
    val head = TreeNode(nums[0]!!)
    queue.add(head)

    var index = 1
    while (queue.isNotEmpty() && index < nums.size) {
        val node = queue.removeAt(0)

        if (node != null) {
            // left
            if (nums[index] != null) {
                node.left = TreeNode(nums[index]!!)
                queue.add(node.left)
            }
            index++

            // right
            if (index < nums.size && nums[index] != null) {
                node.right = TreeNode(nums[index]!!)
                queue.add(node.right)
            }
            index++
        }
    }
    return head
}

fun printTreeNode(node: TreeNode?) {
    val queue = mutableListOf(node)

    while (queue.isNotEmpty()) {
        val head = queue.removeAt(0)
        print("${head?.`val`}, ")

        if (head != null) {
            queue.add(head.left)
            queue.add(head.right)
        }
    }
}
