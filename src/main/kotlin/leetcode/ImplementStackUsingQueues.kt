package leetcode

import java.util.*

/** https://leetcode.com/problems/implement-stack-using-queues/ */
class ImplementStackUsingQueues {
    /** Initialize your data structure here. */
    private var queue1 = LinkedList<Int>()

    /** Push element x onto stack. */
    fun push(x: Int) {
        queue1.add(x)
    }

    /** Removes the element on top of the stack and returns that element. */
    fun pop(): Int {
        val queue2 = LinkedList<Int>()
        val count = queue1.size - 1
        repeat(count) {
            queue2.add(queue1.pop())
        }
        val result = queue1.pop()
        queue1 = queue2
        return result
    }

    /** Get the top element. */
    fun top(): Int {
        val result = pop()
        queue1.add(result)
        return result
    }

    /** Returns whether the stack is empty. */
    fun empty(): Boolean {
        return queue1.isEmpty()
    }
}

fun main(args: Array<String>) {
    val sol = ImplementStackUsingQueues()
    sol.push(1)
    sol.push(2)
    println(sol.top())
    println(sol.pop())
    println(sol.empty())
}
