package leetcode

/** https://leetcode.com/problems/contains-duplicate/ */
class ContainsDuplicate {
    fun containsDuplicate(nums: IntArray): Boolean {
        val set = mutableSetOf<Int>()
        for (num in nums) {
            if (set.contains(num)) {
                return true
            }
            set.add(num)
        }
        return false
    }
}

fun main(args: Array<String>) {
    val sol = ContainsDuplicate()
    println(sol.containsDuplicate(intArrayOf(1, 2, 3, 1)))
    println(sol.containsDuplicate(intArrayOf(1, 2, 3, 4)))
    println(sol.containsDuplicate(intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)))
}