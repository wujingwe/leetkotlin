package leetcode

/** https://leetcode.com/problems/same-tree/ */
class SameTree {
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        if (p == null || q == null) {
            return p?.`val` == q?.`val`
        }

        return p.`val` == q.`val`
                && isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right)
    }
}

fun main(args: Array<String>) {
    val sol = SameTree()
    println(sol.isSameTree(createTreeNodes(1, 2, 3), createTreeNodes(1, 2, 3)))
    println(sol.isSameTree(createTreeNodes(1, 2), createTreeNodes(1, null, 2)))
    println(sol.isSameTree(createTreeNodes(1, 2, 1), createTreeNodes(1, 1, 2)))
}