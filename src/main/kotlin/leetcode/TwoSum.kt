package leetcode

/** https://leetcode.com/problems/two-sum/ */
class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        nums.forEachIndexed { i, x ->
            val need = target - x
            if (map.containsKey(need)) {
                return intArrayOf(map[need]!!, i)
            }
            map[x] = i
        }
        return intArrayOf()
    }
}

fun main(args: Array<String>) {
    val sol = TwoSum()
    val result = sol.twoSum(intArrayOf(2, 7, 11, 15), 9)
    println("[${result[0]}, ${result[1]}]")
}