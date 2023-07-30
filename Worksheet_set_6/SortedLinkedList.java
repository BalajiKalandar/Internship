package com.java.SixthAssignement;


class Node {
	int data;
	Node next;
	
	public Node(int data) {
		this.data=data;
		this.next=null;
	}
}

class LinkedList1 {
	Node head;
	public LinkedList1() {
		head=null;
		}
	public void insertSorted(int data) {
		Node newNode= new Node(data);
		// if the lists is empty of the new node data is smaller than the current head data,
		// make new node the head and point it to the old head.
		if(head==null||data<head.data) {
			newNode.next=head;
			head=newNode;
		}
		else {
			// find teh porpoer position to insert the new node while maintaining the insertion order.
			Node current=head;
			while(current.next!=null&&current.next.data<data) {
				current=current.next;
			}
			newNode.next=current.next;
			current.next=newNode;
		}
	}
	
	public void display() {
		Node current =head;
		while(current!=null) {
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println("");
	}
}
public class SortedLinkedList {
	public static void main(String[] args) {
		LinkedList1 linkedlist = new LinkedList1();
		
		//Add elements one by one
		linkedlist.insertSorted(10);
		linkedlist.insertSorted(5);
		linkedlist.insertSorted(20);
		linkedlist.insertSorted(15);
		linkedlist.insertSorted(25);
		
		// Display the sorted list
		linkedlist.display();
	}
	
}