package com.java.dec16;

class ListNode_1{
	int data;
	ListNode_1 next;
	ListNode_1(int data){
		this.data=data;
		this.next=null;
	}
}
public class ReverseLinkedList {

	public static ListNode_1 reverseList(ListNode_1 head) {
		if(head==null || head.next==null) {
			return head;
		}
		ListNode_1 reversedList=reverseList(head.next);
		
		head.next.next=head;
		head.next=null;
		
		
		return reversedList;
		
	}
	public static void main(String[]args) {
		ListNode_1 head=new ListNode_1(1);
		head.next=new ListNode_1(2);
		head.next.next=new ListNode_1(3);
		head.next.next.next=new ListNode_1(4);
		head.next.next.next.next=new ListNode_1(5);
		ListNode_1 reversedList=reverseList(head);
		
		while(reversedList!=null) {
			System.out.println(reversedList.data+"->");
			reversedList=reversedList.next;
		}
	}
}
