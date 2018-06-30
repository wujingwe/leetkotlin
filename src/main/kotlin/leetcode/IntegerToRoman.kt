package leetcode

class IntegerToRoman {
    fun intToRoman(num: Int): String {
        val sb = StringBuilder()
        var num = num
        if (num >= 1000) { // M
            sb.append(singleDigitToRoman(num / 1000, 'M'))
            num %= 1000
        }
        if (num >= 900) {
            sb.append("CM")
            num -= 900
        }
        if (num >= 500) { // D
            sb.append(singleDigitToRoman(num / 500, 'D'))
            num %= 500
        }
        if (num >= 400) {
            sb.append("CD")
            num -= 400
        }
        if (num >= 100) { // C
            sb.append(singleDigitToRoman(num / 100, 'C'))
            num %= 100
        }
        if (num >= 90) {
            sb.append("XC")
            num -= 90
        }
        if (num >= 50) { // L
            sb.append(singleDigitToRoman(num / 50, 'L'))
            num %= 50
        }
        if (num >= 40) {
            sb.append("XL")
            num -= 40
        }
        if (num >= 10) { // X
            sb.append(singleDigitToRoman(num / 10, 'X'))
            num %= 10
        }
        if (num >= 9) {
            sb.append("IX")
            num -= 9
        }
        if (num >= 5) { // V
            sb.append(singleDigitToRoman(num / 5, 'V'))
            num %= 5
        }
        if (num >= 4) {
            sb.append("IV")
            num -= 4
        }
        if (num >= 1) { // I
            sb.append(singleDigitToRoman(num, 'I'))
        }
        return sb.toString()
    }

    private fun singleDigitToRoman(num: Int, unit: Char): String {
        val sb = StringBuilder()
        return when {
            num < 4 -> {
                for (i in 0 until num) {
                    sb.append("$unit")
                }
                sb.toString()
            }
            else -> { // num > 4
                sb.append("V")
                for (i in 0 until num - 5) {
                    sb.append("$unit")
                }
                sb.toString()
            }
        }
    }
}

fun main(args: Array<String>) {
    val sol = IntegerToRoman()
    println(sol.intToRoman(3))
    println(sol.intToRoman(4))
    println(sol.intToRoman(9))
    println(sol.intToRoman(58))
    println(sol.intToRoman(1994))
}
