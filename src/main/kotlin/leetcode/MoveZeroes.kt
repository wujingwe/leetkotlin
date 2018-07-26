package leetcode

/** https://leetcode.com/problems/move-zeroes/ */
class MoveZeroes {
    fun moveZeroes(nums: IntArray): Unit {
        var p2 = 0

        for (i in 0 until nums.size) {
            if (nums[i] != 0) {
                nums[p2++] = nums[i]
            }
        }
        repeat(nums.size - p2) {
            nums[p2 + it] = 0
        }
    }
}

fun main(args: Array<String>) {
    val sol = MoveZeroes()

    val array1 = intArrayOf(0, 1, 0, 3, 12)
    sol.moveZeroes(array1)
    println(array1.toList())

    val array2 = intArrayOf(1)
    sol.moveZeroes(array2)
    println(array2.toList())
}
