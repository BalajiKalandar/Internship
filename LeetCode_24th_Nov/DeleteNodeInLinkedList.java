package com.java.timest;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class DeleteNodeInLinkedList {

    public void deleteNode(ListNode node) {
        if (node == null || node.next == null) {
            // Cannot delete the last node or null node
            return;
        }

        // Copy the value of the next node to the current node
        node.val = node.next.val;

        // Skip the next node
        node.next = node.next.next;
    }

    // Utility method to print the linked list
    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DeleteNodeInLinkedList solution = new DeleteNodeInLinkedList();

        // Example
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);

        System.out.println("Original List:");
        solution.printList(head);

        ListNode nodeToDelete = head.next; // Node with value 5 to be deleted

        // Delete the node
        solution.deleteNode(nodeToDelete);

        System.out.println("List after deleting node with value 5:");
        solution.printList(head);
    }
}
