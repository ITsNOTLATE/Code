package LinkedList_Questions;

public class Basic_understanding {


    public static void main(String[] args) {
        Node<Integer> one = new Node<>();
        Node<Integer> two = new Node<>();
        TreeNode first = new TreeNode(12);
        TreeNode second = new TreeNode(13);
        first.right = second;
        second.left = first;
        one.data = 10;
        two.data = 20;
        one.next = two;
        two.next = one;
        System.out.println("how many nodes");
        int n = 0;
        Node<Integer> head=null;

        while(n<=6){
            Node<Integer> newNode =new Node<>();
            newNode.data=n;
            if(head==null){
                head=newNode;
            }else{
                Node<Integer> curr=new Node<>();
                curr=head;
                while(curr!=null){
                    curr=curr.next;
                }
                curr=newNode;
            }
            n++;
        }
        Node<Integer> cu=new Node<>();
        cu=head;
        while (cu!=null){
            System.out.println(cu.data);
            cu=cu.next;
        }
        TreeNode treeNode=new TreeNode(18);
        TreeNode treeNode1=new TreeNode(14);
        TreeNode treeNode2 =null;


    }
}
