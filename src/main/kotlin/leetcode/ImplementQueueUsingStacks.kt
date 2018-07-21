package leetcode

import java.util.*

/** https://leetcode.com/problems/implement-queue-using-stacks/ */
class ImplementQueueUsingStacks {
    /** Initialize your data structure here. */
    private val stack1 = Stack<Int>()
    private val stack2 = Stack<Int>()

    /** Push element x to the back of queue. */
    fun push(x: Int) {
        stack2.push(x)
    }

    /** Removes the element from in front of queue and returns that element. */
    fun pop(): Int {
        if (stack1.isEmpty()) {
            while (stack2.isNotEmpty()) {
                stack1.push(stack2.pop())
            }
        }
        return stack1.pop()
    }

    /** Get the front element. */
    fun peek(): Int {
        if (stack1.isEmpty()) {
            while (stack2.isNotEmpty()) {
                stack1.push(stack2.pop())
            }
        }
        return stack1.peek()
    }

    /** Returns whether the queue is empty. */
    fun empty(): Boolean {
        return stack1.isEmpty() && stack2.isEmpty()
    }
}

fun main(args: Array<String>) {
    val sol = ImplementQueueUsingStacks()
    sol.push(1)
    sol.push(2)
    println(sol.peek())
    println(sol.pop())
    println(sol.empty())
}
