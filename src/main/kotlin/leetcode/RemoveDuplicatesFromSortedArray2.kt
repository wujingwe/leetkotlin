package leetcode

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
 *
 * #two_pointers
 */
class RemoveDuplicatesFromSortedArray2 {
    fun removeDuplicates(nums: IntArray): Int {
        var noDuplicateIndex = 1
        var count = 0
        for (i in 1 until nums.size) {
            if (nums[i] == nums[i - 1]) {
                count++
            } else {
                count = 0
            }

            if (count < 2) {
                nums[noDuplicateIndex] = nums[i]
                noDuplicateIndex++
            }
        }
        return noDuplicateIndex
    }
}

fun main(args: Array<String>) {
    val sol = RemoveDuplicatesFromSortedArray2()
    val array1 = intArrayOf(1, 1, 1, 2, 2, 3)
    println(sol.removeDuplicates(array1))
    println(array1.toList())

    val array2 = intArrayOf(0, 0, 1, 1, 1, 1, 2, 3, 3)
    println(sol.removeDuplicates(array2))
    println(array2.toList())
}
