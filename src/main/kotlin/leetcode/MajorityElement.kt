package leetcode

/** https://leetcode.com/problems/majority-element/ */
class MajorityElement {
    fun majorityElement(nums: IntArray): Int {
        var major = nums[0]
        var count = 1

        for (i in 1 until nums.size) {
            when {
                count == 0 -> {
                    major = nums[i]
                    count++
                }
                major == nums[i] -> count++
                else -> count--
            }
        }
        return major
    }
}

fun main(args: Array<String>) {
    val sol = MajorityElement()
    println(sol.majorityElement(intArrayOf(3, 2, 3)))
    println(sol.majorityElement(intArrayOf(2, 2, 1, 1, 1, 2, 2)))
    println(sol.majorityElement(intArrayOf(3, 3, 4)))
}
