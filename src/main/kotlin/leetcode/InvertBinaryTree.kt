package leetcode

/** https://leetcode.com/problems/invert-binary-tree/ */
class InvertBinaryTree {
    fun invertTree(root: TreeNode?): TreeNode? {
        if (root == null) {
            return null
        }
        val temp = root.left
        root.left = invertTree(root.right)
        root.right = invertTree(temp)
        return root
    }
}

fun main(args: Array<String>) {
    val sol = InvertBinaryTree()
    printTreeNode(sol.invertTree(createTreeNodes(4, 2, 7, 1, 3, 6, 9)))
}