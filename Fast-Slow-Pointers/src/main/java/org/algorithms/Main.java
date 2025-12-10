package org.algorithms;

public class Main {
    static void main() {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next.next.next.next.next = new ListNode(10);
        head.next.next.next.next.next.next.next.next.next.next = new ListNode(11);
        head.next.next.next.next.next.next.next.next.next.next.next = new ListNode(12);
        head.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(13);
        head.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(14);
        head.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(15);
        head.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(16);

        // Create a cycle: point node 16 back to node 6
        head.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = head.next.next.next.next.next;

        IO.println(ListNode.hasCycle(head)); // Will print true
    }
}