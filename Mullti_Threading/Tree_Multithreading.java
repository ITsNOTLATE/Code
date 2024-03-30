package Mullti_Threading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Tree_Multithreading implements Callable<Integer> {


    Node root;

    Tree_Multithreading(Node root){
        this.root=root;
    }
    @Override
    public Integer call() throws Exception {
        if (root == null) {
            return 0;
        }
        ExecutorService executorService = Executors.newCachedThreadPool();
        Tree_Multithreading lefttreeMultithreading = new Tree_Multithreading(root.left);
        Future<Integer> futureleft = executorService.submit(lefttreeMultithreading);
        Tree_Multithreading righttreeMultithreading = new Tree_Multithreading(root.right);
        Future<Integer> futureright = executorService.submit(righttreeMultithreading);
        int left = futureleft.get();
        int right = futureright.get();
        return left + right;
    }}
