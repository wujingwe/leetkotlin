package leetcode

/** https://leetcode.com/problems/min-stack/ */
class MinStack {
    private var element: Element? = null

    fun push(x: Int) {
        element = if (element == null) {
            Element(x)
        } else {
            Element(x, element)
        }
    }

    fun pop() {
        element = element?.prev
    }

    fun top(): Int {
        return element!!.value
    }

    fun getMin(): Int {
        return element!!.min
    }

    class Element(val value: Int, val prev: Element? = null) {
        val min: Int = Math.min(value, prev?.min ?: Int.MAX_VALUE)
    }
}

fun main(args: Array<String>) {
    val sol = MinStack()
    sol.push(-2)
    sol.push(0)
    sol.push(-3)
    println(sol.getMin())
    sol.pop()
    println(sol.top())
    println(sol.getMin())
}
