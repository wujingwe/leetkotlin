package leetcode

/** https://leetcode.com/problems/excel-sheet-column-number/ */
class ExcelSheetColumnNumber {
    fun titleToNumber(s: String): Int {
        return s.fold(0) { sum, c -> sum * 26 + (c - 'A') + 1 }
    }
}

fun main(args: Array<String>) {
    val sol = ExcelSheetColumnNumber()
    println(sol.titleToNumber("A"))
    println(sol.titleToNumber("AB"))
    println(sol.titleToNumber("ZY"))
}