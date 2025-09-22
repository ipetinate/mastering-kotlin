/*
 * Loop variant - O(n²)
 */
fun twoSumExercise(list: List<Number>, target: Number): List<Int> {
    var found = false
    var indexes: List<Int> = listOf();
    val indexedList = list.withIndex()

    for ((index, item) in indexedList) {
        for ((i, value) in indexedList) {
            if (index == i) continue

            val sum = value.toDouble() + item.toDouble()

            if (sum == target.toDouble()) {
                indexes = listOf(index, i)
                found = true
            }

            if (found) break
        }

        if (found) break
    }

    if (indexes.isNotEmpty()) {
        val sameIndexSum = indexes[0] == indexes[1]

        if (sameIndexSum) return listOf()
    }

    return indexes
}