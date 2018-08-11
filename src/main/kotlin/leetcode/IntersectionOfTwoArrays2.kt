package leetcode

/** 350. Intersection of Two Arrays II (https://leetcode.com/problems/intersection-of-two-arrays-ii/) */
class IntersectionOfTwoArrays2 {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        var src = nums1
        var dst = nums2

        if (nums1.size > nums2.size) {
            src = nums2
            dst = nums1
        }

        val map = mutableMapOf<Int, Int>()
        for (num in src) {
           map[num] = map.getOrPut(num, {0}) + 1
        }

        val result = mutableListOf<Int>()
        for (num in dst) {
            if (map[num] != null && map[num]!! > 0) {
                result.add(num)
                map[num] = map[num]!! - 1
            }
        }
        return result.toIntArray()
    }
}

fun main(args: Array<String>) {
    val sol = IntersectionOfTwoArrays2()
    println(sol.intersect(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2)).toList())
    println(sol.intersect(intArrayOf(4, 9, 5), intArrayOf(9, 4, 9, 8, 4)).toList())
}
