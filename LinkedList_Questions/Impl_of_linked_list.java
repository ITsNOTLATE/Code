package LinkedList_Questions;

import javax.sound.midi.Soundbank;

public class Impl_of_linked_list {
    public static void main(String[] args) {
        /*Node node=new Node(1);
        Node node2=new Node(2);
        Node node3=new Node(3);
        Node node4=new Node(4);
        Node node5=new Node(5);
        node.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        Node current=node;
        Node node21=new Node(1);
        Node node22=new Node(2);
        Node node23=new Node(3);
        Node node24=new Node(4);
        Node node25=new Node(5);
        node21.next=node22;
        node22.next=node23;
        node23.next=node24;
        node24.next=node25;
        Node current2=node22;
        while(current!=null){
            System.out.print(current.data +"->");
            current=current.next;
        }
        System.out.println();
        *//*now reverse the linked list*//*

        Node temp=null;

        current=node;

        while(current.next!=null){

            Node next=current.next;
            current.next=temp;
            temp=current;
            current=next;
        }
        current.next = temp;

       Node head=current;

        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
        current.next=temp;
        Node thirdNode=null;
        Node pointing=thirdNode;
        while(current!=null&&current2!=null){
            int c2=(int)current2.data;
            int c1=(int)current.data;
            if(pointing==null){

                if(c1>=c2){
                    pointing.next=current2;
                    pointing=pointing.next;
                }
            }else{
                if(c1>=c2){
                    pointing.next=current2;
                    pointing=pointing.next;
                }else{
                    pointing.next=current2;
                    pointing=pointing.next;
                }
            }
        }
*/
    }
}
