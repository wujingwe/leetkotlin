package leetcode

/** https://leetcode.com/problems/path-sum/ */
class PathSum {
    fun hasPathSum(root: TreeNode?, sum: Int): Boolean {
        if (root == null) {
            return false
        }
        if (root.left == null && root.right == null && sum == root.`val`) {
            return true
        }
        return hasPathSum(root.left, sum - root.`val`) || hasPathSum(root.right, sum - root.`val`)
    }
}

fun main(args: Array<String>) {
    val sol = PathSum()
    println(sol.hasPathSum(createTreeNodes(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1), 22))
    println(sol.hasPathSum(null, 0))
}
