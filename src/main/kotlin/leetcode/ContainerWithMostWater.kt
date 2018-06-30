package leetcode

/** https://leetcode.com/problems/container-with-most-water/ */
class ContainerWithMostWater {
    fun maxArea(height: IntArray): Int {
        var maxArea = Int.MIN_VALUE
        var left = 0
        var right = height.size - 1

        while (left < right) {
            val h = Math.min(height[left], height[right])
            maxArea = Math.max(maxArea, h * (right - left))

            if (height[left] <= height[right]) {
                left++
            } else {
                right--
            }
        }
        return maxArea
    }
}

fun main(args: Array<String>) {
    val sol = ContainerWithMostWater()
    println(sol.maxArea(intArrayOf(1, 1)))
    println(sol.maxArea(intArrayOf(1, 7, 6, 1)))
}