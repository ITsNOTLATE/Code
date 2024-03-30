package Mullti_Threading;

import java.util.List;
import java.util.concurrent.Callable;

public class QuickSort implements Callable<List<Integer>> {

    List<Integer> ls;

    QuickSort(List<Integer> ls){
        this.ls=ls;
    }
    @Override
    public List<Integer> call() throws Exception {
        if(ls.size()==1){
            return ls;
        }
        int j=0;
        int x=ls.size();
        for (int i = 0; i < ls.size(); i++) {
            if(x>ls.get(i)){
                int temp=ls.get(i);
                ls.set(i,ls.get(j));
                ls.set(j,temp);
                j++;
            }
        }

        int temp=ls.get(ls.size());
        ls.set(ls.size(),ls.get(j));
        ls.set(j,temp);
        int p=j+1;
        // have object of two list right and left
        for (int i = 0; i < p; i++) {

        }

        return null;
    }
}
