package leetcode

/** https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/ */
class ConvertSortedArrayToBST {
    fun sortedArrayToBST(nums: IntArray): TreeNode? {
        return subSortedArrayToBST(nums, 0, nums.size - 1)
    }

    private fun subSortedArrayToBST(nums: IntArray, begin: Int, end: Int): TreeNode? {
        if (begin > end) {
            return null
        }

        val mid = begin + (end - begin) / 2
        val head = TreeNode(nums[mid])
        if (mid > begin) {
            head.left = subSortedArrayToBST(nums, begin, mid - 1)
        }
        if (mid < end) {
            head.right = subSortedArrayToBST(nums, mid + 1, end)
        }
        return head
    }
}

fun main(args: Array<String>) {
    val sol = ConvertSortedArrayToBST()
    printTreeNode(sol.sortedArrayToBST(intArrayOf(-10, -3, 0, 5, 9)))
    printTreeNode(sol.sortedArrayToBST(intArrayOf()))
}
