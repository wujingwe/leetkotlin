package leetcode

/** https://leetcode.com/problems/simplify-path/ */
class SimplifyPath {
    fun simplifyPath(path: String): String {
        val tokens = path.split('/')
        val list = mutableListOf<String>()

        for (token in tokens) {
            if (token.isEmpty()) continue

            when (token) {
                "." -> {}
                ".." -> { if (list.isNotEmpty()) { list.removeAt(list.lastIndex) } }
                else -> { list.add(token) }
            }
        }

        return if (list.isEmpty()) {
            "/"
        } else {
            val sb = StringBuilder()
            for (s in list) {
                sb.append("/$s")
            }
            sb.toString()
        }
    }
}

fun main(args: Array<String>) {
    val sol = SimplifyPath()
    println(sol.simplifyPath("/home/"))
    println(sol.simplifyPath("/a/./b/../../c/"))
    println(sol.simplifyPath("/../"))
    println(sol.simplifyPath("/"))
    println(sol.simplifyPath("/home//foo/"))
}
