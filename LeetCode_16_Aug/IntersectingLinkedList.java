package com.java.flipDailyQuestion;

class LinkNode {
    int value;
    LinkNode next;

    LinkNode(int value) {
        this.value = value;
        this.next = null;
    }

}
    class IntersectionOfLinedLists{
    public LinkNode getIntersectionNode(LinkNode headA,LinkNode headB){
        // calculate the length of both linked lists
        int lenA=length(headA);
        int lenB=length(headB);

        // Move pointer of the longer list ahead by the difference in lengths
        while(lenA>lenB){
            headA=headA.next;
            lenA--;
        }
        while(lenB>lenA){
            headB=headB.next;
            lenB--;
        }
// Traverse both lists until they interest or reach the end
        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
// Return the intersected node (or null if no intersection)
        return headA;
    }

    // function to calculate the length of a linked list
        private int length (LinkNode head){
        int len=0;
        while(head!=null){
            len++;
            head=head.next;
        }
        return len;
        }

}

