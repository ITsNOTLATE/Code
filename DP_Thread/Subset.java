package DP_Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class Subset implements Callable<Integer> {
    int[] arr;
    int ind;

    public Subset(int[] arr, int index) {
        this.arr = arr;
        this.ind = index;
    }

    @Override
    public Integer call() throws Exception {
        if (ind >= arr.length) {
            return arr[ind];
        }
        ExecutorService executorService = Executors.newCachedThreadPool();
        Subset subset_left = new Subset(arr, ind + 1);
        executorService.submit(subset_left);
        Future<Integer> ans_left = executorService.submit(subset_left);
        Subset subset_right = new Subset(arr, ind + 2);
        Future<Integer> ans_right = executorService.submit(subset_right);

        int a = ans_left.get();
        int b = ans_right.get();

        return arr[ind] + Math.max(a, b);
    }
}
