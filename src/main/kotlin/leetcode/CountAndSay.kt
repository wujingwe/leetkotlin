package leetcode

/** https://leetcode.com/problems/count-and-say/ */
class CountAndSay {
    fun countAndSay(n: Int): String {
        if (n == 1) return "1"

        var n = n
        var str = "1"
        while (n > 1) {
            n--

            var index = 0
            val sb = StringBuilder()
            while (index < str.length) {
                val c = str[index]
                var count = 1
                while (index < str.length - 1 && str[index] == str[index + 1]) {
                    count++
                    index++
                }
                sb.append(count)
                sb.append(c)
                index++
            }
            str = sb.toString()
        }
        return str
    }
}

fun main(args: Array<String>) {
    val sol = CountAndSay()
    println(sol.countAndSay(1))
    println(sol.countAndSay(2))
    println(sol.countAndSay(3))
    println(sol.countAndSay(4))
    println(sol.countAndSay(5))
    println(sol.countAndSay(6))
}