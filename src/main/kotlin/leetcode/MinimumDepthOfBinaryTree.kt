package leetcode

/** https://leetcode.com/problems/minimum-depth-of-binary-tree/ */
class MinimumDepthOfBinaryTree {
    fun minDepth(root: TreeNode?): Int {
        root ?: let { return 0 }

        var depth = 1
        val parents = mutableListOf(root)
        val children = mutableListOf<TreeNode>()
        while (parents.isNotEmpty()) {
            val node = parents.removeAt(0)
            if (node.left == null && node.right == null) {
                return depth
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

                depth++
            }
        }
        return depth
    }
}

fun main(args: Array<String>) {
    val sol = MinimumDepthOfBinaryTree()
    println(sol.minDepth(createTreeNodes(3, 9, 20, null, null, 15, 7)))
    println(sol.minDepth(createTreeNodes(1, 2)))
    println(sol.minDepth(createTreeNodes(1, 2, 3, 4, 5)))
}
