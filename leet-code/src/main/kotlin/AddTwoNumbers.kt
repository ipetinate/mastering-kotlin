/*
 * Leet Code #2 - Add Two Numbers
 *
 * You are given two linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each node contains a single digit.
 * Add the two numbers and return the result as a linked list.
 */

/**
 * AddTwoNumbers exercise
 */
fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    var p = l1
    var q = l2
    var carry = 0

    val dummyHead = ListNode(0)
    var current = dummyHead

    while (p != null || q != null || carry != 0) {
        val x = p?.value ?: 0
        val y = q?.value ?: 0
        val sum = x + y + carry

        carry = sum / 10
        val newDigit = sum % 10

        current.next = ListNode(newDigit)
        current = current.next!!

        p = p?.next
        q = q?.next
    }

    return dummyHead.next
}