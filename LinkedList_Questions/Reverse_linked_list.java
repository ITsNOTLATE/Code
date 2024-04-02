package LinkedList_Questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Reverse_linked_list {
    public static void main(String[] args) {
      /*  Node<Integer> head = null;
        head.data = 10;
        Node<Integer> current = head;
        Node<Integer> prev = null;
        Node<Integer> next;
        if (head.data == null) {
            return;
        } else {
            while (current.next != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            head = current;
        }
*/
        //Merge two linkedList
        Node<Integer> head1=new Node<>();
        Node<Integer> head2=new Node<>();
        head1.data=10;
      /*  head1.next.data=20;
        head1.next.next.data=30;
        head1.next.next.next.data=40;
        head1.next.next.next.next.data=50;*/

        head2.data=11;
       /* head2.next.data=21;
        head2.next.next.data=31;
        head2.next.next.next.data=35;
        head2.next.next.next.next.data=45;*/

        Node<Integer> h1 = head1;
        Node<Integer> h2 = head2;
        if (h1 == null) {
            return;
        }
        if (h2 == null) {
            return;
        }
        Node<Integer> head3 = null;
/*
        if (h1.data > h2.data) {
            head3 = h2;
            h2 = h2.next;
        } else {
            head3 = h1;
            h1 = h1.next;
        }*/

        while (h1 != null && h2 != null) {
            if (h1.data > h2.data) {
                System.out.println(h2.data);
                head3 = h2;
                h2 = h2.next;

            } else {
                System.out.println(h1.data);
                head3 = h1;
                h1 = h1.next;

            }
            System.out.println(head3.data);
            head3 = head3.next;

        }
       /* if (head2 != null) {
            head3.next= head2;
        } else {
            head3.next = head1;
        }*/
        Node curr = head3;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}
