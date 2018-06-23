package leetcode

/**
 * https://leetcode.com/problems/balanced-binary-tree/
 *
 * #dfs
 */
class BalancedBinaryTree {
    fun isBalanced(root: TreeNode?): Boolean {
        if (root == null) {
            return true
        }

        val leftDepth = depth(root.left)
        val rightDepth = depth(root.right)

        return Math.abs(leftDepth - rightDepth) <= 1
                && isBalanced(root.left)
                && isBalanced(root.right)
    }

    private fun depth(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }
        return 1 + Math.max(depth(root.left), depth(root.right))
    }
}

fun main(args: Array<String>) {
    val sol = BalancedBinaryTree()
    println(sol.isBalanced(createTreeNodes(3, 9, 20, null, null, 15, 7)))
    println(sol.isBalanced(createTreeNodes(1, 2, 2, 3, 3, null, null, 4, 4)))
    println(sol.isBalanced(createTreeNodes(1, null, 2, null, 3)))
    println(sol.isBalanced(createTreeNodes(1, 2, 2, 3, null, null, 3, 4, null, null, 4)))
}