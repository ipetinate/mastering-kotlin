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

        assertEquals(first.toList(), mutableListOf(3, 5, 7))
    }

    @Test
    fun `build  linked list from list`() {
        val list = listOf<Int>(2, 4, 3)
        val linkedList = buildList(list)

        assertEquals(2, linkedList?.value)
        assertEquals(4, linkedList?.next?.value)
        assertEquals(3, linkedList?.next?.next?.value)
        assertEquals(list, linkedList.toList())
    }
}