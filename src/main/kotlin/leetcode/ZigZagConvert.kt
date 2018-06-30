package leetcode

/** https://leetcode.com/problems/zigzag-conversion/ */
class ZigZagConvert {
    fun convert(s: String, numRows: Int): String {
        if (s.isEmpty() || numRows == 1) {
            return s
        }

        val sb = StringBuilder()
        val range = numRows + (numRows - 2)
        for (i in 0 until numRows) {
            for (j in 0 until s.length) {
                if (j % range == i || j % range == (range - i)) {
                    sb.append(s[j])
                }
            }
        }
        return sb.toString()
    }
}

fun main(args: Array<String>) {
    val sol = ZigZagConvert()
    println(sol.convert("PAYPALISHIRING", 3)) // PAHNAPLSIIGYIR
    println(sol.convert("PAYPALISHIRING", 4)) // PINALSIGYAHRPI
    println(sol.convert("A", 1))
}