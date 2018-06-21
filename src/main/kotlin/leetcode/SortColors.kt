package leetcode

/** https://leetcode.com/problems/sort-colors/ */
class SortColors {
    fun sortColors(nums: IntArray): Unit {
        var p0 = 0
        var p2 = nums.size - 1

        var i = 0
        while (i < p2) {
            when {
                nums[i] == 0 -> nums.swap(p0++, i++)
                nums[i] == 2 -> nums.swap(i, p2--)
                else -> i++
            }
        }
    }

    fun IntArray.swap(i: Int, j: Int) {
        this[i] = this[j].also { this[j] = this[i] }
    }
}

fun main(args: Array<String>) {
    val sol = SortColors()
    val array1 = intArrayOf(2, 0, 2, 1, 1, 0)
    sol.sortColors(array1)
    println(array1.toList())

    val array2 = intArrayOf(1, 0, 1)
    sol.sortColors(array2)
    println(array2.toList())

    val array3 = intArrayOf(0)
    sol.sortColors(array3)
    println(array3.toList())
}
