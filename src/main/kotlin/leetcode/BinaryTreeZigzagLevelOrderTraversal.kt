package leetcode

/** https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/ */
class BinaryTreeZigzagLevelOrderTraversal {
    fun zigzagLevelOrder(root: TreeNode?): List<List<Int>> {
        if (root == null) {
            return emptyList()
        }

        val result = mutableListOf<List<Int>>()
        val queue = mutableListOf<TreeNode>()
        queue.add(root)

        var ltr = true
        while (queue.isNotEmpty()) {
            var size = queue.size
            val list = mutableListOf<Int>()

            while (size > 0) {
                val node = queue.removeAt(0)
                if (ltr) {
                    list.add(node.`val`)
                } else {
                    list.add(0, node.`val`)
                }

                arrayOf(node.left, node.right).forEach {
                    it?.let { queue.add(it) }
                }
                size--
            }

            result.add(list)
            ltr = !ltr
        }
        return result
    }
}

fun main(args: Array<String>) {
    val sol = BinaryTreeZigzagLevelOrderTraversal()
    println(sol.zigzagLevelOrder(createTreeNodes(3, 9, 20, null, null, 15, 7)))
    println(sol.zigzagLevelOrder(createTreeNodes(1, 2, 3, 4, 5)))
}