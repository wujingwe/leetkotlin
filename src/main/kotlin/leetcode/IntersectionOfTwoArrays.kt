package leetcode

/** 349. Intersection of Two Arrays (https://leetcode.com/problems/intersection-of-two-arrays/) */
class IntersectionOfTwoArrays {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        return nums1.intersect(nums2.asIterable()).toIntArray()
    }
}

fun main(args: Array<String>) {
    val sol = IntersectionOfTwoArrays()
    println(sol.intersection(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2)).toList())
}
