package com.java.dec19Nov;

public class IntersectionOfTwoLinkedLists {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        // Example
        ListNode intersectedNode = new ListNode(8);

        ListNode listA = new ListNode(4);
        listA.next = new ListNode(1);
        listA.next.next = intersectedNode;
        listA.next.next.next = new ListNode(4);
        listA.next.next.next.next = new ListNode(5);

        ListNode listB = new ListNode(5);
        listB.next = new ListNode(6);
        listB.next.next = new ListNode(1);
        listB.next.next.next = intersectedNode;

        int skipA = 2;
        int skipB = 3;

        ListNode result = getIntersectionNode(listA, listB, skipA, skipB);

        if (result != null) {
            System.out.println("Intersected at '" + result.val + "'");
        } else {
            System.out.println("No intersection");
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB, int skipA, int skipB) {
        int lenA = length(headA);
        int lenB = length(headB);

        // Move pointers to align starting points
        while (skipA > 0) {
            headA = headA.next;
            skipA--;
        }

        while (skipB > 0) {
            headB = headB.next;
            skipB--;
        }

        // Move both pointers until they meet at the intersection node
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }

        return headA; // or headB, as they now point to the same node
    }

    private static int length(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }
}
