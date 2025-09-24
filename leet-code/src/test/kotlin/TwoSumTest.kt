import kotlin.test.Test
import kotlin.test.assertEquals

class TwoSumTest {
    @Test
    fun `target is 5 and indexes should be 1 and 3`() {
        val list: List<Int> = listOf(0, 2, 7, 3, 9, 8)

        val result = twoSumExercise(list, 5)

        assertEquals(result, listOf(1, 3))
    }

    @Test
    fun `return first ocurrence when have more than one pairs`() {
        val list: List<Int> = listOf(1, 4, 2, 3)

        val result = twoSumExercise(list, 5)

        assertEquals(result, listOf(0, 1))
    }

    @Test
    fun `should works with negative numbers`() {
        val list: List<Int> = listOf(-1, 6, 2, 3)

        val result = twoSumExercise(list, 5)

        assertEquals(result, listOf(0, 1))
    }

    @Test
    fun `empty lists should returns a empty list`() {
        val list: List<Int> = listOf()

        val result = twoSumExercise(list, 5)

        assertEquals(result, null)
    }

    @Test
    fun `inexistent target should return a empty list`() {
        val list: List<Int> = listOf(1, 2, 3, 4, 5)

        val result = twoSumExercise(list, 11)

        assertEquals(result, null)
    }

    @Test
    fun `list with one item should returns empty`() {
        val list: List<Int> = listOf(1)

        val result = twoSumExercise(list, 5)

        assertEquals(result, null)
    }

    @Test
    fun `should return empty if the sum use same index`() {
        val list: List<Int> = listOf(1, 2, 3)

        val result = twoSumExercise(list, 6)

        assertEquals(result, null)
    }

    @Test
    fun `entire list with same number should return first pair`() {
        val list: List<Int> = listOf(2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2)

        val result = twoSumExercise(list, 4)

        assertEquals(result, listOf(0, 1))
    }

    @Test
    fun `impossible negative target`() {
        val list: List<Int> = listOf(-10, -5, -3)

        val result = twoSumExercise(list, -1)

        assertEquals(result, null)
    }

    @Test
    fun `HashMap - target is 5 and indexes should be 1 and 3`() {
        val list: List<Int> = listOf(0, 2, 7, 3, 9, 8)

        val result = twoSumHashMapExercise(list, 5)

        assertEquals(result, listOf(1, 3))
    }

    @Test
    fun `HashMap - return first ocurrence when have more than one pairs`() {
        val list: List<Int> = listOf(1, 4, 2, 3)

        val result = twoSumHashMapExercise(list, 5)

        assertEquals(result, listOf(0, 1))
    }

    @Test
    fun `HashMap - should works with negative numbers`() {
        val list: List<Int> = listOf(-1, 6, 2, 3)

        val result = twoSumHashMapExercise(list, 5)

        assertEquals(result, listOf(0, 1))
    }

    @Test
    fun `HashMap - empty lists should returns a empty list`() {
        val list: List<Int> = listOf()

        val result = twoSumHashMapExercise(list, 5)

        assertEquals(result, null)
    }

    @Test
    fun `HashMap - inexistent target should return a empty list`() {
        val list: List<Int> = listOf(1, 2, 3, 4, 5)

        val result = twoSumHashMapExercise(list, 11)

        assertEquals(result, null)
    }

    @Test
    fun `HashMap - list with one item should returns empty`() {
        val list: List<Int> = listOf(1)

        val result = twoSumHashMapExercise(list, 5)

        assertEquals(result, null)
    }

    @Test
    fun `HashMap - should return empty if the sum use same index`() {
        val list: List<Int> = listOf(1, 2, 3)

        val result = twoSumHashMapExercise(list, 6)

        assertEquals(result, null)
    }

    @Test
    fun `HashMap - entire list with same number should return first pair`() {
        val list: List<Int> = listOf(2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2)

        val result = twoSumHashMapExercise(list, 4)

        assertEquals(result, listOf(0, 1))
    }

    @Test
    fun `HashMap - impossible negative target`() {
        val list: List<Int> = listOf(-10, -5, -3)

        val result = twoSumHashMapExercise(list, -1)

        assertEquals(result, null)
    }
}