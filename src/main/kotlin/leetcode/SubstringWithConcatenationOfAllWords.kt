package leetcode

/** https://leetcode.com/problems/substring-with-concatenation-of-all-words/ */
class SubstringWithConcatenationOfAllWords {
    fun findSubstring(s: String, words: Array<String>): List<Int> {
        if (s.isEmpty() || words.isEmpty()) { return emptyList() }

        val wordLength = words[0].length
        if (s.length < wordLength) { return emptyList() }

        val result = mutableListOf<Int>()
        var map1 = mutableMapOf<String, Int>()

        for (w in words) {
            map1[w] = map1.getOrElse(w) { 0 } + 1
        }
        val map = HashMap(map1)

        var index = 0
        var count = 0

        do {
            val i = index + count * wordLength
            val subString = s.substring(i, i + wordLength)
            if (map1[subString] != null && map1[subString]!! > 0) {
                count++

                map1[subString] = map1[subString]!! - 1
            } else {
                index++

                // reset
                map1 = HashMap(map)
                count = 0
                continue
            }

            if (count == words.size) {
                result.add(index)
                index++

                // reset
                map1 = HashMap(map)
                count = 0
            }
        } while (index + count * wordLength <= s.length - wordLength)

        return result
    }
}

fun main(args: Array<String>) {
    val sol = SubstringWithConcatenationOfAllWords()
    println(sol.findSubstring("barfoothefoobarman", arrayOf("foo", "bar")))
    println(sol.findSubstring("wordgoodstudentgoodword", arrayOf("word", "student")))
    println(sol.findSubstring("wordgoodgoodgoodbestword", arrayOf("word", "good", "best", "word")))
    println(sol.findSubstring("", arrayOf()))
    println(sol.findSubstring("a", arrayOf()))
    println(sol.findSubstring("mississippi", arrayOf("mississippis")))
    println(sol.findSubstring("barfoofoobarthefoobarman", arrayOf("bar", "foo", "the")))
    println(sol.findSubstring("wordgoodgoodgoodbestword", arrayOf("word", "good", "best", "good")))
}
