import kotlin.test.Test
import kotlin.test.assertEquals

class LinkedListTest {
    @Test
    fun `should return all values from nodes`() {

        val first = ListNode(3)
        val second = ListNode(5)
        val third = ListNode(7)

        first.next = second
        second.next = third

        val head = first

        val result = readLinkedList(head)

        assertEquals(result, mutableListOf(3, 5, 7))
    }
}