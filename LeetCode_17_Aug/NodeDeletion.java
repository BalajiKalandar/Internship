package com.java.flipDailyQuestion;

import java.util.Iterator;
import java.util.LinkedList;


class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class NodeDeletion {

    public static void main(String[] args) {
        Node head=new Node(23);
        head.next=new Node(5);
        head.next.next=new Node(54);
        head.next.next.next=new Node(3);
        head.next.next.next.next=new Node(98);
        head.next.next.next.next.next=new Node(53);
//To print original list
        System.out.println("original list");
        printList(head);

        // Delete node with value 3
        DeleteNode(head.next.next.next.next);

// print after deletion
        printList(head);
    }

    public static void printList(Node head) {
        Node current = head;
        while(current!=null){
            System.out.print(current.value+" ");
            current=current.next;
        }
        System.out.println();
    }
    public static void DeleteNode(Node node){
        node.value=node.next.value;
        node.next=node.next.next;
    }
}

