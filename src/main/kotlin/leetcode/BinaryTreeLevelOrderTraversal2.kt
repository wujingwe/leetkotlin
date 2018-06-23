package leetcode

/** https://leetcode.com/problems/binary-tree-level-order-traversal-ii/ */
class BinaryTreeLevelOrderTraversal2 {
    fun levelOrderBottom(root: TreeNode?): List<List<Int>> {
        if (root == null) return emptyList()

        val parents = mutableListOf<TreeNode>()
        val children = mutableListOf<TreeNode>()
        val result = mutableListOf<List<Int>>()
        parents.add(root)

        val list = mutableListOf<Int>()
        while (parents.isNotEmpty()) {
            val node = parents.removeAt(0)
            list.add(node.`val`)

            if (parents.isEmpty()) {
                result.add(0, list.toList())
                list.clear()
            }

            if (node.left != null) {
                children.add(node.left!!)
            }
            if (node.right != null) {
                children.add(node.right!!)
            }

            if (parents.isEmpty()) {
                children.forEach { parents.add(it) }
                children.clear()
            }
        }

        return result
    }
}

fun main(args: Array<String>) {
    val sol = BinaryTreeLevelOrderTraversal2()
    println(sol.levelOrderBottom(createTreeNodes(3, 9, 20, null, null, 15, 7)))
    println(sol.levelOrderBottom(createTreeNodes(1, 2)))
    println(sol.levelOrderBottom(createTreeNodes(1)))
    println(sol.levelOrderBottom(createTreeNodes(1, 2, null, 3, null, 4, null, 5)))
    println(sol.levelOrderBottom(createTreeNodes(1, 2, 3, 4, 5)))
}
