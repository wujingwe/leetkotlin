package leetcode

/** https://leetcode.com/problems/contains-duplicate-ii/ */
class ContainsDuplicate2 {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val map = mutableMapOf<Int, Int>()
        for (i in 0 until nums.size) {
            val n = nums[i]
            if (map.containsKey(n)) {
                if (i - map[n]!! <= k) {
                    return true
                }
            }
            map[n] = i
        }
        return false
    }
}


fun main(args: Array<String>) {
    val sol = ContainsDuplicate2()
    println(sol.containsNearbyDuplicate(intArrayOf(1, 2, 3, 1), 3))
    println(sol.containsNearbyDuplicate(intArrayOf(1, 0, 1, 1), 1))
    println(sol.containsNearbyDuplicate(intArrayOf(1, 2, 3, 1, 2, 3), 2))
}