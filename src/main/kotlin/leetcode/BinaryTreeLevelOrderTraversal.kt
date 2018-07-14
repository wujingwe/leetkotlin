package leetcode

/** https://leetcode.com/problems/binary-tree-level-order-traversal/ */
class BinaryTreeLevelOrderTraversal {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        if (root == null) {
            return emptyList()
        }

        val result = mutableListOf<List<Int>>()
        val queue = mutableListOf(root)
        while (queue.isNotEmpty()) {
            val size = queue.size
            val list = mutableListOf<Int>()
            repeat(size) {
                val node = queue.removeAt(0)
                list.add(node.`val`)

                arrayOf(node.left, node.right).forEach {
                    it?.let { queue.add(it) }
                }
            }
            result.add(list)
        }
        return result
    }
}

fun main(args: Array<String>) {
    val sol = BinaryTreeLevelOrderTraversal()
    println(sol.levelOrder(createTreeNodes(3, 9, 20, null, null, 15, 7)))
    println(sol.levelOrder(createTreeNodes(1, 2, 3, 4, 5)))
}