package leetcode

/** https://leetcode.com/problems/maximum-depth-of-binary-tree/description/ */
class MaximumDepthOfBinaryTree {
    fun maxDepth(root: TreeNode?): Int {
        return dfs(root, 0)
    }

    private fun dfs(root: TreeNode?, depth: Int): Int {
        if (root == null) {
            return depth
        }

        return Math.max(
                dfs(root.left, depth + 1),
                dfs(root.right, depth + 1))
    }
}

fun main(args: Array<String>) {
    val sol = MaximumDepthOfBinaryTree()
    println(sol.maxDepth(createTreeNodes(3, 9, 20, null, null, 15, 7)))
}