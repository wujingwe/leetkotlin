package leetcode

/** https://leetcode.com/problems/binary-tree-paths/ */
class BinaryTreePaths {
    fun binaryTreePaths(root: TreeNode?): List<String> {
        val result = mutableListOf<String>()
        dfs(root, mutableListOf(), result)
        return result
    }

    private fun dfs(root: TreeNode?, paths: MutableList<Int>, result: MutableList<String>) {
        if (root != null) {
            paths.add(root.`val`)

            if (root.left != null) {
                dfs(root.left, paths, result)
            }
            if (root.right != null) {
                dfs(root.right, paths, result)
            }
            if (root.left == null && root.right == null) {
                val sb = StringBuilder()
                for (i in 0 until paths.size) {
                    if (sb.isNotEmpty()) {
                        sb.append("->")
                    }
                    sb.append(paths[i])
                }
                result.add(sb.toString())
            }
            paths.removeAt(paths.lastIndex)
        }
    }
}

fun main(args: Array<String>) {
    val sol = BinaryTreePaths()
    println(sol.binaryTreePaths(createTreeNodes(1, 2, 3, null, 5)))
}
