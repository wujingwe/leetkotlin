package leetcode

/** https://leetcode.com/problems/4sum/ */
class FourSum {

    fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
        if (nums.size < 4) return emptyList()

        val ans = mutableListOf<List<Int>>()
        nums.sort()

        val max = nums[nums.size - 1]
        if (nums[0] * 4 > target || max * 4 < target) {
            return emptyList()
        }

        for (i in 0..nums.size - 4) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue // prevent duplication
            }
            if (4 * nums[i] > target) {
                break
            }
            if (nums[i] + 3 * max < target) {
                continue
            }

            for (j in i+1..nums.size - 3) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue // prevent duplication
                }

                val expect = target - nums[i] - nums[j]

                for (k in j+1..nums.size - 2) {
                    if (k > j + 1 && nums[k] == nums[k - 1]) {
                        continue // prevent duplication
                    }

                    val result = twoSum(nums, k, expect)
                    if (result != null) {
                        ans.add(listOf(nums[i], nums[j], result[0], result[1]))
                    }
                }
            }
        }
        return ans
    }

    private fun twoSum(nums: IntArray, index: Int, target: Int): IntArray? {
        val x = nums[index]
        for (i in index+1 until nums.size) {
            val need = target - x
            if (need == nums[i]) {
                return intArrayOf(x, need)
            }
        }
        return null
    }
}

fun main(args: Array<String>) {
    val sol = FourSum()
    println("${sol.fourSum(intArrayOf(1, 0, -1, 0, -2, 2), 0)}")
    println("${sol.fourSum(intArrayOf(0, 0, 0, 0), 0)}")
    println("${sol.fourSum(intArrayOf(-3, -2, -1, 0, 0, 1, 2, 3), 0)}")
    println("${sol.fourSum(intArrayOf(-1, -5, -5, -3, 2, 5, 0, 4), -7)}")
}