package org.example;



import static java.lang.System.*;

public class MergeTwoSortedList_21 {
     ListNode head;
     ListNode temp;
    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null) {
           return l2;
        } if (l2 == null) {
            return l1;
        }

        // choose head smaller of ListNode from l1 & l2
        if (l1.val > l2.val){
            temp = head = new ListNode(l2.val);
            l2 = l2.next;
        }
        else {
            temp = head = new ListNode(l1.val);
            l1 = l1.next;
        }
        // Loop until l1 & l2 null
        while (l1 != null && l2 != null){
            if(l1.val < l2.val){
                temp.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            if(l1.val > l2.val){
                temp.next = new ListNode(l2.val);
                l2 = l2.next;
            }
        }
        // LOOP when l1 or l2 remaining;
        while (l1 != null){
            temp.next = new ListNode(l1.val);
            l1 = l1.next;
            temp = temp.next;
        }
        while (l2 != null){
            temp.next = new ListNode(l2.val);
            l2 = l2.next;
            temp = temp.next;
        }
        return head;
    }

      class ListNode {
        int val;
        ListNode next;
        ListNode(){
        };

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode addNode (int data){
        ListNode node = new ListNode(data);
        if( head == null){
            head = node;
            temp = node;
        }else {
            temp.next = node;
            temp = node;
        }
        return node;
    }
    public void displayNode(){
        ListNode current = head;
        if(head == null){
            out.println("List is empty!");
            return;
        }
        out.println("Add node to the end of the list");
        while(current != null){
            out.print(current.val + " ");
            current= current.next;
        }
        out.println();
    }


    public static void main(String[] args) {
        MergeTwoSortedList_21 l1 = new MergeTwoSortedList_21();
        l1.addNode(1);
        l1.addNode(3);
        l1.addNode(4);
        l1.
//        MergeTwoSortedList_21 l2 = new MergeTwoSortedList_21();
//        l2.displayNode();
//        MergeTwoSortedList_21 l3 = new MergeTwoSortedList_21();
//        l3.mergeTwoLists(l1.addNode(1),l2.addNode(2));
//        l3.displayNode();

    }
}

