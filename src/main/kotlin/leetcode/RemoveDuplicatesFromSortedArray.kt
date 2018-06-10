package leetcode

/** https://leetcode.com/problems/remove-duplicates-from-sorted-array/ */
class RemoveDuplicatesFromSortedArray {

    // Two pointers
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        if (nums.size == 1) return 1

        var index = 1
        for (i in 1 until nums.size) {
            if (nums[i] != nums[i-1]) {
                nums[index++] = nums[i]
            }
        }
        return index
    }
}

fun main(args: Array<String>) {
    val sol = RemoveDuplicatesFromSortedArray()
    val nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
    val result = sol.removeDuplicates(nums)
    println(result)

    for (i in 0 until nums.size) {
        print("${nums[i]}, ")
    }
    println()
}