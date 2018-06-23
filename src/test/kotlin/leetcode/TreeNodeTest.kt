package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import java.io.File
import java.io.PrintStream

class TreeNodeTest {

    @Test
    fun `Create TreeNodes`() {
        val head = createTreeNodes(1, 2, null, 3, null, 4, null, 5)
        assertThat(head.`val`).isEqualTo(1)
        assertThat(head.left?.`val`).isEqualTo(2)
        assertThat(head.right).isNull()
        assertThat(head.left?.left?.`val`).isEqualTo(3)
        assertThat(head.left?.right).isNull()
        assertThat(head.left?.left?.left?.`val`).isEqualTo(4)
        assertThat(head.left?.left?.right).isNull()
        assertThat(head.left?.left?.left?.left?.`val`).isEqualTo(5)
        assertThat(head.left?.left?.left?.right).isNull()
    }

    @Test
    fun `Print TreeNodes`() {
        System.setOut(PrintStream("result.txt"))
        printTreeNode(createTreeNodes(1, 2, null, 3, null, 4, null, 5))

        val file = File("result.txt")
        assertThat(file.readText()).isEqualTo("1, 2, null, 3, null, 4, null, 5")
    }
}
