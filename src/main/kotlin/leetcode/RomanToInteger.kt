package leetcode

/** https://leetcode.com/problems/roman-to-integer/ */
class RomanToInteger {
    fun romanToInt(s: String): Int {
        var sum = 0
        var iInFront = false
        var xInFront = false
        var cInFront = false

        for (c in s) {
            when (c) {
                'I' -> {
                    sum += 1
                    iInFront = true
                }
                'V' -> {
                    sum += 5
                    if (iInFront) { sum -= 2 }
                    iInFront = false
                }
                'X' -> {
                    sum += 10
                    if (iInFront) { sum -= 2 }
                    iInFront = false
                    xInFront = true
                }
                'L' -> {
                    sum += 50
                    if (xInFront) { sum -= 20 }
                    xInFront = false
                }
                'C' -> {
                    sum += 100
                    if (xInFront) { sum -= 20 }
                    xInFront = false
                    cInFront = true
                }
                'D' -> {
                    sum += 500
                    if (cInFront) { sum -= 200 }
                    cInFront = false
                }
                'M' -> {
                    sum += 1000
                    if (cInFront) { sum -= 200 }
                    cInFront = false
                }
            }
        }
        return sum
    }
}

fun main(args: Array<String>) {
    val sol = RomanToInteger()
    println(sol.romanToInt("III"))
    println(sol.romanToInt("IV"))
    println(sol.romanToInt("IX"))
    println(sol.romanToInt("LVIII"))
    println(sol.romanToInt("MCMXCIV"))
}
