package org.example.MergeTwoSortedList_21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

//   public static Node newNode(int key){
//       return new Node(key);
//   }

    public static void main(String[] args) {
        Node a = new Node(5);
        a.next = new Node(10);
        a.next.next = new Node(15);

        Node b = new Node(2);
        b.next = new Node(3);
        b.next.next = new Node(20);

        List<Integer> v = new ArrayList<>();
        while (a != null){
            v.add(a.val);
            a = a.next;
        }
        while (b != null){
            v.add(b.val);
            b = b.next;
        }
        Collections.sort(v);
        System.out.println(v);
        Node result = new Node(-1);
        Node temp = result;
        for(int i = 0 ; i < v.size(); i++){
            result.next = new Node(v.get(i));
            result = result.next;
        }
        temp = temp.next;
        System.out.println("Result Linked Node");
        while(temp != null){
            System.out.println(temp.val + " ");
            temp = temp.next;
        }
    }
}
