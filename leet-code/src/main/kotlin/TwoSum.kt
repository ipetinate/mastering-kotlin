/*
 * Loop variant - O(n²)
 */
fun twoSumExercise(list: List<Number>, target: Number): List<Int> {
    val indexedList = list.withIndex()

    for ((index, item) in indexedList) {
        for ((i, value) in indexedList) {
            if (index == i) continue

            val sum = value.toDouble() + item.toDouble()

            if (sum == target.toDouble()) {
                return listOf(index, i)
            }
        }
    }

    return listOf()
}