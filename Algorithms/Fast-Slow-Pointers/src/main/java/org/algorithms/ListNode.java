package org.algorithms;

public class ListNode {

    final int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;

        // This loop will break is the cycle contains null, then we can assume there is not cycle
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            IO.println(slow.val + " Slow Pointer: " + slow);
            IO.println(fast.val + " Fast Pointer: " + fast);

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}

