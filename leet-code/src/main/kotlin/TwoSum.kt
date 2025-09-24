/*
 * Leet Code #1 - Two Sum
 *
 * Given an array of integers nums and an integer target, return the indices of the two numbers so that they sum to target.
 *
 * You can assume that there is exactly one solution, and you cannot use the same element twice.
 * You can return the indices in any order.
 */

/**
 * Loop variant - O(n²) [brute-force solution - junior/mid]
 */
fun twoSumExercise(list: List<Int>, target: Int): List<Int> {
    val indexedList = list.withIndex()

    for ((index, item) in indexedList) {
        for ((i, value) in indexedList) {
            if (index == i) continue

            if (value + item == target) {
                return listOf(minOf(index, i), maxOf(index, i))
            }
        }
    }

    return emptyList()
}

/**
 * HashMap variant - O(n) [ideal/better performance solution - senior]
 */
fun twoSumHashMapExercise(numbers: List<Int>, target: Int): List<Int> {
    val map = HashMap<Int, Int>()

    for ((index, number) in numbers.withIndex()) {
        val complement = target - number
        val complementIndex = map[complement]

        if (complementIndex != null) {
            return listOf(complementIndex, index)
        }

        map[number] = index
    }

    return emptyList()
}