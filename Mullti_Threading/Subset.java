package Mullti_Threading;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

public class Subset implements Callable<Void> {
    List<Integer> ls;
    int index;

    List<Integer> dp;
    Subset(List<Integer> ls,int ind){
            this.ls=ls;
            this.index=ind;
        ;    }
    @Override
    public Void call() throws Exception {

        if(index> ls.size()){

        }

        for (int i = 0; i < ls.size(); i++) {
            dp.set(i,-1);
        }
        ExecutorService executor= Executors.newCachedThreadPool();
        if(dp.get(index)==-1){
            Subset subset=new Subset(ls,index+1);
           executor.submit(subset);
        }

        return null;
    }
}
