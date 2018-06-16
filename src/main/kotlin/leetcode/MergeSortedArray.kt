package leetcode

class MergeSortedArray {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var index1 = m - 1
        var index2 = n - 1

        for (i in m + n - 1 downTo 0) {
            when {
                index2 < 0 -> {
                    return
                }
                index1 < 0 -> {
                    nums1[i] = nums2[index2--]
                }
                nums1[index1] > nums2[index2] -> {
                    nums1[i] = nums1[index1--]
                }
                else -> {
                    nums1[i] = nums2[index2--]
                }
            }
        }
    }
}

fun main(args: Array<String>) {
    val sol = MergeSortedArray()
    val array1 = intArrayOf(1, 2, 3, 0, 0, 0)
    sol.merge(array1, 3, intArrayOf(2, 5, 6), 3)
    println(array1.toList())

    val array2 = intArrayOf(1)
    sol.merge(array2, 1, intArrayOf(), 0)
    println(array2.toList())

    val array3 = intArrayOf(4, 5, 6, 0, 0, 0)
    sol.merge(array3, 3, intArrayOf(1, 2, 3), 3)
    println(array3.toList())
}