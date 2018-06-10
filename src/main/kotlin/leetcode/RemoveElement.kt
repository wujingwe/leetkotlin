package leetcode

/** https://leetcode.com/problems/remove-element/ */
class RemoveElement {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var index = 0
        for (i in 0 until nums.size) {
            if (nums[i] != `val`) {
                nums[index++] = nums[i]
            }
        }
        return index
    }
}

fun main(args: Array<String>) {
    val sol = RemoveElement()
    val array = intArrayOf(3, 2, 2, 3)
    val result = sol.removeElement(array, 3)
    println("$result")

    for (i in 0 until result) {
        print("${array[i]}, ")
    }
    println()
}