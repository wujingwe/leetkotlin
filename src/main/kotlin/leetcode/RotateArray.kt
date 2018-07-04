package leetcode

/** https://leetcode.com/problems/rotate-array/ */
class RotateArray {
    fun rotate(nums: IntArray, k: Int): Unit {
        val k = k % nums.size;
        reverse(nums, 0, nums.size - 1)
        reverse(nums, 0, k - 1)
        reverse(nums, k, nums.size - 1)
    }

    private fun reverse(nums: IntArray, start: Int, end: Int) {
        var start = start
        var end = end
        while (start < end) {
            val temp = nums[end]
            nums[end] = nums[start]
            nums[start] = temp
            start++
            end--
        }
    }
}


fun main(args: Array<String>) {
    val sol = RotateArray()

    val array1 = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    sol.rotate(array1, 3)
    println(array1.toList())

    val array2 = intArrayOf(-1, -100, 3, 99)
    sol.rotate(array2, 2)
    println(array2.toList())

    val array3 = intArrayOf(-1)
    sol.rotate(array3, 2)
    println(array3.toList())
}
