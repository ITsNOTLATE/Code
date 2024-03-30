package Mullti_Threading;

import jdk.dynalink.NoSuchDynamicMethodException;

public class Node {
   Node right;
    Node left;
    int data;

    Node(int d){
        this.data=d;
        this.left=null;
        this.right=null;
    }
}
