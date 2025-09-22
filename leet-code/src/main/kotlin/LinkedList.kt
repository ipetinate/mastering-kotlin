/**
 * A linked list is basically a sequence of nodes, where each node stores:
 *
 * • A value (val or var)
 * • A reference to the next node (or null if it's the last)
 */

class ListNode(var value: Int) {
    var next: ListNode? = null
}

fun readLinkedList(head: ListNode): MutableList<Int> {
    var current: ListNode? = head
    val values: MutableList<Int> = mutableListOf()

    while (current != null) {
        values.add(current.value)
        current = current.next
    }

    return values
}