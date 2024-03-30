package LinkedList_Questions;

import java.util.LinkedHashSet;

public abstract class Impl_Linked_list implements LinkedList{


    Node<Integer> node=new Node<Integer>(8);

    public abstract <K> int letsgo();


    public <K> void add(Node node, K value) {
        Node head=node;
        Node<K> newNode=new Node<K>(value);
        while(head.next!=null){
            head=head.next;
        }
        head.next=newNode;
        head=newNode;
        head.next=null;
    }


    public int size(Node node) {
        Node head =null;
        if(head==null){
            return 0;
        }
        int count=0;
        while(head.next!=null){
            head=head.next;
            count++;
        }
        return  count;
    }

    @Override
    public <K, T> void add(T node, K value) {
        LinkedHashSet<Integer> hs=new LinkedHashSet<>();
        hs.add(1);
    }

    @Override
    public <T> int size(T node) {
        return 0;
    }
}
