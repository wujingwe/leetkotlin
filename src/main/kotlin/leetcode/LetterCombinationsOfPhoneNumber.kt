package leetcode

/** https://leetcode.com/problems/letter-combinations-of-a-phone-number/ */
class LetterCombinationsOfPhoneNumber {

    companion object {
        val numToLetters = hashMapOf(
                '2' to listOf('a', 'b', 'c'),
                '3' to listOf('d', 'e', 'f'),
                '4' to listOf('g', 'h', 'i'),
                '5' to listOf('j', 'k', 'l'),
                '6' to listOf('m', 'n', 'o'),
                '7' to listOf('p', 'q', 'r', 's'),
                '8' to listOf('t', 'u', 'v'),
                '9' to listOf('w', 'x', 'y', 'z'))
    }

    fun letterCombinations(digits: String): List<String> {
        var result = mutableListOf<String>()

        for (d in digits) {
            val letters = numToLetters[d]
            if (letters != null) {
                if (result.isEmpty()) {
                    letters.map { c -> result.add(c.toString()) }
                } else {
                    val r = mutableListOf<String>()
                    result.forEach { s ->
                        letters.map { c -> r.add(s + c) }
                    }
                    result = r
                }
            }
        }
        return result
    }
}

fun main(args: Array<String>) {
    val sol = LetterCombinationsOfPhoneNumber()
    val result = sol.letterCombinations("23")
    println("$result")
}