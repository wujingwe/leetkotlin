package leetcode

/**
 * https://leetcode.com/problems/symmetric-tree/description/
 *
 * #dfs
 */
class SymmetricTree {
    fun isSymmetric(root: TreeNode?): Boolean {
        return dfs(root?.left, root?.right)
    }

    private fun dfs(left: TreeNode?, right: TreeNode?): Boolean {
        if (left == null && right == null) {
            return true
        }
        if (left?.`val` != right?.`val`) {
            return false
        }
        return dfs(left?.left, right?.right) && dfs(left?.right, right?.left)
    }
}


fun main(args: Array<String>) {
    val sol = SymmetricTree()
    println(sol.isSymmetric(createTreeNodes(1, 2, 2, 3, 4, 4, 3)))
    println(sol.isSymmetric(createTreeNodes(1, 2, 2, null, 3, null, 3)))
}
