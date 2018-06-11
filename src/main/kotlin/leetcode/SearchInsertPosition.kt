package leetcode

/** https://leetcode.com/problems/search-insert-position/ */
class SearchInsertPosition {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var begin = 0
        var end = nums.size - 1

        while (begin <= end) {
            val mid = (begin + end) / 2
            if (nums[mid] == target) return mid
            if (nums[mid] > target) end = mid - 1
            if (nums[mid] < target) begin = mid + 1
        }
        return begin
    }
}

fun main(args: Array<String>) {
    val sol = SearchInsertPosition()
    println(sol.searchInsert(intArrayOf(1, 3, 5, 6), 5))
    println(sol.searchInsert(intArrayOf(1, 3, 5, 6), 2))
    println(sol.searchInsert(intArrayOf(1, 3, 5, 6), 7))
    println(sol.searchInsert(intArrayOf(1, 3, 5, 6), 0))
}