package leetcode

/** https://leetcode.com/problems/3sum/ */
class ThreeSum {
    fun threeSum(nums: IntArray): List<List<Int>> {
        nums.sort()

        val size = nums.size
        val result = mutableListOf<List<Int>>()
        for (i in 0..size - 2) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue
            }
            var begin = i + 1
            var end = size - 1

            while (begin < end) {
                val sum = nums[begin] + nums[end] + nums[i]
                when {
                    (sum == 0) -> {
                        result.add(listOf(nums[i], nums[begin], nums[end]))
                        begin++
                        end--

                        while (begin < end && nums[begin] == nums[begin - 1]) {
                            begin++
                        }
                        while (end > begin && nums[end] == nums[end + 1]) {
                            end--
                        }
                    }
                    (sum > 0) -> end--
                    else -> begin++
                }
            }
        }
        return result
    }
}

fun main(args: Array<String>) {
    val sol = ThreeSum()
    println(sol.threeSum(intArrayOf(-1, 0, 1, 2, -1, -4)))
}