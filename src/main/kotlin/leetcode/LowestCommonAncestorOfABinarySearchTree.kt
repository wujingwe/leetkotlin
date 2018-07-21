package leetcode

/** https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/ */
class LowestCommonAncestorOfABinarySearchTree {
    fun lowestCommonAncestor(root: TreeNode, p: TreeNode, q: TreeNode): TreeNode {
        val min = Math.min(p.`val`, q.`val`)
        val max = Math.max(p.`val`, q.`val`)

        if (root.`val` in min..max) {
            return root
        }
        return if (root.`val` > max) {
            lowestCommonAncestor(root.left!!, p, q)
        } else {
            lowestCommonAncestor(root.right!!, p, q)
        }
    }
}

fun main(args: Array<String>) {
    val sol = LowestCommonAncestorOfABinarySearchTree()
    println(sol.lowestCommonAncestor(
            createTreeNodes(6, 2, 8, 0, 4, 7, 9, null, null, 3, 5),
            TreeNode(2),
            TreeNode(8)).`val`)

    println(sol.lowestCommonAncestor(
            createTreeNodes(6, 2, 8, 0, 4, 7, 9, null, null, 3, 5),
            TreeNode(2),
            TreeNode(4)).`val`)
}
