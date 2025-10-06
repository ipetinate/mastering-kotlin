import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class AddTwoNumbersTest {
    @Test
    fun `get properly sum from linked lists`() {
        val l1 = buildList(listOf(2, 4, 3));
        val l2 = buildList(listOf(5, 6, 4));

        val result = addTwoNumbers(l1, l2)

        assertEquals(listOf(7, 0, 8),result.toList())
    }

    @Test
    fun `sum of same length lists`() {
        val l1 = buildList(listOf(2, 3, 4))
        val l2 = buildList(listOf(5, 6, 4))

        val result = addTwoNumbers(l1, l2)

        assertEquals(listOf(7, 9, 8), result.toList())
    }

    @Test
    fun `sum with carry creating new node at end`() {
        val l1 = buildList(listOf(9, 9, 9))
        val l2 = buildList(listOf(1))

        val result = addTwoNumbers(l1, l2)

        assertEquals(listOf(0, 0, 0, 1), result.toList())
    }

    @Test
    fun `sum with different lengths`() {
        val l1 = buildList(listOf(2, 4, 3))
        val l2 = buildList(listOf(9, 5, 6, 4))

        val result = addTwoNumbers(l1, l2)

        assertEquals(listOf(1, 0, 0, 5), result.toList())
    }

    @Test
    fun `sum when one list is null`() {
        val l1 = buildList(listOf(5, 6, 7))
        val l2: ListNode? = null

        val result = addTwoNumbers(l1, l2)

        assertEquals(listOf(5, 6, 7), result.toList())
    }

    @Test
    fun `sum when both lists are null`() {
        val l1: ListNode? = null
        val l2: ListNode? = null

        val result = addTwoNumbers(l1, l2)

        assertEquals(emptyList(), result?.toList() ?: emptyList())
    }

    @Test
    fun `sum with carry propagating multiple times`() {
        val l1 = buildList(listOf(5, 9))
        val l2 = buildList(listOf(7))

        val result = addTwoNumbers(l1, l2)

        assertEquals(listOf(2, 0, 1), result.toList())
    }
}