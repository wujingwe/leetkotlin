package leetcode

class TreeNode(var `val`: Int = 0) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun createTreeNodes(vararg nums: Int?): TreeNode {
    val queue = mutableListOf<TreeNode>()
    val head = TreeNode(nums[0]!!)
    queue.add(head)

    var index = 1
    while (index < nums.size - 1) {
        val node = queue.removeAt(0)
        if (nums[index] != null) {
            node.left = TreeNode(nums[index]!!)
            queue.add(node.left!!)
        }
        if (nums[index + 1] != null) {
            node.right = TreeNode(nums[index + 1]!!)
            queue.add(node.right!!)
        }
        index += 2
    }
    return head
}

fun printTreeNode(node: TreeNode) {
    val queue = mutableListOf(node)

    while (queue.isNotEmpty()) {
        val head = queue.removeAt(0)
        print("$head -> ")

        if (head.left != null) {
            queue.add(head.left!!)
        }
        if (head.right != null) {
            queue.add(head.right!!)
        }
    }
}
