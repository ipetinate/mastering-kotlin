/**
 * A linked list is basically a sequence of nodes, where each node stores:
 *
 * • A value (val or var)
 * • A reference to the next node (or null if it's the last)
 */

class ListNode(var value: Int) {
    var next: ListNode? = null
}

fun ListNode?.toList(): List<Int> {
    var current: ListNode? = this
    val values: MutableList<Int> = mutableListOf()

    while (current != null) {
        values.add(current.value)
        current = current.next
    }

    return values
}

fun buildList(values: List<Int>): ListNode? {
    val dummy = ListNode(0)
    var current = dummy

    for (v in values) {
        current.next = ListNode(v)
        current = current.next!!
    }
    return dummy.next
}