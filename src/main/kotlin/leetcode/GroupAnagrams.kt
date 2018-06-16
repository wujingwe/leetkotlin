package leetcode

/**
 * https://leetcode.com/problems/group-anagrams/
 *
 * Performance: String.toCharArray() is faster than String.toList()
 */
class GroupAnagrams {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = strs.groupBy { s ->
            s.toCharArray().sorted().toString()
        }
        return map.values.toList()
    }
}

fun main(args: Array<String>) {
    val sol = GroupAnagrams()
    println(sol.groupAnagrams(arrayOf("eat", "tea", "tan", "ate", "nat", "bat")))
}