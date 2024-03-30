package Mullti_Threading;

import javax.swing.event.ListDataEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Mergesort implements Callable<List<Integer>> {
    List<Integer> arr;

    Mergesort(List<Integer> arr){
        this.arr=arr;
    }
    @Override
    public List<Integer> call() throws Exception {

        if(arr.size()<=1){
            return arr;
        }
        List<Integer> leftSide=new ArrayList<>();
        List<Integer> righttSide=new ArrayList<>();
        int mid=arr.size()/2;
        for (int i = 0; i < mid; i++) {
            leftSide.add(arr.get(i));
        }
        for (int i = mid; i < arr.size(); i++) {
            leftSide.add(arr.get(i));
        }
        ExecutorService executors= Executors.newCachedThreadPool();
        
        Mergesort mergesortleft=new Mergesort(leftSide);
        Future<List<Integer>> leftFuture=executors.submit(mergesortleft);
        List<Integer> lsleft=leftFuture.get();
        Mergesort mergesortright=new Mergesort(righttSide);
        Future<List<Integer>> rightFuture=executors.submit(mergesortright);
        List<Integer> lsright=rightFuture.get();

        List<Integer> finalList=new ArrayList<>();
        int i=0;
       int j=0;

        while(i<lsleft.size()&& j<lsright.size()){
            if(lsleft.get(i)>lsright.get(j)){
                finalList.add(lsright.get(j));
            }else {
                finalList.add(lsleft.get(i));
            }
        }
        while (i<lsleft.size()){
            finalList.add(lsleft.get(i));
        }
        while (j<lsright.size()){
            finalList.add(lsright.get(i));
        }

        return finalList;
    }
}

