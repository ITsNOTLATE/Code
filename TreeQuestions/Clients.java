package TreeQuestions;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Clients {
    void treverse(TreeNode root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        treverse(root.left);
        treverse(root.right);
    }
    int size(TreeNode node){
       if(node==null){
           return 0;
       }
       return size(node.left)+size(node.right)+1;
    }
    int sum(TreeNode node){
        if(node==null){
            return 0;
        }
        return sum(node.left)+sum(node.right)+node.data;
    }

    int height(TreeNode node){
        if(node==null){
            return 0;
        }
        return 1+Math.max(height(node.left),height(node.right));
    }

    void make_null(TreeNode temp){
        Queue<TreeNode> q=new LinkedList<>();
        q.add(temp);
        q.add(null);
        while(q.size()>=1){
            TreeNode node =q.peek();
            q.remove();
        if(node==null){
            System.out.println("null");
            q.remove();
        }
            else{
                System.out.println(node.data);

                if(node.left!=null){q.add(node.left);
                    if(node.right!=null){q.add(node.right);
            }
        }
    }
        }
        while(q.size()>0){
            System.out.println(q.peek().data);
            q.remove();
        }
    }

    void leftView(TreeNode root){
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            int size=q.size();

            for(int i=0;i<size;i++){
                TreeNode node =root;
                q.remove();
                if(i==0){
                    System.out.println(node.data);
                }
                if(root.left!=null){
                    q.add(node.left);
                }
                if(root.right!=null){
                    q.add(node.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        TreeNode left=new TreeNode(9);
        TreeNode right=new TreeNode(11);
        root.left=left;
        root.right=right;
        Clients client=new Clients();
        client.leftView(root);
    }
}
