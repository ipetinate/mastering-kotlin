/*
 * Loop variant - O(n²)
 */
fun twoSumExercise(list: List<Number>, target: Number): List<Int> {
    val indexedList = list.withIndex().sortedBy() {
        it.index
    }

    for ((index, item) in indexedList) {
        for ((i, value) in indexedList) {
            if (index == i) continue

            val sum = value.toDouble() + item.toDouble()

            if (sum == target.toDouble()) {
                return listOf(minOf(index, i), maxOf(index, i))
            }
        }
    }

    return emptyList()
}